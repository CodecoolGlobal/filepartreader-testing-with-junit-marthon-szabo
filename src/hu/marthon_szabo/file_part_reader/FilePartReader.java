package hu.marthon_szabo.file_part_reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FilePartReader {
    public  void setup(String filePath, Integer fromLine, Integer toLine) {
        if (toLine < fromLine) throw new IllegalArgumentException ("fromLine expected to be bigger than toLine!");



        ArrayList<String> lines = read(filePath);
        ArrayList<String> linesToReturn = new ArrayList<>();

        for (int i = fromLine - 1; i < toLine - 1; i++) {
            linesToReturn.add(lines.get(i));
        }
    }

    private ArrayList<String> read(String filePath) {
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
            return lines;

        } catch (Exception e) {}
        return null;
    }
}
