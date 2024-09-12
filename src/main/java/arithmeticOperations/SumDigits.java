package arithmeticOperations;

import java.util.Scanner;

/*Дано трехзначное число. Найдите сумму его цифр.
 * Входные данные 179*/

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int sumDigits = a / 100 + a % 100 / 10 + a % 10;
        System.out.println(sumDigits);


    }
}
