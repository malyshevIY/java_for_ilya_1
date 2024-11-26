package LoopFor;

/*

        *
      ***
    *****
  *******
*********
  *******
    *****
      ***
        *

* */
public class FigureThree {
    public static void main(String[] args) {
        int n = 9;
        int middle = n / 2 + 1;

        for (int i = 1; i <= middle; i++) {
            for (int j = 1; j <= n - (i * 2) + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
       }

        for (int i = 1; i <= middle - 1 ; i++) {
            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - (i * 2); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
