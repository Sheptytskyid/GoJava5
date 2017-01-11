package gojava.module11.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class TextFileUtils {

    public static File createEmptyTextFile(String fileName) throws IOException {
        File file = new File(fileName);
        try {
            if (!file.createNewFile()) {
                new PrintWriter(fileName).close();
            }
        } catch (IOException e) {
            throw new IOException("Error while creating file!", e);
        }
        return file;
    }

    public static void fillFileWithSampleText(File file) throws IOException {
        try (PrintWriter fileWriter = new PrintWriter(new FileWriter(file))) {
            fileWriter.println("This is the initial text line 1");
            fileWriter.println("This is the initial text line 2");
        } catch (IOException e) {
            throw new IOException("Error while initialising file!", e);
        }
    }

    public static String replacer(Map<String, String> wordsToReplace, File file) throws IOException {
        String outputString = readFileContentsToString(file);
        for (Map.Entry<String, String> entry : wordsToReplace.entrySet()) {
            outputString = outputString.replaceAll(entry.getKey(), entry.getValue());
        }
        return outputString;
    }

    public static File fileContentsReplacer(Map<String, String> wordsToReplace, File file) throws IOException {
        String outputString = replacer(wordsToReplace, file);
        return writeContentsToFile(outputString, file, false);

    }

    public static File fileContentsMerge(Map<String, String> wordsToReplace, File file) throws IOException {
        String outputString = replacer(wordsToReplace, file);
        return writeContentsToFile(outputString, file, true);
    }

    public static int checkWord(String word, File file) throws IOException {
        return readFileContentsToString(file).split(word).length - 1;
    }

    public static File writeContentsToFile(String contents, File file, boolean append) throws IOException {
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, append))) {
            fileWriter.write(contents);
            fileWriter.newLine();
        } catch (IOException e) {
            throw new IOException("Error while writing to file!", e);
        }
        return file;
    }

    public static String readFileContentsToString(File file) throws IOException {
        String outputString = "";
        String textLine;
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            while ((textLine = fileReader.readLine()) != null) {
                outputString += textLine + System.lineSeparator();
            }
            outputString = outputString.trim();
        } catch (IOException e) {
            throw new IOException("Error while reading file!", e);
        }
        return outputString;
    }


    public static String readFileContentsToStringJava6(File file) throws IOException {
        String outputString = "";
        String textLine;
        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader(file));
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
