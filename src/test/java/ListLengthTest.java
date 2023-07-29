import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListLengthTest {
    List<Integer> integerList = new ArrayList<>();

    @Test
    public void whenAddedOneElement_then() {
        integerList.add(1);

        assertEquals(1, ListLength.execute(integerList));
    }

    @Test
    public void whenEmptyList_then() {
        assertEquals(0, ListLength.execute(integerList));
    }

    @Test
    public void whenAddedSomeElements_then() {
        int iterateCount = (int) (Math.random() * 1000);
        for (int i = 0; i < iterateCount; i++) {
            integerList.add(i);
        }
        assertEquals(iterateCount, ListLength.execute(integerList));
    }
}