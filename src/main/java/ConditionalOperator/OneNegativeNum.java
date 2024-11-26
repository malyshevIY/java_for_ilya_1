package ConditionalOperator;

import java.util.Scanner;

/*
* Пользователь вводит 3 числа.
Вывести yes, если среди них есть только 1 отрицательное
* */

public class OneNegativeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a < 0 && b >= 0 && c >= 0) ||
            (b < 0 && a >= 0 && c >= 0) ||
            (c < 0 && a >= 0 && b >= 0))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
