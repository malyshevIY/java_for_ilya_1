package arithmeticOperations;

/*Длина Московской кольцевой автомобильной дороги —109 километров. Байкер Вася стартует с нулевого километра МКАД и едет
со скоростью v километров в час. На какой отметке он остановится через t часов?*/

import java.util.Scanner;

public class Mkad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = 109;

// в переменные v вводить только положительные числа, в переменную v1 - только отрицательные
        int v = scanner.nextInt();
        int t = scanner.nextInt();
        int v1 = scanner.nextInt();
        int t1 = scanner.nextInt();

        System.out.println((s - (v * t)) * -1);
        System.out.println(s - Math.abs(v1 * t1));
    }
}