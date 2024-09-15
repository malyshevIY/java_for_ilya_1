package arithmeticOperations;

import java.util.Scanner;

/*
Напишите программу, которая считывает значения двух целочисленных переменных a и b,
затем меняет их значения местами (то есть в переменной a должно быть записано то,
что раньше хранилось в b, а в переменной b записано то, что раньше хранилось в a).
Затем выведите значения переменных.
Входные данные - Вводятся целые числа a и b.
 */

public class ReplaceValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println(a + " " + b);

    }
}
