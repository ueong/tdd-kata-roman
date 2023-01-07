import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true)  {
            System.out.print("십진수 숫자를 입력하세요. : ");
            int inputNumber = scanner.nextInt();
            System.out.println("로마 숫자 : " + new RomanNumber(inputNumber).value());
        }
    }
}