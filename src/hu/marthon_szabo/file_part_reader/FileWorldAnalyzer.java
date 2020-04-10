package hu.marthon_szabo.file_part_reader;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FileWorldAnalyzer {
    private FilePartReader fpr;
    private String allLines;

    public FileWorldAnalyzer(FilePartReader fpr, String resource) {
        this.fpr = fpr;
        this.allLines = resource;
    }

    public String[] getWordsContainingSubstrings(String substring) {
        String splitLines[] = allLines.split("[\\s,.]");
        ArrayList<String> myWords = new ArrayList<>();
        for (int i = 0; i < splitLines.length; i++) {
            if (splitLines[i].equals(substring)) {
                myWords.add(splitLines[i]);
            }
        }

        return (String[]) myWords.toArray();

    }


}
