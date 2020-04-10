package hu.marthon_szabo.file_part_reader;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FileWorldAnalyzer {
    private FilePartReader fpr;
    private ArrayList<String> allLines = fpr.getResource();

    public FileWorldAnalyzer(FilePartReader fpr) {
        this.fpr = fpr;
    }

    public String[] getWordsContainingSubstrings(String substring) {
        ArrayList<String> myWords = new ArrayList<>();

        allLines.forEach(line -> line.split(" "));

        for (String word : allLines) {
            if (word.equals(substring)) {
                myWords.add(word);
            }
        }
        System.out.println(myWords);
        return (String[]) myWords.toArray();

    }


}
