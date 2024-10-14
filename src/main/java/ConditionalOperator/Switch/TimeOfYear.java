package ConditionalOperator.Switch;

import java.util.Scanner;

/*Пользователь вводит номер месяца. Вывести время года
12
Winter

*  */


public class TimeOfYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        switch (a) {
            case 1:
            case 2:
            case 12:
                System.out.println(a + " Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(a + " Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(a + " Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(a + " Autumn");
                break;
            default:
                System.out.println("Введите число от 1 до 12 включительно");
        }
    }
}
