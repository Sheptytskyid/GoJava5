package gojava.module11.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class TextFileOperations {

    private static TextFileOperations fileWithSampleText;
    private File textFile;

    private TextFileOperations() throws IOException {
        makeEmptyTextFile("Source.txt");
        fillFileWithSampleText();
    }

    public static synchronized TextFileOperations getInstance() throws IOException {
        if (fileWithSampleText == null) {
            fileWithSampleText = new TextFileOperations();
        }
        return fileWithSampleText;
    }

    private void makeEmptyTextFile(String fileName) throws IOException {
        textFile = new File(fileName);
        try {
            if (!textFile.createNewFile()) {
                new PrintWriter(fileName).close();
            }
        } catch (IOException e) {
            throw new IOException("Error while creating file!", e);
        }
    }

    private void fillFileWithSampleText() throws IOException {
        try (PrintWriter fileWriter = new PrintWriter(new FileWriter(textFile))) {
            fileWriter.println("This is the initial text line 1");
            fileWriter.println("This is the initial text line 2");
        } catch (IOException e) {
            throw new IOException("Error while initialising file!", e);
        }
    }

    public String replacer(Map<String, String> wordsToReplace) throws IOException {
        String outputString = readFileContentsToString();
        for (Map.Entry<String, String> entry : wordsToReplace.entrySet()) {
            outputString = outputString.replaceAll(entry.getKey(), entry.getValue());
        }
        return outputString;
    }

    public File fileContentsReplacer(Map<String, String> wordsToReplace) throws IOException {
        String outputString = replacer(wordsToReplace);
        return writeContentsToFile(outputString, false);

    }

    public File fileContentsMerge(Map<String, String> wordsToReplace) throws IOException {
        String outputString = replacer(wordsToReplace);
        return writeContentsToFile(outputString, true);
    }

    public int checkWord(String word) throws IOException {
        return readFileContentsToString().split(word).length - 1;
    }

    public File writeContentsToFile(String contents, boolean append) throws IOException {
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(textFile, append))) {
            fileWriter.write(contents);
            fileWriter.newLine();
        }
        return textFile;
    }

    public String readFileContentsToString() throws IOException {
        String outputString = "";
        String textLine;
        try (BufferedReader fileReader = new BufferedReader(new FileReader(textFile))) {
            while ((textLine = fileReader.readLine()) != null) {
                outputString += textLine + System.lineSeparator();
            }
            outputString = outputString.trim();
        } catch (IOException e) {
            throw new IOException("Error while reading file!", e);
        }
        return outputString;
    }


    public String readFileContentsToStringJava6() throws IOException {
        String outputString = "";
        String textLine;
        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader(textFile));
            while ((textLine = fileReader.readLine()) != null) {
                outputString += textLine + System.lineSeparator();
            }
        } catch (IOException e) {
            throw new IOException("Error while reading file!", e);
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
        return outputString;
    }
}
