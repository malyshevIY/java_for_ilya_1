package arithmeticOperations;

import java.util.Scanner;


/*
* За день машина проезжает n километров. Сколько дней нужно, чтобы проехать маршрут
* длиной m километров?
При решении этой задачи нельзя пользоваться условной инструкцией if и циклами.
Входные данные
Программа получает на вход натуральные числа n и m, не превосходящие 10000.
* */


public class MotorRally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int day = (m + n - 1) / n; // // TO DO: Нужно разобрать, с - 1 случайно подобрал

        System.out.println(day);
    }
}
