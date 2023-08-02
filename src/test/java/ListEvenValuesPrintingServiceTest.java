import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListEvenValuesPrintingServiceTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
    @Test
    public void whenListIsContainsOnlyOddNumbers_then() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(23);
        list.add(41);
        ListEvenValuesPrintingService.execute(list);

        assertEquals("", outputStreamCaptor.toString().trim());
    }

    @Test
    public void whenListIsContainsOnlyEvenNumbers_then() {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(28);
        list.add(88);
        ListEvenValuesPrintingService.execute(list);

        assertEquals("0 28 88", outputStreamCaptor.toString().trim());
    }

    @Test
    public void whenListIsContainsDifferentNumbers_then() {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(7);
        list.add(14);
        list.add(27);
        list.add(100);
        ListEvenValuesPrintingService.execute(list);

        assertEquals("0 14 100", outputStreamCaptor.toString().trim());
    }

    @Test
    public void whenListIsNull_then() {
        ListEvenValuesPrintingService.execute(null);

        assertEquals("", outputStreamCaptor.toString().trim());
    }

    @Test
    public void whenListIsEmpty_then() {
        ListEvenValuesPrintingService.execute(new ArrayList<>());

        assertEquals("", outputStreamCaptor.toString().trim());
    }

}