package ua.hillel.kalina.lessons.less_016;


public class ArrayUtil {

    public static double averageSum(int[] array) {
        if (array == null) {
            return 1;
        }
        if (array.length == 0) {
            return 2;
        }
        double x = 0;
        for (int i = 0; i < array.length; i++) {
            x = x + array[i];
        }
        double average = x / array.length;
        System.out.println("Cреднее арифметическое массива " + average);
        return (double) average;
    }

    public static int squareMatrix(int[][] array) {
        if (array == null) {
            return -3;
        }
        if (array.length == 0) {
            return -2;
        }

        if(array.length == array[0].length) {
            System.out.println("Двумерный массив является квадратным");
           return 1;
        }else {
            System.out.println("Двумерный массив не является квадратным");
        }
        return -1;
    }
}






