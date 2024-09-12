package arithmeticOperations;

import java.util.Scanner;

/*N школьников делят K яблок поровну, неделящийся остаток остается в корзинке. Сколько яблок достанется каждому школьнику?

    Входные данные
    Программа получает на вход числа N и K.

    Выходные данные
    Программа должна вывести искомое количество яблок.*/

public class ShareApples1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int count = k / n;

        System.out.println(count);

    }
}