package by.it.sgolovach.lesson04;

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


public class TaskC3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) {
            for (int b = 2; b <= 10; b++) {
                int c = b * i;
                String e = getWord1(i);
                String f = getWord2(b);
                String g = getWord3(c);
                System.out.println(e + " " + "умножить" + " " + "на" + " " + f + " " + "равно" + " " + g + " ");
            }
        }
    }

    static String getWord1(int i) {
        String d = new String();
        switch (i) {
            case 2:
                d = "два";
                break;
            case 3:
                d = "три";
                break;
            case 4:
                d = "четыре";
                break;
            case 5:
                d = "пять";
                break;
            case 6:
                d = "шесть";
                break;
            case 7:
                d = "семь";
                break;
            case 8:
                d = "восемь";
                break;
            case 9:
                d = "девять";
                break;
            case 10:
                d = "десять";
                break;
        }
        return d;
    }

    static String getWord2(int b) {
        String d = new String();
        switch (b) {
            case 2:
                d = "два";
                break;
            case 3:
                d = "три";
                break;
            case 4:
                d = "четыре";
                break;
            case 5:
                d = "пять";
                break;
            case 6:
                d = "шесть";
                break;
            case 7:
                d = "семь";
                break;
            case 8:
                d = "восемь";
                break;
            case 9:
                d = "девять";
                break;
            case 10:
                d = "десять";
                break;
        }
        return d;
    }

    static String getWord3(int c) {
        String d = new String();
        String e = new String();
        String f = new String();
        int b = c / 10;
        int a = c % 10;
        if (a == 0) {
            switch (c) {
                case 10:
                    d = "десять";
                    break;
                case 20:
                    d = "двадцать";
                    break;
                case 30:
                    d = "тридцать";
                    break;
                case 40:
                    d = "сорок";
                    break;
                case 50:
                    d = "пятьдесят";
                    break;
                case 60:
                    d = "шестьдесят";
                    break;
                case 70:
                    d = "семьдесят";
                    break;
                case 80:
                    d = "восемьдесят";
                    break;
                case 90:
                    d = "девяносто";
                    break;
                case 100:
                    d = "сто";
                    break;
            }

        } else if ((c >= 0) && (c <= 19)) {
            switch (c) {
                case 1:
                    d = "один";
                    break;
                case 2:
                    d = "два";
                    break;
                case 3:
                    d = "три";
                    break;
                case 4:
                    d = "четыре";
                    break;
                case 5:
                    d = "пять";
                    break;
                case 6:
                    d = "шесть";
                    break;
                case 7:
                    d = "семь";
                    break;
                case 8:
                    d = "восемь";
                    break;
                case 9:
                    d = "девять";
                    break;
                case 10:
                    d = "десять";
                    break;
                case 11:
                    d = "одиннадцать";
                    break;
                case 12:
                    d = "двенадцать";
                    break;
                case 13:
                    d = "тринадцать";
                    break;
                case 14:
                    d = "четырнадцать";
                    break;
                case 15:
                    d = "пятнадцать";
                    break;
                case 16:
                    d = "шестнадцать";
                    break;
                case 17:
                    d = "семнадцать";
                    break;
                case 18:
                    d = "восемнадцать";
                    break;
                case 19:
                    d = "девятнадцать";
                    break;
            }

        } else {
            switch (b) {
                case 2:
                    e = "двадцать";
                    break;
                case 3:
                    e = "тридцать";
                    break;
                case 4:
                    e = "сорок";
                    break;
                case 5:
                    e = "пятьдесят";
                    break;
                case 6:
                    e = "шестьдесят";
                    break;
                case 7:
                    e = "семьдесят";
                    break;
                case 8:
                    e = "восемьдесят";
                    break;
                case 9:
                    e = "девяносто";
                    break;
                case 10:
                    e = "сто";
                    break;
            }
            switch (a) {
                case 1:
                    f = "один";
                    break;
                case 2:
                    f = "два";
                    break;
                case 3:
                    f = "три";
                    break;
                case 4:
                    f = "четыре";
                    break;
                case 5:
                    f = "пять";
                    break;
                case 6:
                    f = "шесть";
                    break;
                case 7:
                    f = "семь";
                    break;
                case 8:
                    f = "восемь";
                    break;
                case 9:
                    f = "девять";
                    break;
                case 10:
                    f = "десять";
                    break;
            }
            d = e + " " + f;
        }

        return d;
    }

}
