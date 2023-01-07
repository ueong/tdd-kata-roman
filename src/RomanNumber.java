public class RomanNumber {
    private final String romanNumber;
    public RomanNumber(int decimalNumber) {
        this.romanNumber = toRomanNumber(decimalNumber);
    }

    private String toRomanNumber(int decimalNumber) {
        // TODO: 구현하세요.
        return "I";
    }
    public String value() {
        return this.romanNumber;
    }
}
