import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class FileSearchServiceTest {

    @Test
    public void whenDirectoryPathIsNull_thenThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> FileSearchService.execute(null));

        assertEquals("The parameter is null or empty", exception.getMessage());
    }

    @Test
    public void whenDirectoryPathIsEmpty_thenThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> FileSearchService.execute(""));

        assertEquals("The parameter is null or empty", exception.getMessage());
    }
}