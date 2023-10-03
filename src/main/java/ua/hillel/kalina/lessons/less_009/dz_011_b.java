package ua.hillel.kalina.lessons.less_009;

import java.util.Scanner;

public class dz_011_b {

    public static void main(String[] args) {


        System.out.println();
        System.out.println("Транспонирование  матрицы");
        System.out.println();


        Scanner sc1 = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.println("Введите количество строк матрицы (максимум 1000)");
            if (sc1.hasNextInt()) {
                int userValue = sc1.nextInt();
                if (userValue >= 2 && userValue <= 1000) {
                    System.out.println("Количество строк матрицы  = " + userValue);
                    System.out.println();
                    n = userValue;
                    sc1.nextLine();
                    break;

                } else {
                    System.out.println("В диапазоне от 2 до 100 пожалуйста!");
                    System.out.println();
                    sc1.nextLine();
                }
            } else {
                System.out.println("Введенные данные не являются числом!");
                System.out.println();
                sc1.nextLine();
            }
        }

        Scanner sc2 = new Scanner(System.in);
        int m = 0;

        while (true) {
            System.out.println("Введите количество столбцов матрицы (максимум 1000)  ");
            if (sc2.hasNextInt()) {
                int userValue = sc2.nextInt();
                if (userValue >= 2 && userValue <= 1000) {
                    System.out.println("Количество столбцов матрицы = " + userValue);
                    System.out.println();
                    m = userValue;
                    sc2.nextLine();
                    break;

                } else {
                    System.out.println("В диапазоне от 2 до 1000 пожалуйста!");
                    System.out.println();
                    sc2.nextLine();
                }
            } else {
                System.out.println("Введенные данные не являются числом!");
                System.out.println();
                sc2.nextLine();
            }
        }


        System.out.println("Количество строк    " + n);
        System.out.println("Количество столбцов " + m);
        System.out.println();
        System.out.println("Заполнение матрицы случайными значениями ");
        System.out.println();



        int [][] mat1 = new int[n][m];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mat1[i][j] = (int) (Math.random() * 101);
            }
        }

        System.out.println("Исходный вид матрицы ");
        System.out.println();
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(mat1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        int [][] mat2 = new int [m][n];

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mat2[j][i] = mat1[i][j];
            }
        }

        System.out.println("Транспонированный вид матрицы");
        System.out.println();
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                System.out.print(mat2[i][j] + "\t");
            }
            System.out.println();
        }






    }
}
























