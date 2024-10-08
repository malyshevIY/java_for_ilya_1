package ConditionalOperator;

import java.util.Scanner;

/*
* Поле шахматной доски определяется парой чисел (a, b), каждое от 1 до 8, первое число задает номер столбца,
*  второе – номер строки. Заданы две клетки. Определите, может ли шахматный король попасть с первой клетки на вторую за один ход.

Входные данные
Даны 4 целых числа от 1 до 8 каждое, первые два задают начальную клетку, вторые два задают конечную клетку.
* Начальная и конечная клетки не совпадают. Числа записаны в отдельных строках.

Выходные данные
Программа должна вывести YES, если из первой клетки ходом короля можно попасть во вторую,
* или NO в противном случае.
*/

public class TheKing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vertical_one = scanner.nextInt();
        int horizontal_one = scanner.nextInt();

        int vertical_two = scanner.nextInt();
        int horizontal_two = scanner.nextInt();

        //Разница по вертикали между первой и второй клетками должна быть не больше 1
        // Разница по горизонтали между первой и второй клетками должна быть не больше 1
        if (Math.abs(vertical_one - vertical_two) <= 1 && Math.abs(horizontal_one - horizontal_two) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
