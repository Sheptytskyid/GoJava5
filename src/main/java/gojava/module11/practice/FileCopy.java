package gojava.module11.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) {
        String string;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("source.txt"))) {
            writer.write("111");
            writer.newLine();
            writer.write("222");
            writer.newLine();
            writer.write("222 + 111");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("source.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("destination.txt"))) {
            while ((string = reader.readLine()) != null) {
                writer.write(string);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
