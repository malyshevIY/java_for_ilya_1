package arithmeticOperations;

/*N школьников делят K яблок поровну, неделящийся остаток остается в корзинке. Сколько яблок останется в корзинке?*/

import java.util.Scanner;

public class ShareApples2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int count = k % n;
        System.out.println(count);

    }
}
