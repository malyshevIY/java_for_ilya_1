package ConditionalOperator;

import java.util.Scanner;

/*
* Входные данные
Даны три целых числа, каждое записано в отдельной строке.

Выходные данные
Выведите наибольшее из данных чисел (программа должна вывести ровно одно целое число).
*/

public class MaxOfThreeNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && a > c)
            System.out.println(a);
        else if (b > a && b > c) {
            System.out.println(b);
        } else
            System.out.println(c);
    }
}
