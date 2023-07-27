import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    @Test
    public void whenNumber_thenDigitSum() {
        for (int i = 11111; i < 999999; i++) {
            Integer randomVale = (int) (Math.random() * i);
            Integer expectedResult = Arrays.stream(randomVale.toString().split(""))
                    .map(Integer::parseInt)
                    .reduce(0, Integer::sum);
            assertEquals(expectedResult, Sum.execute(randomVale));
        }
    }
}