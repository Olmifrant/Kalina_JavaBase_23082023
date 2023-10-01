package ua.hillel.kalina.lessons.less_008;

import java.util.Arrays;
import java.util.Scanner;

public class dz_010 {

    public static void main(String[] args) {


        System.out.println();
        System.out.println("Лотерея");
        System.out.println();

        int[] userNumb = new int[7];
        for (int i = 0; i < userNumb.length; i++) {

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Пожалуйста введите  число в диапазоне от 0 до 9 включительно.");
                if (scanner.hasNextInt()) {
                    int userValue = scanner.nextInt();
                    if (userValue >= 0 && userValue <= 9) {
                        System.out.println("Ваше число = " + userValue);
                        System.out.println();
                        userNumb[i] = userValue;
                        scanner.nextLine();
                        break;

                    } else {
                        System.out.println("В диапазоне от 0 до 9 пожалуйста!");
                        System.out.println();
                        scanner.nextLine();
                    }
                } else {
                    System.out.println("Введенные данные не являются числом!");
                    System.out.println();
                    scanner.nextLine();
                }
            }
        }

        System.out.print("Вы ввели числа ");
        for (int i = 0; i < userNumb.length; i++) {
            if (i == userNumb.length - 1) {
                System.out.print(userNumb[i]);
            } else {
                System.out.print(userNumb[i] + ", ");
            }
        }
        System.out.println();

        int[] lotNumb = new int[7];
        for (int j = 0; j < lotNumb.length; j++) {
            int rand1 = (int) ((Math.random() * 10));
            lotNumb[j] = rand1;
        }
        System.out.print("Номера лотереи ");
        for (int j = 0; j < lotNumb.length; j++) {
            if (j == lotNumb.length - 1) {
                System.out.print(lotNumb[j]);
            } else {
                System.out.print(lotNumb[j] + ", ");
            }
        }

        System.out.println();

        for (int i = 0; i < userNumb.length - 1; i++) {
            for (int j = 0; j < userNumb.length - 1 - i; j++) {
                if (userNumb[j] < userNumb[j + 1]) {
                    int temp = userNumb[j];
                    userNumb[j] = userNumb[j + 1];
                    userNumb[j + 1] = temp;
                }
            }
        }

        System.out.println();

        int[] sortUsNum = Arrays.stream(userNumb).sorted().toArray();

        System.out.print("Отсортированные введенные числа  ");
        for (int i = 0; i < sortUsNum.length; i++) {
            if (i == sortUsNum.length - 1) {
                System.out.print(sortUsNum[i]);
            } else {
                System.out.print(sortUsNum[i] + ", ");
            }
        }

        System.out.println();

        int[] sortRandNum = Arrays.stream(lotNumb).sorted().toArray();

        System.out.print("Отсортированные числа лотереи    ");
        for (int j = 0; j < sortRandNum.length; j++) {
            if (j == sortRandNum.length - 1) {
                System.out.print(sortRandNum[j]);
            } else {
                System.out.print(sortRandNum[j] + ", ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Идет поиск совпадений");
        System.out.println();

        int count = 0;
        for (int i = 0; i < sortUsNum.length ; i++) {
            if (sortUsNum[i] == sortRandNum[i]) {
                System.out.println("Совпадение в ячейке " + i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Совпадений нет");
        } else {
            System.out.println();
            System.out.println("Общее количество совпадений " + count);
        }


    }
}












