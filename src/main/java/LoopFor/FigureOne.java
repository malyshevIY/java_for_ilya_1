package LoopFor;

import java.util.Scanner;

/*
* Вывести следуюшую фигуру
n=5
 *****
 ****
 ***
 **
 *

* */
public class FigureOne {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println(i);
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
