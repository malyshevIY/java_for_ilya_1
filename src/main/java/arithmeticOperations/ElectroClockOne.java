package arithmeticOperations;

import java.util.Scanner;

/*
Дано число n. С начала суток прошло n минут.
Определите, сколько часов и минут будут показывать электронные часы в этот момент.
Программа должна вывести два числа: количество часов (от 0 до 23) и количество минут
(от 0 до 59). Учтите, что число n может быть больше, чем количество минут в сутках.
*/

public class ElectroClockOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int h = (n / 60) % 24;
        int m = n % 60;

        System.out.println(h + " " + m);
    }
}
