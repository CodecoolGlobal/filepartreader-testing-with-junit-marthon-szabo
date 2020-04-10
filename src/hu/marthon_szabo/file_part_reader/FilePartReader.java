package hu.marthon_szabo.file_part_reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FilePartReader {
    private ArrayList<String> resource = new ArrayList<>();

    public  void setup(String filePath, Integer fromLine, Integer toLine) {
        if (toLine < fromLine) throw new IllegalArgumentException ("fromLine expected to be bigger than toLine!");

        System.out.println(readLines(filePath, fromLine, toLine));
    }

    public String readLines(String filePath, int fromLine, int toLine) {
        ArrayList<String> allLines = read(filePath);
        StringBuilder myLines = new StringBuilder();

        for (int i = fromLine - 1; i <= toLine - 1 ; i++) {
            myLines.append(String.format("[Line %d]: %s\n", i + 1, allLines.get(i)));
        }

        return myLines.toString();
    }

    public ArrayList<String> read(String filePath) {
        try {
            File file = new File(filePath);
            Scanner reader = new Scanner(file);

            ArrayList<String> lines = new ArrayList<String>() {{
                while (reader.hasNextLine()) {
                    addAll(new ArrayList<String>() {{
                        add(reader.nextLine());
                    }});
                }
            }};
            reader.close();
            resource = lines;
            return lines;

        } catch (Exception e) {}
        return null;
    }

    public ArrayList<String> getResource() { return resource; }
}
