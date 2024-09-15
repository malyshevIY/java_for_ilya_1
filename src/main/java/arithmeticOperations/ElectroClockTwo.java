package arithmeticOperations;

import java.util.Scanner;

/*Электронные часы показывают время в формате h:mm:ss,то есть сначала записывается
количество часов,потом обязательно двузначное количество минут,затем обязательно
двузначное количество секунд.Количество минут и секунд при необходимости дополняются до
двузначного числа нулями.
С начала суток прошло n секунд. Выведите, что покажут часы.
*/

public class ElectroClockTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int h = (n / 3600) % 24;
        int m = (n / 60) % 60;
        int s = n % 60;

        System.out.println(h + " " + m + " " + s);
    }
}
