package by.it.SemenovaO.lesson04;

/*
Напишите программу которая спрашивает у пользователя:
Какую вы хотите зарплату в $$$?

После ввода суммы, программа анализирует полученное значение
и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
Мы вам перезвоним!

Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.

Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.

Пример работы программы (у вас должно быть так же, до символа):

Какую вы хотите зарплату в $$$?
2000
За месяц 0 начислено $0.0
За январь начислено $3000.0
За февраль начислено $3000.0
За март начислено $3000.0
За апрель начислено $3000.0
За май начислено $3000.0
За июнь начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/

import java.util.Scanner;

public class TaskC1 {


    public static void main(String[] args) {
        System.out.println("Какую вы хотите зарплату в $$$?");

        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        double salaryPrem = salary * 1.5;



        if (salary >= 300 && salary <= 3000)
            for (int month = 0; month <= 14; month++) {
                if (month == 0 || month == 13 || month == 14)
                    System.out.println("За месяц " + month + " начислено $" + 0.0);

                else if (month == 1){
                    System.out.println("За январь начислено $" + salaryPrem);
                    if (salaryPrem==666) break;}
                else if (month == 2)
                    System.out.println("За февраль начислено $" + salaryPrem);
                else if (month == 3)
                    System.out.println("За март начислено $" + salaryPrem);
                else if (month == 4)
                    System.out.println("За апрель начислено $" + salaryPrem);
                else if (month == 5)
                    System.out.println("За май начислено $" + salaryPrem);
                else if (month == 6){
                    System.out.println("За июнь начислено $" + (salary*1.0));
                    if ((salary*1.0) == 666) break;
                }
                else if (month == 7)
                    System.out.println("За июль начислено $" + (salary*1.0));
                else if (month == 8)
                    System.out.println("За август начислено $" + (salary*1.0));
                else if (month == 9)
                    System.out.println("За сентябрь начислено $" + salaryPrem);
                else if (month == 10)
                    System.out.println("За октябрь начислено $" + salaryPrem);
                else if (month == 11)
                    System.out.println("За ноябрь начислено $" + salaryPrem);
                else if (month == 12)
                    System.out.println("За декабрь начислено $" + salaryPrem);
            }
        else System.out.println("Мы вам перезвоним!");
    }


}







  /*      for (int month = 0; month <= 14; month++) {

            if (month == 0 || month == 13 || month == 14) {
                System.out.println("За месяц " + month + " начислено $" + 0.0);
            }
            else if (month == 6 || month == 7 || month == 8){
                String monthName = String.valueOf(month);
                switch (month){
                }

                System.out.println("За " + monthName + " начислено $" + (salary*1.0));
            }
            else {
                String monthName = String.valueOf(month);
                switch (month) {
                  /*      break;

                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        System.out.println("За "+getMonth(month)+" начислено $" + (salary * 1.5));
                        break;
                    case 6:
                        System.out.println("За июнь начислено $" + salary);
                        break;
                    case 7:
                        System.out.println("За июль начислено $" + salary);
                        break;
                    case 8:
                        System.out.println("За август начислено $" + salary);
                        break;

                }
            } else break;*/




   /* public static String getNameMonth( ) {
       // String str = String.valueOf(m);

        switch (m) {
            case 1:
                str = "январь";
                break;
            case 2:
                str = "февраль";
                break;
            case 3:
                str = "март";
                break;
            case 4:
                str = "апрель";
                break;
            case 5:
                str = "май";
                break;
            case 6:
                str = "июнь";
                break;
            case 7:
                str = "июль";
                break;
            case 8:
                str = "август";
                break;
            case 9:
                str = "сентябрь";
                break;
            case 10:
                str = "октябрь";
                break;
            case 11:
                str = "ноябрь";
                break;
            case 12:
                str = "декабрь";
                break;
        }
        return str;*/





