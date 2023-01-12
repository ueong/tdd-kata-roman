import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumberTest {
    @Test
    public void romanNumberValueShouldGetRomanNumber() {
        testRomanNumberValue(1, "I");
        testRomanNumberValue(2, "II");
        testRomanNumberValue(3, "III");
        testRomanNumberValue(4, "IV");
        testRomanNumberValue(5, "V");
        testRomanNumberValue(6, "VI");
        testRomanNumberValue(7, "VII");
        testRomanNumberValue(8, "VIII");
        testRomanNumberValue(9, "IX");
        testRomanNumberValue(10, "X");
        testRomanNumberValue(11, "XI");
        testRomanNumberValue(15, "XV");
        testRomanNumberValue(19, "XIX");
        testRomanNumberValue(38, "XXXVIII");
        testRomanNumberValue(40, "XL");
        testRomanNumberValue(48, "XLVIII");
        testRomanNumberValue(50, "L");
        testRomanNumberValue(89, "LXXXIX");
        testRomanNumberValue(99, "XCIX");
        testRomanNumberValue(153, "CLIII");
        testRomanNumberValue(153, "CLIII");
        testRomanNumberValue(794, "DCCXCIV");
        testRomanNumberValue(959, "CMLIX");
        testRomanNumberValue(3852, "MMMDCCCLII");
        testRomanNumberValue(3999, "MMMCMXCIX");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenInputIsBelowOne() {
         new RomanNumber(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenInputIsLargerThen4000() {
        new RomanNumber(4000);
    }

    @Test
    public void romanNumberPlusTest() {
        RomanNumber result = new RomanNumber(12).plus(new RomanNumber(3));
        assertEquals("XV", result.value());
    }

    @Test(expected = IllegalArgumentException.class)
    public void romanNumberPlusResultShouldThrowIllegalArgumentExceptionWhenResultIsLargerThen4000() {
        new RomanNumber(3999).plus(new RomanNumber(1));
    }

    @Test
    public void romanNumberMinusTest() {
        RomanNumber result = new RomanNumber(12).minus(new RomanNumber(3));
        assertEquals("IX", result.value());
    }

    @Test(expected = IllegalArgumentException.class)
    public void romanNumberMinusResultShouldThrowIllegalArgumentExceptionWhenResultIsBelowZero() {
        new RomanNumber(12).minus(new RomanNumber(12));
    }

    @Test
    public void romanNumberMultiplyTest() {
        RomanNumber result = new RomanNumber(12).multiply(new RomanNumber(3));
        assertEquals("XXXVI", result.value());
    }

    @Test(expected = IllegalArgumentException.class)
    public void romanNumberMultiplyResultShouldThrowIllegalArgumentExceptionWhenResultIsLargerThen4000() {
        new RomanNumber(2000).plus(new RomanNumber(2000));
    }

    @Test
    public void romanNumberDivideTest() {
        RomanNumber result = new RomanNumber(12).divide(new RomanNumber(3));
        assertEquals("IV", result.value());
    }

    @Test(expected = IllegalArgumentException.class)
    public void romanNumberDivideResultShouldThrowIllegalArgumentExceptionWhenCannotDividedBy() {
        new RomanNumber(5).divide(new RomanNumber(3));
    }

    private void testRomanNumberValue(int decimalNumber, String romanNumberString) {
        RomanNumber romanNumber = new RomanNumber(decimalNumber);
        assertEquals(romanNumberString, romanNumber.value());
    }
}
