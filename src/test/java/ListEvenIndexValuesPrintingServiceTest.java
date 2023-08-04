import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ListEvenIndexValuesPrintingServiceTest {
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
    public void whenListIsFilled_thenPrintingIsEvenIndexValues() {
        List<Integer> list = new ArrayList<>();
        list.add(0,1);
        list.add(1, 23);
        list.add(2, 41);
        list.add(3, 47);
        list.add(4, 52);
        ListEvenIndexValuesPrintingService.execute(list);

        assertEquals("1 41 52", outputStreamCaptor.toString().trim());
    }

    @Test
    public void whenListIsContainsOneElement_then() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        ListEvenIndexValuesPrintingService.execute(list);

        assertEquals("10", outputStreamCaptor.toString().trim());
    }

    @Test
    public void whenListIsNull_then() {
        ListEvenIndexValuesPrintingService.execute(null);

        assertEquals("", outputStreamCaptor.toString().trim());
    }

    @Test
    public void whenListIsEmpty_then() {
        ListEvenIndexValuesPrintingService.execute(new ArrayList<>());

        assertEquals("", outputStreamCaptor.toString().trim());
    }
}