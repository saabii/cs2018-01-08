package by.it.SemenovaO.lesson04;

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
        int date = sc.nextInt();
        int month = sc.nextInt();

        int jan = 31, feb = 28, march = 31, apr = 30,  may = 31, june = 30,
        july = 31, aug = 31, sept = 30, oct = 31,  nov = 30, dec = 31;

        switch (month) {

            case 1:
                System.out.println(date);
                break;
            case 2:
                System.out.println(jan + date);
                break;
            case 3:
                System.out.println((jan + feb) + date);
                break;
            case 4:
                System.out.println((jan + feb + march) + date);
                break;
            case 5:
                System.out.println((jan + feb + march + apr) + date);
                break;
            case 6:
                System.out.println((jan + feb + march + apr + may ) + date);
                break;
            case 7:
                System.out.println((jan + feb + march + apr + may + june) + date);
                break;
            case 8:
                System.out.println((jan + feb + march + apr + may + june + july) + date);
                break;
            case 9:
                System.out.println((jan + feb + march + apr + may + june + july + aug) + date);
                break;
            case 10:
                System.out.println((jan + feb + march + apr + may + june + july + aug + sept) + date);
                break;
            case 11:
                System.out.println((jan + feb + march + apr + may + june + july + aug + sept + oct) + date);
                break;
            case 12:
                System.out.println((jan + feb + march + apr + may + june + july + aug + sept + oct + nov) + date);
                break;
        }
    }


}

