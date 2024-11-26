package LoopFor;

import java.util.Scanner;

/*
*По данным натуральным n и k вычислите значение 𝐶𝑘𝑛=𝑛!/𝑘!(𝑛−𝑘)!
 (число сочетаний из n элементов по k).

Входные данные
Вводятся 2 числа - n и k (𝑛,𝑘≤10).

Выходные данные
Необходимо вывести  значение 𝐶𝑘/𝑛

* */
public class NumOfCombinations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int factorialN = 1;
        int naturalNum1 = 1;

        int factorialK = 1;
        int naturalNum2 = 1;

        int result = 0;

        if ((n > 10 || n <= 0) && (k > 10 || k <= 0)) {
            System.out.println("Натуральное число n + k отрицательное, равно 0 или больше 10");
        } else {

            for (int i = 1; i <= n; i++) { // ищем факториал для n
                factorialN = factorialN + naturalNum1;
                naturalNum1++;
            }
            System.out.println("Факториал N = " + factorialN);

            for (int i = 1; i <= k; i++) { // ищем фактоиал для k
                factorialK = factorialK + naturalNum2;
                naturalNum2++;
            }
            System.out.println("Факториал K = " + factorialK);

            if (n >= k) { // ищем С k/n
                int nFactorialMinusKfactorial = factorialN / factorialK;
                result = factorialN / factorialK * (nFactorialMinusKfactorial);
            } else {
                System.out.println("N меньше k");
                return;
            }
        }
        System.out.println(result);
    }
}
