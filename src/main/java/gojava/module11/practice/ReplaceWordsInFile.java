package gojava.module11.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Collectors;

public class ReplaceWordsInFile {

    public static void main(String[] args) {
        URL url = null;
        try {
            url = new URL("http://google.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        try (BufferedReader urlReader = new BufferedReader(new InputStreamReader(url.openStream()));
             BufferedWriter bufferedFileWriter = new BufferedWriter(new FileWriter("google.html"))) {
            bufferedFileWriter.write(urlReader.lines().map(p -> p.replaceAll("google", "yandex").replaceAll("Google",
                "Yandex")).collect(Collectors
                .joining()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
