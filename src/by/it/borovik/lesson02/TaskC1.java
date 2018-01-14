package by.it.borovik.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/

class TaskC1 {
    public static void main(String[] args) {
        System.out.print("Введите клавиатурой число 34");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("Введите клавиатурой число 26");
        int b = scan.nextInt();
        System.out.print("Сумма чисел 26 и 34 равна "+(a+b));

    }
}
