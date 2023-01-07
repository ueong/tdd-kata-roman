import java.util.Collections;
import java.util.TreeMap;

public class RomanNumber {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 3999;
    private static final TreeMap<Integer, String> symbolMap = new TreeMap<>(Collections.reverseOrder()) {{
        put(1, "I");
        put(4, "IV");
        put(5, "V");
        put(9, "IX");
        put(10, "X");
        put(40, "XL");
        put(50, "L");
        put(90, "XC");
        put(100, "C");
        put(400, "CD");
        put(500, "D");
        put(900, "CM");
        put(1000, "M");
    }};
    private final String romanNumber;
    private final int decimalNumber;
    public RomanNumber(int decimalNumber) {
        this.validate(decimalNumber);
        this.romanNumber = toRomanNumber(decimalNumber);
        this.decimalNumber = decimalNumber;
    }

    private void validate(int decimalNumber) {
        if(decimalNumber < MIN_VALUE || decimalNumber > MAX_VALUE) {
            throw new IllegalArgumentException("Invalid input value");
        }
    }

    private String toRomanNumber(int decimalNumber) {
        StringBuilder sb = new StringBuilder();
        int remaining = decimalNumber;
        for(int symbolValue : symbolMap.keySet()) {
            while(remaining >= symbolValue) {
                sb.append(symbolMap.get(symbolValue));
                remaining -= symbolValue;
            }
        }
        return sb.toString();
    }
    public int decimalValue() {
        return this.decimalNumber;
    }
    public String value() {
        return this.romanNumber;
    }

    public RomanNumber plus(RomanNumber romanNumber) {
        return new RomanNumber(this.decimalNumber + romanNumber.decimalValue());
    }

    public RomanNumber minus(RomanNumber romanNumber) {
        return new RomanNumber(this.decimalNumber - romanNumber.decimalValue());
    }

    public RomanNumber multiply(RomanNumber romanNumber) {
        return new RomanNumber(this.decimalNumber * romanNumber.decimalValue());
    }

    public RomanNumber divide(RomanNumber romanNumber) {
        if (this.decimalNumber % romanNumber.decimalValue() != 0) {
            throw new IllegalArgumentException("나누어 떨어지지 않습니다.");
        }
        return new RomanNumber(this.decimalNumber / romanNumber.decimalValue());
    }
}
