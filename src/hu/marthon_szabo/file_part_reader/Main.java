package hu.marthon_szabo.file_part_reader;

public class Main {
    public static void main(String[] args) {
        FilePartReader reader = new FilePartReader();
        reader.setup("src/main/resources/text.txt", 1, 2);
    }
}
