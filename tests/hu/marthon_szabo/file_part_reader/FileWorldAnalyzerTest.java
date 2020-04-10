package hu.marthon_szabo.file_part_reader;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class FileWorldAnalyzerTest {
    FilePartReader fpr = new FilePartReader();
    FileWorldAnalyzer fwa = new FileWorldAnalyzer(fpr, fpr.getResource());

   /* @ParameterizedTest
    @ValueSource(strings = {"important", "pages", "meaning", " "})
    public void substringTest(String substring) {
        assertArrayEquals(new String[] {substring},  fwa.getWordsContainingSubstrings(substring));
*/



}