package ConditionalOperator.Switch;

import java.util.Scanner;

/*
 * Реализовать калькулятор
 * */

public class Сalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        char c = scanner.next().charAt(0);

        switch (c) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                System.out.println("Result: " + (a / b));
                break;
            default:
                System.out.println("Введите: '+', '*' или '/' ");
        }
    }
}
