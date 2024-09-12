package arithmeticOperations;

import java.util.Scanner;

/*Дано двузначное число. Найдите число десятков в нем. Входные данные 42 */

public class NumberTensTwoDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int number = a / 10;
        System.out.println(number);
    }
}
