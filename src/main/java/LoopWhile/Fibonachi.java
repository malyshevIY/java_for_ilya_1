package LoopWhile;


/*
 * Дано число n. Вывести n-ное число Фибоначчи
 * */

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 2;
        int f0 = 0;
        int f1 = 1;
        int sum = 0;

        if (n == 0 || n == 1) {
            System.out.println(n);
        } else {
            while (i <= n) {
                sum = f0 + f1;
                f0 = f1;
                f1 = sum;
                i++;
            }
            System.out.println(sum);
        }
    }
}
