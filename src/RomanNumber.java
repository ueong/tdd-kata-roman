public class RomanNumber {
    private final String romanNumber;
    public RomanNumber(int decimalNumber) {
        this.romanNumber = toRomanNumber(decimalNumber);
    }

    private String toRomanNumber(int decimalNumber) {
        return "I";
    }
    public String value() {
        return this.romanNumber;
    }
}
