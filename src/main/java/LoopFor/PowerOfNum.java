package LoopFor;

import java.util.Scanner;

/*
Напишите программу, вычисляющую 2 N.

Входные данные
Вводится целое неотрицательное число N, которое не превосходит 30.

Выходные данные
Выведите число 2 N.
* */
public class PowerOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;

        if (n > 30 || n <= 0) {
            System.out.println("Натуральное число " + n + " > 30, отрицательно или равно 0");
        } else {
            for (int i = 0; i < n; i++) {
                x = x * 2;
            }
            System.out.println(x);
        }
    }
}
