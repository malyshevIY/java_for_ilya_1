package ConditionalOperator;

import java.util.Scanner;

/*
* Требуется определить, бьет ли слон, стоящий на клетке с указанными координатами (номер строки и номер столбца),
*  фигуру, стоящую на другой указанной клетке.

Входные данные
Вводятся четыре числа: координаты слона и координаты другой фигуры. Координаты - целые числа в интервале от 1 до 8.

Выходные данные
Требуется вывести слово YES, если слон способен побить фигуру за 1 ход, в противном случае вывести слово NO
 */

public class Elephant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vertical_one = scanner.nextInt();
        int horizontal_one = scanner.nextInt();

        int vertical_two = scanner.nextInt();
        int horizontal_two = scanner.nextInt();

        // Две клетки находятся на одной диагонали,
        // если разница между их координатами по вертикали равна разнице по горизонтали
        if (Math.abs(vertical_one - vertical_two) == Math.abs(horizontal_one - horizontal_two))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
