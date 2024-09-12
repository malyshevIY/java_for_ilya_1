package arithmeticOperations;


import java.util.Scanner;

/*Дано целое число n. Выведите следующее за ним четное число.
 При решении этой задачи нельзя использовать условную инструкцию if и циклы.

Входные данные 7
Входные данные 8*/

public class NextEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int nextEvenNumberForA = a + 2 - a % 2;
        int nextEvenNumberForB = b + 2 - b % 2;

        System.out.println(nextEvenNumberForA);
        System.out.println(nextEvenNumberForB);
    }
}