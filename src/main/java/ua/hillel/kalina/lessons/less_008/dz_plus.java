package ua.hillel.kalina.lessons.less_008;

import java.util.Scanner;

public class dz_plus {
    public static void main(String[] args) {


        System.out.println();
        System.out.println("Дополнительная домашняя работа");
        System.out.println();

        System.out.println("Создание массива");
        System.out.println();

        int[] mass = new int[15];
        for (int j = 0; j < mass.length; j++) {
            int rand1 = (int) ((Math.random() * 101));
            mass[j] = rand1;
        }
        System.out.println("Содержимое массива до сортировки");
        System.out.println();
        for (int j = 0; j < mass.length; j++) {
            if (j == mass.length - 1) {
                System.out.print(mass[j]);
            } else {
                System.out.print(mass[j] + ", ");
            }
        }
        System.out.println();


        int n = mass.length;
        for (int i = 1; i < n; i++) {
            int key = mass[i];
            int j = i - 1;
            while (j >= 0 && mass[j] > key) {
                mass[j + 1] = mass[j];
                j--;
            }

            mass[j + 1] = key;
        }
        System.out.println();

        System.out.println("Содержимое после сортировки");
        System.out.println();
        for (int j = 0; j < mass.length; j++) {
            if (j == mass.length - 1) {
                System.out.print(mass[j]);
            } else {
                System.out.print(mass[j] + ", ");
            }
        }
        System.out.println();
        System.out.println();


        int userNumb = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Какое число мы ищем ");
            if (scanner.hasNextInt()) {
                int userValue = scanner.nextInt();
                if (userValue >= 0 && userValue <= 100) {
                    System.out.println("Поиск числа = " + userValue);
                    System.out.println();
                    userNumb = userValue;
                    scanner.nextLine();
                    break;

                } else {
                    System.out.println("В диапазоне от 0 до 100 пожалуйста!");
                    System.out.println();
                    scanner.nextLine();
                }
            } else {
                System.out.println("Введенные данные не являются числом!");
                System.out.println();
                scanner.nextLine();
            }
        }


        System.out.println();
        System.out.println("Идет поиск");
        System.out.println();



        int index = -1;
        int left = 0;
        int right = mass.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (mass[mid] == userNumb) {
                index = mid;
                System.out.println("Число " + userNumb + " " + "находится в ячейке"  + " " + index);
                System.out.println();
                break;
            } else if (mass[mid] < userNumb) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (index == -1){
            System.out.println("Поиск не дал результатов");
        }
        System.out.println();

    }
}








