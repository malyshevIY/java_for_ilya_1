package LoopWhile;

/*
 * Пользователь вводит монотонно возрастающую последовательность целых чисел, оканчивающуюся нулём.
 *  Вычислить количество разных чисел в последовательности
 * 2 2 2 5 5 7 8 8 8 9 0
 * */

import java.util.Scanner;

public class MonotonSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int prev = -1;
        int x = scanner.nextInt();

        if (x == 0) {
            System.out.println(count);
            return;
        }

        while (x != 0) {
            if (x != prev)
                count++;

            prev = x;
            x = scanner.nextInt();
        }
        System.out.println(count);
    }
}
