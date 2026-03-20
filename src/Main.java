import java.util.Scanner;

public class Main {
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
                    System.out.println(i);
                    break;
            }

        }
    }

    static void stingShow(){
        String currentString =
                "\"Your time is limited,\n\t" +
                        "so don’t waste it\n\t\t" +
                        "living someone else’s life.\"\n\t\t\t" +
                        "Steve Jobs";
        System.out.println(currentString);
    }

    static void percentOfNumber(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите число, от которого будет получен процент:");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                System.out.println("Теперь введите число процентов:");
                if (scanner.hasNextInt()) {
                    int percent = scanner.nextInt();
                    System.out.println(percent + "% от числа " + num + " = " + (num * percent) / 100);
                    return;
                } else {
                    System.out.println("Ошибка: введено не число.");
                }
            } else {
                System.out.println("Ошибка: введено не число.");
            }
            scanner.close();
        }
    }
}