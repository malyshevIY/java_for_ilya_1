package LoopFor;


import java.util.Scanner;

/*
По данному натуральному n вычислите сумму 12+22+...+n2.

Входные данные
Вводится единственное натуральное число n, не превосходящее 100

Выходные данные
Необходимо вывести  вычисленную сумму.
* */
public class SumOfSquares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int x = 1;
        int xSquare;

        if (n > 100 || n <= 0) {
            System.out.println("Натуральное число " + n + " > 100, отрицательно или равно 0");
        } else {
            for (int i = 1; i <= n; i++) {
                xSquare = x * x;
                sum = sum + xSquare;
                x++;
            }
            System.out.println(sum);
        }
    }
}


