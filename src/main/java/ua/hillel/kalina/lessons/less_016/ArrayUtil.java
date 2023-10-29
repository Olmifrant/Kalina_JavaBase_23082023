package ua.hillel.kalina.lessons.less_016;

public class ArrayUtil {


    // if quatro - return -2
    // if null - return -3


    public static int getIndexElement(int[] array, int element) {
        if (array == null) {
            return -3;
        }

        if (array.length == 0) {
            return -2;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }

        return -1;
    }





    public static int metod1(int[][] aray) {
        if (aray == null) {
            return -3;

        }

        if (aray[i].length == aray[j].length) {
            return -2;

        }
        return -1;
    }
}
