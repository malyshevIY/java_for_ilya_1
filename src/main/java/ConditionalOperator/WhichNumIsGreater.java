package ConditionalOperator;

import java.util.Scanner;

/*
* Входные данные
Даны два целых числа, каждое записано в отдельной строке.

Выходные данные
Программа должна вывести число 1, если первое число больше второго, число 2,
если второе больше первого, или число 0, если они равны.
*/

public class WhichNumIsGreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b)
            System.out.println(a);
        else if (b > a) {
            System.out.println(b);
        } else
            System.out.println("0");
    }
}
