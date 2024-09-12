package arithmeticOperations;
/*
Напишите программу, которая считывает целое число и выводит текст, аналогичный приведенному в примере.
Пробелы, знаки препинания, заглавные и строчные буквы важны!

    Входные данные
    Вводится целое число, по модулю не превосходящее 10000.

    Выходные данные
    Выведите сначала фразу "The next number for the number ", затем введенное число, затем слово " is ",
    окруженное пробелами, затем формулу для следующего за введенным числа, наконец, знак точки без пробела.
    Аналогично в следующей строке для предыдущего числа. При необходимости используйте параметр вывода sep в языке Python*/

import java.util.Scanner;

public class NextAndPrevious {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int nextNumber = a + 1;
        int previousNumber = a - 1;

        System.out.println("The next number for the number " + a + " is " + nextNumber);
        System.out.println("The previous number for the number " + a + " is " + previousNumber);
    }


}
