package ua.hillel.kalina.lessons.less_016;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ArrayUtilTest {

    @Test
    void testMethod1() {

        System.out.println("Tест 1 Если массив null");
        int [] array = null;
        double indexElement = ArrayUtil.averageSum(array);
        Assertions.assertEquals(1,indexElement);
        System.out.println("Тест 1 PASS");
        System.out.println();
    }
    @Test
    void testMethod2() {

        System.out.println("Тест 2 Если массив пустой");
        int[] array = {};
        double indexElement = ArrayUtil.averageSum(array);
        Assertions.assertEquals(2, indexElement);
        System.out.println("Тест 2 PASS");
        System.out.println();
    }
    @Test
    void testMethod3() {

        System.out.println("Тест 3 Когерентный массив");

        int[] array = {1,2,3,4,6};
        double indexElement = ArrayUtil.averageSum(array);
        Assertions.assertEquals(3.2, indexElement);
        System.out.println("Тест PASS");
        System.out.println();
    }

    @Test
    void testMethod4() {

        System.out.println("Тест 4 Когерентный массив");

        int[] array = {1,2,3,4,6,10,8,4,1};
        double indexElement = ArrayUtil.averageSum(array);
        Assertions.assertEquals(4.3333333333333333, indexElement);
        System.out.println("Тест PASS");
        System.out.println();
    }
    @Test
    void testMethod5() {

        System.out.println("Тест 5 Когерентный массив");

        int[] array = {1,52,41,854,63,41,75,35,42};
        double indexElement = ArrayUtil.averageSum(array);
        Assertions.assertEquals(133.777777777777777,indexElement);
        System.out.println("Тест PASS");
        System.out.println();
    }

    @Test
    void testMethod6(){
        System.out.println("Массив NULL");
        int [][] array = null;
        int indexElement = ArrayUtil.squareMatrix(array);
        Assertions.assertEquals(-3,indexElement);
        System.out.println("Тест 1 PASS");
        System.out.println();
    }
    @Test
    void testMethod7(){
        System.out.println("Пустой массив");
        int [][] array = new int[0][0];
        int indexElement = ArrayUtil.squareMatrix(array);
        Assertions.assertEquals(-2,indexElement);
        System.out.println("Тест 1 PASS");
        System.out.println();
    }
    @Test
    void testMethod8(){
        System.out.println("Квадратный массив");
        int [][] array = new int[5][5];
        int indexElement = ArrayUtil.squareMatrix(array);
        Assertions.assertEquals(1,indexElement);
        System.out.println("Тест 1 PASS");
        System.out.println();
    }
    @Test
    void testMethod9(){
        System.out.println("Не квадратный массив");
        int [][] array = new int[5][8];
        int indexElement = ArrayUtil.squareMatrix(array);
        Assertions.assertEquals(-1,indexElement);
        System.out.println("Тест 1 PASS");
        System.out.println();
    }

}
