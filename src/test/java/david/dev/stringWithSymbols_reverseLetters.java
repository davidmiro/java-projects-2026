package david.dev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LetterReverserTest {
    private final LetterReverser letterReverser = new LetterReverser();
    @Test
    void stringWithSymbols_reverseLetters() {
        String input = "h%el_lo@";
        String result = letterReverser.reverseLetters(input);
        assertEquals("o%ll_eh@", result);
    }

}