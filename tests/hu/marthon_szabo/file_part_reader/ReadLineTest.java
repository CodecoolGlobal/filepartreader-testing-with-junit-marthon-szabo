package hu.marthon_szabo.file_part_reader;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
class ReadLineTest {
    int fromLine;
    int toLine;
    String expectedLine;
    String fileSource;
    FilePartReader fpr = new FilePartReader();



    public ReadLineTest(int fromLine, int toLine, String expectedLine, String fileSource) {
        this.fromLine = fromLine;
        this.toLine = toLine;
        this.expectedLine = expectedLine;
        this.fileSource = fileSource;
    }

    @Parameterized.Parameters
    public static Collection lines() {
        return Arrays.asList(new Object[][] {
                {1, 1, "[Line 1]: As you can see a lot of written text is present on those pages. " +
                        "The goal is to learn to make tests in JUnit. " +
                        "If you feel like it's not enough/not good enough " +
                        "material feel free to search for another sources.\n"}
        });
    }

    @Test
    public void readLineTest() {
        System.out.println("fromLine: " + fromLine + "toLine: " + toLine);
        assertEquals(expectedLine, fpr.readLines(fileSource, fromLine, toLine));
    }
}