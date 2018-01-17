package by.it.kalabuhova.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

import java.util.function.IntToDoubleFunction;

public class TaskC3 {

    public static void main(String[] args) {
        /*class IntInText {
                public final static String x1 = "один";
                  public final static String x2 = "два";
                  public final static String x3 = "три";
                  public final static String x4 = "четыре";
                  public final static String x5 = "пять";
                  public final static String x6 = "шесть";
                  public final static String x7 = "семь";
                  public final static String x8 = "восемь";
                  public final static String x9 = "девять";
                  public final static String x10 = "десять";
                  public final static String x11 = "одинадцать";
                  public final static String x12 = "двенадцать";
                  public final static String x13 = "тринадцать";
                  public final static String x14 = "четырнадцать";
                  public final static String x15 = "пятнадцать";
                  public final static String x16 = "шестнадцать";
                  public final static String x17 = "семнадцать";
                  public final static String x18 = "восемнадцать";
                  public final static String x19 = "девятнадцать";
                  public final static String x20 = "двадцать";
                  public final static String x30 = "тридцать";
                  public final static String x40 = "сорок";
                  public final static String x50 = "пятьдесят";
                  public final static String x60 = "шестьдесят";
                  public final static String x70 = "семьдесят";
                  public final static String x80 = "восемдесят";
                  public final static String x90 = "девяносто";
                  public final static String x100 = "сто";
              */
            /*public static String ItS(int x) {
                int i = 0;
                String r;
                for (i = 1; i <= 10; i++) {
                    switch (i) {
                        case 1:
                            r = "один";
                            break;
                        case 2:
                            r = "два";
                            break;
                        case 3:
                            r = "три";
                            break;
                        case 4:
                            r = "четыре";
                            break;
                        case 5:
                            r = "пять";
                            break;
                        case 6:
                            r = "шесть";
                            break;
                        case 7:
                            r = "семь";
                            break;
                        case 8:
                            r = "восемь";
                            break;
                        case 9:
                            r = "девять";
                            break;
                        case 10:
                            r = "десять";
                            break;
                        case 11:
                            r = "одинадцать";
                            break;
                        case 12:
                            r = "двенадцать";
                            break;
                        return r;
                    }
                }
                for (int y = 1; y <= 10; y++) {
                    for (int j = 1; j <= 10; j++)
                        System.out.print(ItS(y) + "умножить на" + ItS(j) + "равно" + (y * j) + " ");
                    System.out.println();
                }
            }
        }
    }*/
}}
