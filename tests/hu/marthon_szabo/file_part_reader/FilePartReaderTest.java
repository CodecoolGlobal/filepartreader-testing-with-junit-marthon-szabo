package hu.marthon_szabo.file_part_reader;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName(value = "FilePartReader Unit Test")
public class FilePartReaderTest {
    FilePartReader fpr = new FilePartReader();
    SubstringTest fwa = new SubstringTest();
    Result result;


    @Test
    public void setTest() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                fpr.setup("src/main/resources/text.txt", 3, 1));
        assertEquals("fromLine expected to be bigger than toLine!", exception.getMessage());
    }

    @Test
    public void readTest() {
        assertEquals(null, fpr.read("/ra/a.xl"));
    }

    @Test
    public void readLineTest() {
        result = JUnitCore.runClasses(ReadLineTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }

    @Test
    public void subStringTest() {
        result = JUnitCore.runClasses(ReadLineTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("The success of the result: " + result.wasSuccessful());
    }

    @AfterEach
    void tearDown() {
    }



}