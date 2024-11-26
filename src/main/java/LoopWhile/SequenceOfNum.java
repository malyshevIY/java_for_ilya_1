package LoopWhile;

import java.util.Scanner;

/*
* Пользователь вводит последовательность чисел, оканчивающуюся нулём.
Проверить, содержит ли последовательность отрицательные числа ("yes"/"no")
* */
public class SequenceOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isNegative = false;
        int prev = scanner.nextInt();
        int x = scanner.nextInt();

        while (x != 0) {
            if (x < 0 || prev < 0)
                isNegative = true;
            x = scanner.nextInt();
        }
        if (isNegative)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

