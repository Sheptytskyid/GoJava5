package gojava.module11.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.stream.Collectors;

public class TextFileOperations {

    private static TextFileOperations fileWithSampleText;
    private File textFile;

    private TextFileOperations() {
        makeEmptyTextFile("Source.txt");
        fillFileWithSampleText();
    }

    public static synchronized TextFileOperations getInstance() {
        if (fileWithSampleText == null) {
            fileWithSampleText = new TextFileOperations();
        }
        return fileWithSampleText;
    }

    private void makeEmptyTextFile(String fileName) {
        textFile = new File(fileName);
        try {
            if (!textFile.createNewFile()) {
                new PrintWriter(fileName).close();
            }
        } catch (IOException e) {
            System.out.println("Error creating file!");
        }
    }

    private void fillFileWithSampleText() {
        try (PrintWriter fileWriter = new PrintWriter(new FileWriter(textFile))) {
            fileWriter.println("This is the initial text line 1");
            fileWriter.println("This is the initial text line 2");
        } catch (IOException e) {
            System.out.println("Error initialising file!");
        }
    }

    public File fileContentsReplacer(Map<String, String> wordsToReplace) {
        String outputString = replacer(wordsToReplace);
        return writeContentsToFile(outputString, false);

    }

    public File fileContentsMerge(Map<String, String> wordsToReplace) {
        String outputString = replacer(wordsToReplace);
        return writeContentsToFile(outputString, true);
    }

    public String readFileContentsToString() {
        StringBuilder outputString = new StringBuilder();
        try (BufferedReader bufferedFileReader = new BufferedReader(new FileReader(textFile))) {
            outputString.append(bufferedFileReader.lines().collect(Collectors.joining(System.lineSeparator())));
        } catch (IOException e) {
            System.out.println("Error reading file!");
        }
        return outputString.toString();
    }

    public String replacer(Map<String, String> wordsToReplace) {
        String outputString = readFileContentsToString();
        for (Map.Entry<String, String> entry : wordsToReplace.entrySet()) {
            outputString = outputString.replaceAll(entry.getKey(), entry.getValue());
        }
        return outputString;
    }

    public File writeContentsToFile(String contents, boolean append) {
        try (BufferedWriter bufferedFileWriter = new BufferedWriter(new FileWriter(textFile, append))) {
            bufferedFileWriter.write(contents);
            bufferedFileWriter.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
        return textFile;
    }

    public int checkWord(String word) {
        return readFileContentsToString().split(word).length - 1;
    }


    public String readFileContentsToStringJava6() throws IOException {
        StringBuilder outputString = new StringBuilder();
        String textLine;
        BufferedReader bufferedFileReader = null;
        try {
            bufferedFileReader = new BufferedReader(new FileReader(textFile));
            while ((textLine = bufferedFileReader.readLine()) != null) {
                outputString.append(textLine);
                outputString.append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error reading file!");
        } finally {
            if (bufferedFileReader != null) {
                bufferedFileReader.close();
            }
        }
        return outputString.toString();
    }
}
