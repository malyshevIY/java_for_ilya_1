package ConditionalOperator;

import java.util.Scanner;

/*
    Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
Входные данные
Даны два целых числа, каждое число записано в отдельной строке.

Выходные данные
Выведите наибольшее из данных чисел.
 */

public class MaxOfTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b)
            System.out.println(a);
        else
            System.out.println(b);
    }
}
