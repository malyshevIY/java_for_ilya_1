package LoopWhile;


import java.util.Scanner;

/*
* Дана последовательность положительных чисел, оканчивающаяся нулем.
Вывести количество цифр в каждом числе
7
digits: 1
23847
digits: 5
66
digits: 2
0
* */
public class SequenceOfPositiveNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int copyOfNum;
        int count = 0;


        while (x != 0) {
            if (x < 0) {
                System.out.println("no positive");
                break;

            } else {
                copyOfNum = x;
                while (copyOfNum > 0) {
                    copyOfNum = copyOfNum / 10;
                    count++;
                }
                System.out.println("В числе " + x + " " + " количество цифр = " + count);
                count = 0;
            }

            x = scanner.nextInt();
        }
    }
}
