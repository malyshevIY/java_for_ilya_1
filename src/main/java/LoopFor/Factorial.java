package LoopFor;

import java.util.Scanner;

/*
* Вычислите N! ("эн-факториал") – произведение всех натуральных чисел от 1 до N ( N!=1∙2∙3∙…∙ N ).

Входные данные
Вводится единственное число N – натуральное, не превосходит 12.

Выходные данные
Выведите полученное значение N!
* */
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int naturalNumber = 1;
        int factorial = 1;

        if (n > 12 || n <= 0) {
            System.out.println("Натуральное число " + n + " > 12, отрицательно или равно 0");
        } else {
            for (int i = 1; i <= n; i++) {
                factorial = factorial * naturalNumber;
                naturalNumber++;
            }
            System.out.println(factorial);
        }
    }
}
