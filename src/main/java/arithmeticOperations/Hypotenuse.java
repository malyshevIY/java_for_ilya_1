package arithmeticOperations;

import java.util.Scanner;


/*Дано два числа a и b. Найдите гипотенузу треугольника с заданными катетами.

    Входные данные
    В двух строках вводятся два числа (числа целые,положительные, не превышают 1000).

    Выходные данные
    Выведите ответ на задачу.*/

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double sumSquared = Math.pow(a, 2) + Math.pow(b, 2);
        double hypotenuse = Math.sqrt(sumSquared);
        System.out.println("Гипотенуза равна " + hypotenuse);


    }
}
