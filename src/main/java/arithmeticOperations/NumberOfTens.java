package arithmeticOperations;

import java.util.Scanner;

/*Дано неотрицательное целое число. Найдите число десятков в его десятичной записи (то есть вторую справа цифру его десятичной записи).
Входные данные 179
*/

public class NumberOfTens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int number = a % 100 / 10;
        System.out.println(number);


    }
}
