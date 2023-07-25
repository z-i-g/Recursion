import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerTest {
    @Test
    public void whenExponentZero_thenResult() {
        assertEquals(1, Power.execute(2, 0));
    }

    @Test
    public void whenExponentOne_thenResult() {
        assertEquals(2, Power.execute(2, 1));
    }

    @Test
    public void whenIsPositiveExponent_thenResultBase() {
        for (int i = 1; i < 15; i++) {
            int randomExponent = (int) (Math.random() * i);
            assertEquals(Math.pow(2, randomExponent), Power.execute(2, randomExponent));
        }
    }

    @Test
    public void whenIsNegativeExponent_thenResultBase() {
        for (int i = 1; i < 15; i++) {
            int randomExponent = (int) (Math.random() * -i);
            assertEquals(Math.pow(2, randomExponent), Power.execute(2, randomExponent));
        }
    }
}