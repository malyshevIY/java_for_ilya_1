package ConditionalOperator;

import java.util.Scanner;

/*Требуется определить, бьет ли конь, стоящий на клетке с указанными координатами (номер строки и номер столбца),
 фигуру, стоящую на другой указанной клетке.

Входные данные
Вводятся четыре числа: координаты коня и координаты другой фигуры. Все координаты - целые числа в интервале от 1 до 8.

Выходные данные
Программа должна вывести слово YES, если конь может побить фигуру за 1 ход, в противном случае вывести слово NO
*/

public class TheHorse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vertical_one = scanner.nextInt();
        int horizontal_one = scanner.nextInt();

        int vertical_two = scanner.nextInt();
        int horizontal_two = scanner.nextInt();

        if ((Math.abs(vertical_one - vertical_two) == 2 && Math.abs(horizontal_one - horizontal_two) == 1) ||
            (Math.abs(horizontal_one - horizontal_two) == 2 && Math.abs(vertical_one - vertical_two) == 1))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
