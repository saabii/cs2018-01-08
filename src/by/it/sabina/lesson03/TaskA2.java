package by.it.sabina.lesson03;

/*
Lesson 04. Task A2. Стихотворение

В созданном вами методе main напишите следующий код:
Запишите свое любимое стихотворение в переменных a b c d и т.д. (типа String)
Выведите одну строку «Мое любимое стихотворение:».
Напишите еще одну строку вывода, но так, чтобы в результате выполнения программы
было выведено ваше любимое стихотворение.
В стихотворении должно быть не меньше, чем 4 строки.

Требования:
1.Программа должна выводить текст.
2.Перед стихом должна быть выведена строка "Мое любимое стихотворение:".
3.Выводимый текст должен состоять не меньше, чем из пяти строк (пустые строки - это тоже строки).
4.В выводимом тексте должно быть не менее, чем 50 символов.
5.Команд System.out.println в коде должно быть максимум две.

Для ручной проверки запустите программу Ctrl+Shift+F10
Для автоматической проверки откройте и запустите класс Testing
*/
class TaskA2 {
    public static void main(String[] args) {
        String a="Я вас любил: любовь еще, быть может,";
        String b="В душе моей угасла не совсем;";
        String c="Но пусть она вас больше не тревожит;";
        String d="Я не хочу печалить вас ничем.";
        String e="Я вас любил безмолвно, безнадежно,";
        String f="То робостью, то ревностью томим;";
        String g="Я вас любил так искренно, так нежно,";
        String h="Как дай вам бог любимой быть другим.";
        System.out.println("Мое любимое стихотворение:");
        System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f+"\n"+g+"\n"+h+"\n");
    }

}

