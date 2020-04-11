package hu.marthon_szabo.file_part_reader;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
class SubstringTest {
    FilePartReader fpr;
    FileWorldAnalyzer fwa;
    String substring;
    String expectation;

    @Before
    public void initialize() {
        this.fpr = new FilePartReader();
        this.fwa = new FileWorldAnalyzer(fpr, fpr.getResource());
    }

    @Parameterized.Parameters
    public static Collection words() {
        return Arrays.asList(new Object[][] {
                {"meaning", "meaning"},
                {"As", "As"},
                {"Another", "Another"},
                {" ", " "}
        });

    }

   @Test
    public void substringTest() {
       System.out.println("Substring: " + substring);
       assertEquals(expectation, fwa.getWordsContainingSubstrings(substring));
   }



}