package arithmeticOperations;

import java.util.Scanner;

/*Пирожок в столовой стоит a рублей и b копеек.
 Определите, сколько рублей и копеек нужно заплатить за n пирожков.
    Входные данные
    Программа получает на вход три числа:a,b,n.*/

public class Price {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int sum1 = a * n + (b * n) / 100;
        int sum2 = (n * b) % 100;

        System.out.println(sum1 + " " + sum2);
    }
}
