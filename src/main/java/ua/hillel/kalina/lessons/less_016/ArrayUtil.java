package ua.hillel.kalina.lessons.less_016;

import java.util.Arrays;

public class ArrayUtil {

    public static int averageSum(int[] array) {
        if (array == null) {
            return -3;
        }
        if (array.length == 0) {
            return -2;
        }

        int x = 0;
        for (int i = 0; i < array.length; i++) {
            x = x + array[i];
        }
        int average = x / array.length;

        System.out.println(average);

        return -1;
    }


}






