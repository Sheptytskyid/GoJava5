package gojava.module11.homework;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TextFileUtilsDemo {

    private static File file;
    private static Map<String, String> wordsToReplace = new HashMap<>();

    public static void main(String[] args) {
        wordsToReplace.put("initial", "resulting");
        wordsToReplace.put("line", "string");

        try {
            file = TextFileUtils.createEmptyTextFile("Source.txt");
            TextFileUtils.fillFileWithSampleText(file);
            System.out.println("Initial file contents:\n" + TextFileUtils.readFileContentsToString(file));
            System.out.println("\nString with replaced words:");
            System.out.println(TextFileUtils.replacer(wordsToReplace, file));
            System.out.print("\nRewriting file with the new String... ");
            TextFileUtils.fileContentsReplacer(wordsToReplace, file);
            System.out.println("Done!");
            System.out.print("Appending new String to file... ");
            TextFileUtils.fileContentsMerge(wordsToReplace, file);
            System.out.println("Done!");
            System.out.println("\nResulting file contents:\n" + TextFileUtils.readFileContentsToString(file));
            System.out.println("\nNumber of occurrences of word \"This\": " + TextFileUtils.checkWord("This", file));
            System.out.println("Number of occurrences of word \"Denys\": " + TextFileUtils.checkWord("Denys", file));
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return;
        }
    }
}