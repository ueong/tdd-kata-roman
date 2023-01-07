import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumberTest {
    @Test
    public void romanNumberValueShouldGetRomanNumber() {
        RomanNumber one = new RomanNumber(1);
        assertEquals("I", one.value());
    }
}
