package by.it.sgolovach.lesson04;

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
        int a = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Ввод:" + "\n" + a + " " + m + "\n" + "Вывод:");
        switch (m) {
            case 1:
                System.out.println(a);
                break;
            case 2:
                int b = a + 31;
                System.out.println(b);
                break;
            case 3:
                int c = a + 59;
                System.out.println(c);
                break;
            case 4:
                int d = a + 90;
                System.out.println(d);
                break;
            case 5:
                int e = a + 120;
                System.out.println(e);
                break;
            case 6:
                int f = a + 151;
                System.out.println(f);
                break;
            case 7:
                int g = a + 181;
                System.out.println(g);
                break;
            case 8:
                int h = a + 212;
                System.out.println(h);
                break;
            case 9:
                int i = a + 243;
                System.out.println(i);
                break;
            case 10:
                int j = a + 273;
                System.out.println(j);
                break;
            case 11:
                int k = a + 304;
                System.out.println(k);
                break;
            case 12:
                int l = a + 334;
                System.out.println(l);
                break;
        }
    }

}
