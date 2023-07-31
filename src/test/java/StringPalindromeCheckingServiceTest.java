import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringPalindromeCheckingServiceTest {
    @Test
    public void whenStringIsPalindrome() {
        assertTrue(StringPalindromeCheckingService.execute("asdkdsa"));
    }

    @Test
    public void whenStringIsNotPalindrome() {
        assertFalse(StringPalindromeCheckingService.execute("asdksa"));
    }

    @Test
    public void whenStringIsNull() {
        assertFalse(StringPalindromeCheckingService.execute(null));
    }

    @Test
    public void whenStringLengthIsOne() {
        assertTrue(StringPalindromeCheckingService.execute("a"));
    }

    @Test
    public void whenStringIsEmpty() {
        assertTrue(StringPalindromeCheckingService.execute(""));
    }
}