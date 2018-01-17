package by.it.kalabuhova.lesson04;

import java.util.Arrays;
import java.util.Scanner;

/*
На входе вводится число и месяц 2017 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        switch (m - 1) {
            case 0:
                System.out.println(d);
                break;
            case 1:
                System.out.println(31 + d);
                break;
            case 2:
                System.out.println(59 + d);
                break;
            case 3:
                System.out.println(90 + d);
                break;
            case 4:
                System.out.println(120 + d);
                break;
            case 5:
                System.out.println(151 + d);
                break;
            case 6:
                System.out.println(181 + d);
                break;
            case 7:
                System.out.println(212 + d);
                break;
            case 8:
                System.out.println(243 + d);
                break;
            case 9:
                System.out.println(273 + d);
                break;
            case 10:
                System.out.println(304 + d);
                break;
            case 11:
                System.out.println(334 + d);
                break;
        }

    }
}
