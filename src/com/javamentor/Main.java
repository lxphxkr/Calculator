package com.javamentor;

// Консольное приложение калькулятор

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ведите арифметическую операцию из двух чисел:" + "\n" +
                "(от 1 до 10 арабскими или римскими числами, " + "через пробел)");

//сканнер введенной информации

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

//переменные для присваивания им значений из массива введенной арифметической операции

        String inp1;
        String inp2;
        String inp3;
        int Rom1;
        int Rom2;
        int num1;
        int num2;


//разделение введенного текста на элементы.
// В качестве разделителя использую пробел

        String[] elements = text.split(" ");

// исключение для количества элементов в массиве,
// чтобы избежать ввода без пробела и ввода более или менее двух чисел

        int els = elements.length;
        if (els < 3 | els > 3) {
            System.out.println("Неправильный ввод операции! Калькулятор будет закрыт!");
            System.exit(0);
        }

//присваивание значения элементов массива строкам

        inp1 = elements[0];
        inp2 = elements[1];
        inp3 = elements[2];


//присваивание значений для первого арабского и римского числа
        Rom1 = -1;
        num1 = -1;
        switch (inp1) {
            case ("I"):
                Rom1 = 1;
                break;
            case ("II"):
                Rom1 = 2;
                break;
            case ("III"):
                Rom1 = 3;
                break;
            case ("IV"):
                Rom1 = 4;
                break;
            case ("V"):
                Rom1 = 5;
                break;
            case ("VI"):
                Rom1 = 6;
                break;
            case ("VII"):
                Rom1 = 7;
                break;
            case ("VIII"):
                Rom1 = 8;
                break;
            case ("IX"):
                Rom1 = 9;
                break;
            case ("X"):
                Rom1 = 10;
                break;
            case ("1"):
                num1 = 1;
                break;
            case ("2"):
                num1 = 2;
                break;
            case ("3"):
                num1 = 3;
                break;
            case ("4"):
                num1 = 4;
                break;
            case ("5"):
                num1 = 5;
                break;
            case ("6"):
                num1 = 6;
                break;
            case ("7"):
                num1 = 7;
                break;
            case ("8"):
                num1 = 8;
                break;
            case ("9"):
                num1 = 9;
                break;
            case ("10"):
                num1 = 10;
                break;
            default:
                System.out.println("Неправильный ввод операции! Программа будет закрыта!");
                System.exit(0);
                break;

        }
//присваивание значений для второго арабского и римского числа
        Rom2 = -1;
        num2 = -1;
        switch (inp3) {
            case ("I"):
                Rom2 = 1;
                break;
            case ("II"):
                Rom2 = 2;
                break;
            case ("III"):
                Rom2 = 3;
                break;
            case ("IV"):
                Rom2 = 4;
                break;
            case ("V"):
                Rom2 = 5;
                break;
            case ("VI"):
                Rom2 = 6;
                break;
            case ("VII"):
                Rom2 = 7;
                break;
            case ("VIII"):
                Rom2 = 8;
                break;
            case ("IX"):
                Rom2 = 9;
                break;
            case ("X"):
                Rom2 = 10;
                break;
            case ("1"):
                num2 = 1;
                break;
            case ("2"):
                num2 = 2;
                break;
            case ("3"):
                num2 = 3;
                break;
            case ("4"):
                num2 = 4;
                break;
            case ("5"):
                num2 = 5;
                break;
            case ("6"):
                num2 = 6;
                break;
            case ("7"):
                num2 = 7;
                break;
            case ("8"):
                num2 = 8;
                break;
            case ("9"):
                num2 = 9;
                break;
            case ("10"):
                num2 = 10;
                break;
            default:
                System.out.println("Неправильный ввод операции! Программа будет закрыта!");
                System.exit(0);
                break;
        }
//перевод второго элемента в знаковый тип

        char oper = inp2.charAt(0);

//арифметические операции на основе полученного знака
        int result = 1;
        int resRom = 1;
        switch (oper) {
            case ('-'):
                result = num1 - num2;
                resRom = Rom1 - Rom2;
                break;
            case ('+'):
                result = num1 + num2;
                resRom = Rom1 + Rom2;
                break;
            case ('/'):
                result = num1 / num2;
                resRom = Rom1 / Rom2;
                break;
            case ('*'):
                result = num1 * num2;
                resRom = Rom1 * Rom2;
                break;
            default: //исключение, которое будет закрывать программу
                System.out.println("Вы ввели неправильный знак операции! Программа будет закрыта!");
                System.exit(0);
                break;
        }

//преобразование из арабских чисел в римские
        int romRes1;
        int romRes2;
        romRes2 = resRom % 10;
        romRes1 = resRom - romRes2;
        String romOut1;
        String romOut2;
        String finalRom;
        romOut1 = "";
        romOut2 = "";

        switch (romRes1) {
            case (10):
                romOut1 = "X";
                break;
            case (20):
                romOut1 = "XX";
                break;
            case (30):
                romOut1 = "XXX";
                break;
            case (40):
                romOut1 = "XL";
                break;
            case (50):
                romOut1 = "L";
                break;
            case (60):
                romOut1 = "LX";
                break;
            case (70):
                romOut1 = "LXX";
                break;
            case (80):
                romOut1 = "LXXX";
                break;
            case (90):
                romOut1 = "XC";
                break;
            case (100):
                romOut1 = "C";
                break;
        }
        switch (romRes2) {
            case (1):
                romOut2 = "I";
                break;
            case (2):
                romOut2 = "II";
                break;
            case (3):
                romOut2 = "III";
                break;
            case (4):
                romOut2 = "IV";
                break;
            case (5):
                romOut2 = "V";
                break;
            case (6):
                romOut2 = "VI";
                break;
            case (7):
                romOut2 = "VII";
                break;
            case (8):
                romOut2 = "VIII";
                break;
            case (9):
                romOut2 = "IX";
                break;
        }
        finalRom = romOut1 + romOut2;
//исключения для  ввода только арабских либо только римских чисел без присутствия любых других знаков. Для этого переменным присвоили значение -1
        if (num1 > 0 && num2 < 1) {
            System.out.println("Неправильный ввод операции! Калькулятор будет закрыт!");
            System.exit(0);


        }
        if (Rom1 > 0 && Rom2 < 1) {
            System.out.println("Неправильный ввод операции! Калькулятор будет закрыт!");
            System.exit(0);

        }
        if (num2 > 0 && num1 < 1) {
            System.out.println("Неправильный ввод операции! Калькулятор будет закрыт!");
            System.exit(0);
        }
        if (Rom2 > 0 && Rom1 < 1) {
            System.out.println("Неправильный ввод операции! Калькулятор будет закрыт!");
            System.exit(0);
        }
//вывод результата для арабских чисел
        if (Rom1 <= 0 & Rom2 <= 0) {
            System.out.println("Ваш результат:" + "\n" + result + "\n" +
                    "Спасибо за использование программы!");

        }
//вывод результата для римских чисел
        if (num1 <= 0 & num2 <= 0) {
            System.out.println("Ваш результат:" + "\n" + finalRom + "\n" +
                    "Спасибо за использование программы!");

        }
        input.close();

    }

}


