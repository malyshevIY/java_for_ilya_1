package ConditionalOperator;

import java.util.Scanner;

/*
*Требуется определить, бьет ли ладья, стоящая на клетке с указанными координатами (номер строки и номер столбца),
* фигуру, стоящую на другой указанной клетке.

Входные данные
Вводятся четыре числа: координаты ладьи (два числа) и координаты другой фигуры (два числа), каждое число вводится в
* отдельной строке. Координаты - целые числа в интервале от 1 до 8.

Выходные данные
Требуется вывести слово YES, если ладья сможет побить фигуру за 1 ход и NO - в противном случае.
*/

public class Rook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vertical_one = scanner.nextInt();
        int horizontal_one = scanner.nextInt();

        int vertical_two = scanner.nextInt();
        int horizontal_two = scanner.nextInt();

        if (vertical_one == vertical_two || horizontal_one == horizontal_two)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
