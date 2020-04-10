package hu.marthon_szabo.file_part_reader;

public class Main {
    public static void main(String[] args) {
        FilePartReader reader = new FilePartReader();
        reader.setup("/home/marthon-szabo/Documents/Codecool/5th_week/SI/filepartreader-testing-with-junit-marthon-szabo/src/main/resources/text.txt", 1, 2);
        FileWorldAnalyzer fw = new FileWorldAnalyzer(reader, reader.getResource());
        fw.getWordsContainingSubstrings("meaning");
    }
}
