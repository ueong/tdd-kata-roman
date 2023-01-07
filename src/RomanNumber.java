public class RomanNumber {
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
        for(RomanSymbol symbol : RomanSymbol.values()) {
            while(remaining >= symbol.value()) {
                sb.append(symbol.name());
                remaining -= symbol.value();
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

    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 3999;
    private enum RomanSymbol {
        M(1000),
        CM(900),
        D(500),
        CD(400),
        C(100),
        XC(90),
        L(50),
        XL(40),
        X(10),
        IX(9),
        V(5),
        IV(4),
        I(1);
        private final int value;
        RomanSymbol(final int value) {
            this.value = value;
        }
        public int value() {
            return this.value;
        }
    }
}
