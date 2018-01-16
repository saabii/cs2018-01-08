package by.it.SemenovaO.lesson03;

import java.util.Scanner;

/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {

    public static int sumDigitsInNumber(int number) {
        int num1 = number / 1000; // первая цифра
        int num2 = (number - num1 * 1000) / 100;//вторая цифра
        int num3 = (number - num1 * 1000 - num2 * 100) / 10;//третья цифра
        int num4 = number - num1 * 1000 - num2 * 100 - num3 * 10;//четвертая цифра
        int sum = num1 + num2 + num3 + num4;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Введите число, содержащее от 0 до 4 знаков:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        //Ограничения на вввод четырехзначных чисел, т.к. при вводе 5 знаков и более программа работает некорректно
        int i = 0;
        int n = number;
        while (n != 0) {
            n = n / 10;
            i++;
        }
        if (i < 5) {
            System.out.println(sumDigitsInNumber(number));
        } else
            System.out.println("Вы ввели неправильное число. Попытайтесь заново");
    }
}



