package hu.marthon_szabo.file_part_reader;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class FilePartReaderTest {
    FilePartReader filePartReader;

    @BeforeEach
    void createClass() {
        filePartReader = new FilePartReader();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Setup test")
    void setupTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                filePartReader.setup("/main/resources/text.txt", 1, 0));
        assertEquals("toLine expected to be bigger than fromLine", exception.getMessage());
    }
}