package LoopWhile;

import java.util.Scanner;

/*
 * Вводится последовательность целых чисел, оканчивающаяся числом 0. Найти четный максимум
 * */
public class EvenMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int max;

        while (x % 2 == 1) {  // проверка на четное число
            x = scanner.nextInt();
        }

        if (x != 0) {
            max = x;

            while (x != 0) {
                if (x % 2 == 0 && x > max)
                    max = x;
                x = scanner.nextInt();
            }
            System.out.println(max);
        } else {
            System.out.println("x равен 0");
        }
    }
}
