/*
Задание 1
Выведите на экран надпись “Your time is limited, so don’t waste it
living someone else’s life” Steve Jobs на разных строках. Пример вывода:
“Your time is limited,
    so don’t waste it
        living someone else’s life”
            Steve Jobs

Задание 2
Пользователь вводит с клавиатуры два числа. Первое число — это значение,
второе число процент, который необходимо посчитать. Например, мы ввели с
клавиатуры 50 и 10. Требуется вывести на экран 10 процентов от 50. Результат: 5

Задание 3
Пользователь вводит с клавиатуры три цифры. Необходимо создать число,
содержащее эти цифры. Например, если с клавиатуры введено 7, 3, 8,
тогда нужно сформировать число 738.

Задание 4
Пользователь вводит шестизначное число. Необходимо поменять в этом числе первую
и шестую цифры, а также вторую и пятую цифры. Например, 723895 должно превратиться в 593827.
Если пользователь ввел не шестизначное число требуется вывести сообщение об ошибке.

Задание 5
Пользователь вводит с клавиатуры номер месяца (от 1 до 12). В зависимости от
полученного номера месяца программа выводит на экран надпись: Winter (если
введено значение 1,2 или 12), Spring (если введено значение от 3 до 5),
Summer (если введено значение от 6 до 8), Autumn (если введено значение от 9 до 11).
Если пользователь ввел значение не в диапазоне от 1 до 12 требуется вывести сообщение об ошибке.

Задание 6
Пользователь вводит с клавиатуры количество метров. В зависимости от выбора
пользователя программа переводит метры в мили, дюймы или ярды.

Задание 7
Пользователь вводит с клавиатуры два числа. Нужно показать все нечетные числа
в указанном диапазоне. Если границы диапазона указаны неправильно требуется
произвести нормализацию границ. Например, пользователь ввел 20 и 11, требуется
нормализация, после которой начало диапазона станет равно 11, а конец 20.

Задание 8
Показать на экран таблицу умножения в диапазоне, указанном пользователем.
Например, если пользователь указал 3 и 5, таблица может выглядеть так:
3 * 1 = 3   3 * 2 = б   3 * 3 = 9 ....... 3 * 10 = 30
........
5 * 1 = 5   5 * 2 = 10  5 * 3 = 15 ......

Задание 9
В одномерном массиве, заполненном случайными числами, определить минимальный и
максимальный элементы, посчитать количество отрицательных элементов,
посчитать количество положительных элементов, посчитать количество нулей.
Результаты вывести на экран.

Задание 10
Есть одномерный массив, заполненный случайными числами. На основании данных этого массива нужно:
■	Создать одномерный массив, содержащий только четные числа из первого массива;
■	Создать одномерный массив, содержащий только нечетные числа из первого массива;
■	Создать одномерный массив, содержащий только отрицательные числа из первого массива;
■	Создать одномерный массив, содержащий только положительные числа из первого массива.

Задание 11
Напишите метод, который отображает горизонтальную или вертикальную линию из некоторого
символа. Метод принимает в качестве параметра: длину линии, направление, символ.

Задание 12
Напишите метод, сортирующий массив по убыванию или возрастанию в зависимости
от выбора пользователя.
*/

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.printf("Домашнее задание №1\n");

        for (int i = 1; i <= 12; i++) {
            System.out.println("Задание №" + i);
            switch(i)
            {
                case 1:
                    stingShow();
                    break;
                case 2:
                    percentOfNumber();
                    break;
                case 3:
                    createNumber();
                    break;
                case 4:
                    sixDigitNumber();
                    break;
                case 5:
                    showSeason();
                    break;
                case 6:
                    lengths();
                    break;
                case 7:
                    showOdd();
                    break;
                case 8:
                    showTable();
                    break;
                case 9:
                    analysisArray();
                    break;
                case 10:
                    createArray();
                    break;
                case 11:
                    lines();
                    break;
                case 12:
                    //sort();
                    break;
            }
        }
    }
    //Задание 1
    private static void stingShow(){
        String currentString =  "\"Your time is limited,\n\t" +
                                "so don’t waste it\n\t\t" +
                                "living someone else’s life.\"\n\t\t\t" +
                                "Steve Jobs";
        System.out.println(currentString);
    }
    //Задание 2
    private static void percentOfNumber(){
        int num = inputInt("Введите число, от которого будет получен процент:>");
        int percent = inputInt("Теперь введите число процентов:>");
        System.out.println(percent + "% от числа " + num + " = " + (double)(num * percent) / 100);
    }
    //Задание 3
    private static void createNumber(){
        int hundreds = inputInt("Введите первое число:>");
        int tens = inputInt("Введите второе число:>");
        int units = inputInt("Введите третье число:>");
        System.out.println(Integer.toString(hundreds) + Integer.toString(tens) + Integer.toString(units));
    }
    //Задание 4
    private static void sixDigitNumber(){
        int num = 0;
        while (true){
            num = inputInt("Введите шестизначное число:>");
            if (Integer.toString(num).length() == 6){
                break;
            } else {
                System.out.println("Ошибка: введено не шестизначное число, попробуйте снова...");
            }
        }
        String currentString = Integer.toString(num);
        StringBuilder newString = new StringBuilder(currentString);
        newString.setCharAt(0, currentString.charAt(5));
        newString.setCharAt(1, currentString.charAt(4));
        newString.setCharAt(4, currentString.charAt(1));
        newString.setCharAt(5, currentString.charAt(0));
        System.out.println("Результат замены: " + newString);
    }
    //Задание 5
    private static void showSeason(){
        String season = null;
        int num = 0;
        while (true){
            num = inputInt("Введите число от 1 до 12:>");
            if (num >= 1 && num <= 12){
                break;
            } else {
                System.out.println("Ошибка: число не в диапазоне от 1 до 12, попробуйте снова...");
            }
        }
        if(num > 2 && num < 6) {
            season = "Весна";
        } else if (num > 5 && num < 9) {
            season = "Лето";
        } else if (num > 8 && num < 12) {
            season = "Осень";
        } else season = "Зима";
        System.out.println("Это месяц времени года: " + season);
    }
    //Задание 6
    private static void lengths(){
        int meters = 0;
        double result = 0;
        int choise = 0;
        while (true){
            meters = inputInt("Введите число метров:>");
            if (meters > 0 ){
                break;
            } else {
                System.out.println("Ошибка: число должно быть больше 0, попробуйте снова...");
            }
        }
        System.out.println("1. Перевод в мили.\n2. Перевод в дюймы.\n3. Перевод в ярды.");
        while (true){
            choise = inputInt("Ваш выбор:>");
            if (choise > 0 && choise < 4){
                break;
            } else {
                System.out.println("Ошибка: число должно быть в диапазоне от 1 до 3, попробуйте снова...");
            }
        }
        String pref = meters + " метров это ";
        switch(choise) {
            case 1:
                result = meters * 0.000621371;
                System.out.println(pref + Double.toString(result) + " миль.");
                break;
            case 2:
                result = meters * 39.37008;
                System.out.println(pref + Double.toString(result) + " дюймов.");
                break;
            case 3:
                result = meters * 1.09361;
                System.out.println(pref + Double.toString(result) + " ярдов.");
                break;
        }
    }
    //Задание 7
    private static void showOdd(){
        int temp = 0;
        int first = inputInt("Введите первое число:>");
        int second = inputInt("Введите второе число:>");
        if(first > second) {
            temp = second;
            second = first;
            first = temp;
        }
        System.out.println("Все нечётные числа в диапазоне от " + first + " до " + second + ":");
        for(int i = first; i <= second; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    //Задание 8
    private static void showTable(){
        int temp = 0;
        int first = 0;
        int second = 0;
        while (true){
            first = inputInt("Введите первое число (от 1 до 9):>");
            if (first > 0 && first < 10 ){
                break;
            } else {
                System.out.println("Ошибка: число должно быть в диапазоне от 1 до 10, попробуйте снова...");
            }
        }
        while (true){
            second = inputInt("Введите второе число (от 1 до 9):>");
            if (second > 0 && second < 10 ){
                break;
            } else {
                System.out.println("Ошибка: число должно быть в диапазоне от 1 до 10, попробуйте снова...");
            }
        }
        if(first > second) {
            temp = second;
            second = first;
            first = temp;
        }
        System.out.println("Таблица умножения чисел от " + first + " до " + second + ":");
        for(int i = first; i <= second; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
    //Задание 9
    private static void analysisArray(){
        int size = 20;
        int min = 0;
        int max = 0;
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        int[] array = new int[size];
        Random random = new Random();
        System.out.print("Сгенерирован массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(51) - 25;
            max = array[i] < max ? max : array[i];
            min = array[i] > min ? min : array[i];
            positive = array[i] > 0 ? ++positive : positive;
            negative = array[i] < 0 ? ++negative : negative;
            zeros = array[i] == 0 ? ++zeros : zeros;

            System.out.print(array[i] + " ");
        }
        System.out.println("\nВ нём:");
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Положительных значений: " + positive);
        System.out.println("Отрицательных значений: " + negative);
        System.out.println("Нулей: " + zeros);
    }
    //Задание 10
    private static void createArray(){
        int size = 20;
        int even = 0;
        int odd = 0;
        int positive = 0;
        int negative = 0;
        int[] array = new int[size];
        Random random = new Random();
        System.out.print("Сгенерирован массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(51) - 25;
            even = array[i] % 2 == 0 ? ++even : even;
            odd = array[i] % 2 != 0 ? ++odd : odd;
            positive = array[i] > 0 ? ++positive : positive;
            negative = array[i] < 0 ? ++negative : negative;
            System.out.print(array[i] + " ");
        }
        System.out.println("\nИз него созданы:");
        int[] evenArray = new int[even];
        even = 0;
        int[] oddArray = new int[odd];
        odd = 0;
        int[] positiveArray = new int[positive];
        positive = 0;
        int[] negativeArray = new int[negative];
        negative = 0;
        for (int num : array) {
            if(num % 2 == 0) {
                evenArray[even] = num;
                ++even;
            };
            if(num % 2 != 0) {
                oddArray[odd] = num;
                ++odd;
            };
            if(num > 0) {
                positiveArray[positive] = num;
                ++positive;
            }
            if(num < 0) {
                negativeArray[negative] = num;
                ++negative;
            }
        }
        System.out.println("Массив чётных чисел: " + Arrays.toString(evenArray));
        System.out.println("Массив нечётных чисел: " + Arrays.toString(oddArray));
        System.out.println("Массив положительных чисел: " + Arrays.toString(positiveArray));
        System.out.println("Массив отрицательных чисел: " + Arrays.toString(negativeArray));
    }
    //Задание 11
    private static void lines(){
        int length = 0;
        int direction = 0;
        char symbol = ' ';
        while (true){
            length = inputInt("Введите длину линии от 1 до 20:>");
            if (length >= 1 && length <= 20){
                break;
            } else {
                System.out.println("Ошибка: число не в диапазоне от 1 до 20, попробуйте снова...");
            }
        }
        while (true){
            direction = inputInt("Введите направление (1 - вертикально, 2 - горизонтально):>");
            if (direction == 1 || direction == 2){
                break;
            } else {
                System.out.println("Ошибка: число не в диапазоне от 1 до 2, попробуйте снова...");
            }
        }
        System.out.print("Введите символ:>");
        String input = scanner.next(); // Считываем строку
        // Берём только первый символ введённой строки
        symbol = input.charAt(0);
        createLine(length, direction, symbol);
    }
    //Задание 12
    private static void sort(){

    }
//    Задание 11
//    Напишите метод, который отображает горизонтальную или вертикальную линию из некоторого
//    символа. Метод принимает в качестве параметра: длину линии, направление, символ.
//
//    Задание 12
//    Напишите метод, сортирующий массив по убыванию или возрастанию в зависимости
//    от выбора пользователя.

    private static void createLine(int length, int direction, char symbol ) {
        System.out.println("Рисуем линию:");
        while (length>0){
            if(direction == 1){
                System.out.println(symbol);
            } else {
                System.out.print(symbol);
            }
            --length;
        }
        System.out.println();
    }

    private static int inputInt(String message) {
        int number = 0;
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            } else {
                System.out.println("Ошибка: введено не целое число, попробуйте снова...");
                scanner.next(); // Очистка неверного ввода
            }
        }
        return number;
    }
}