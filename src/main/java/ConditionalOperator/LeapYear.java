package ConditionalOperator;

import java.util.Scanner;

/*
Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
Требуется определить, является ли данный год високосным.
(Напомним, что год является високосным, если его номер кратен 4, но не кратен 100, а также если он кратен 400.)

Входные данные
Вводится единственное число - номер года (целое, положительное, не превышает 30000).

Выходные данные
Требуется вывести слово YES, если год является високосным и NO - в противном случае.
 */
public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year <= 30000 && year > 0)
            System.out.println("Год подходит под услвоие задачи ");
        else
            System.out.println("Год не подходит под условие задачи");

        if ((year % 4 == 0 || year % 400 == 0) && year / 100 > 0)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
