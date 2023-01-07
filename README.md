# 로마 숫자 TDD Kata

이 Repository는 TDD를 연습하기 위한 Kata를 소개합니다.

## 문제 정의

### 1. 자연수를 입력하면 로마 숫자로 표시할 수 있는 `RomanNumber` 클래스를 정의하시오.

예를 들면 다음과 같습니다.

```java
RomanNumber four = new RomanNumber(4);
        System.out.println(four.value()); // IV

        RomanNumber ninetyNine = new RomanNumber(99);
        System.out.println(ninetyNine.value()); // XCIX


        RomanNumber eightHundredSeventySix = new RomanNumber(876);
        System.out.println(eightHundredSeventySix.value()); // DCCCLXXVI
```

로마 숫자는 다음과 같이 정의됩니다.

| 숫자 | 로마숫자 |
|:----:|:--------:|
|  1   |    I     |
|  5   |    V     |
|  10  |    X     |
|  50  |    L     |
| 100  |    C     |
| 500  |    D     |
| 1000 |    M     |

본 Kata에서 숫자 입력값의 범위는 **1 - 3999** 까지입니다.
이 범위를 넘어가는 입력값이 들어오면 `IllegalArgumentException`을 `throw`해야 합니다.

### 2. 로마 숫자의 사칙연산을 구현하시오.

예를 들면 다음과 같습니다.

```java
RomanNumber twelve = new RomanNumber(12);
RomanNumber three = new RomanNumber(3);

RomanNumber plusResult = twelve.plus(three);
System.out.println(plusResult.value()); // XV

RomanNumber minusResult = twelve.minus(three);
System.out.println(minusResult.value()); // IX

RomanNumber multiplyResult = twelve.multiply(three);
System.out.println(multiplyResult.value()); // XXXVI

RomanNumber divideResult = twelve.divide(three);
System.out.println(divideResult.value()); // IV
```

사칙 연산의 결과는 **1 - 3999** 범위에 있어야 합니다. 만약에 연산 결과값이 범위를 넘어가면 `IllegalArgumentException`을 `throw`해야 합니다.

만약에 나눗셈의 결과가 나누어 떨어지지 않아도 `IllegalArgumentException`을 `throw`해야 합니다.

