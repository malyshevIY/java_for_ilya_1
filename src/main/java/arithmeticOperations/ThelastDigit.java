package arithmeticOperations;

import java.util.Scanner;

/*Дано натуральное число. Выведите его последнюю цифру.
 * Входные данные = 179*/

public class ThelastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int lastNumber = a % 100 % 10;
        System.out.println(lastNumber);
    }

}
