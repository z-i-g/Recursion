import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class SecondMaxNumberOfListFindingServiceTest {

    @Test
    void whenListEmpty_thenException() {
        Exception exception = assertThrows(RuntimeException.class, () -> SecondMaxNumberOfListFindingService.execute(new ArrayList<>()));

        assertEquals("List is empty or null or contains one element", exception.getMessage());
    }

    @Test
    void whenListIsNull_thenException() {
        Exception exception = assertThrows(RuntimeException.class, () -> SecondMaxNumberOfListFindingService.execute(null));

        assertEquals("List is empty or null or contains one element", exception.getMessage());
    }

    @Test
    void whenListContainsOneElement_thenException() {
        Exception exception = assertThrows(RuntimeException.class, () -> SecondMaxNumberOfListFindingService.execute(Collections.singletonList(1)));

        assertEquals("List is empty or null or contains one element", exception.getMessage());
    }

    @Test
    void whenListContainsTwoElements_thenResult() {
        assertEquals(3, SecondMaxNumberOfListFindingService.execute(Arrays.asList(3, 5)));
    }

    @Test
    void whenListContainsSeveralElements_thenResult() {
        assertEquals(4, SecondMaxNumberOfListFindingService.execute(Arrays.asList(3, 5, 1, 4)));
    }

    @Test
    void whenListContainsSeveralElementsAndTwoIdenticalMaximum_thenResult() {
        assertEquals(5, SecondMaxNumberOfListFindingService.execute(Arrays.asList(3, 5, 1, 5)));
    }

    @Test
    void whenListContainsSeveralNegativeElements_thenResult() {
        assertEquals(-3, SecondMaxNumberOfListFindingService.execute(Arrays.asList(-3, -4, -1, -5)));
    }

    @Test
    void whenListContainsSeveralNegativeElementsAndTwoIdenticalMaximum_thenResult() {
        assertEquals(-4, SecondMaxNumberOfListFindingService.execute(Arrays.asList(-4, -4, -1, -5)));
    }

    @Test
    void whenListContainsSeveralNegativeAndPositiveElements_thenResult() {
        assertEquals(-2, SecondMaxNumberOfListFindingService.execute(Arrays.asList(-4, -2, 0)));
    }
}