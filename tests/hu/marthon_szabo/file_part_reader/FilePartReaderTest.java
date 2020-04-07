package hu.marthon_szabo.file_part_reader;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName(value = "FilePartReader Unit Test")
public class FilePartReaderTest {
    FilePartReader fpr = new FilePartReader();


    @Test
    public void setTest() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                fpr.setup("src/main/resources/text.txt", 3, 1));
        assertEquals("fromLine expected to be bigger than toLine!", exception.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}