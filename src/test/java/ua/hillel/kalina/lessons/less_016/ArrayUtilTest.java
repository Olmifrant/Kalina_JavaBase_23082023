package ua.hillel.kalina.lessons.less_016;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ArrayUtilTest {

    @Test
    void testMethod001() {

        System.out.println("Метод 1 тест 1 Если массив null");
        int [] array = null;
        double indexElement = ArrayUtil.averageSum(array);
        Assertions.assertEquals(1,indexElement);
        System.out.println("Тест PASS");
        System.out.println();
    }
    @Test
    void testMethod002() {

        System.out.println("Метод 1 тест 2 Если массив пустой");
        int[] array = {};
        double indexElement = ArrayUtil.averageSum(array);
        Assertions.assertEquals(2, indexElement);
        System.out.println("Тест PASS");
        System.out.println();
    }
    @Test
    void testMethod003() {

        System.out.println("Метод 1 тест 3 Когерентный массив");

        int[] array = {1,2,3,4,6};
        double indexElement = ArrayUtil.averageSum(array);
        Assertions.assertEquals(3.2, indexElement);
        System.out.println("Тест PASS");
        System.out.println();
    }

    @Test
    void testMethod004() {

        System.out.println("Метод 1 тест 4 Когерентный массив");

        int[] array = {1,2,3,4,6,10,8,4,1};
        double indexElement = ArrayUtil.averageSum(array);
        Assertions.assertEquals(4.3333333333333333, indexElement);
        System.out.println("Тест PASS");
        System.out.println();
    }
    @Test
    void testMethod005() {

        System.out.println("Метод 1 тест 5 Когерентный массив");

        int[] array = {1,52,41,854,63,41,75,35,42};
        double indexElement = ArrayUtil.averageSum(array);
        Assertions.assertEquals(133.777777777777777,indexElement);
        System.out.println("Тест PASS");
        System.out.println();
    }

    @Test
    void testMethod006(){
        System.out.println("Метод 2 тест 1 Матрица null");
        int [][] array = null;
        int indexElement = ArrayUtil.squareMatrix(array);
        Assertions.assertEquals(-3,indexElement);
        System.out.println("Тест PASS");
        System.out.println();
    }
    @Test
    void testMethod007(){
        System.out.println("Метод 2 тест 2 Матрица 0*0");
        int [][] array = new int[0][0];
        int indexElement = ArrayUtil.squareMatrix(array);
        Assertions.assertEquals(-2,indexElement);
        System.out.println("Тест PASS");
        System.out.println();
    }
    @Test
    void testMethod008(){
        System.out.println("Метод 2 тест 3 Матрица 5*5");
        int [][] array = new int[5][5];
        int indexElement = ArrayUtil.squareMatrix(array);
        Assertions.assertEquals(1,indexElement);
        System.out.println("Тест PASS");
        System.out.println();
    }
    @Test
    void testMethod009(){
        System.out.println("Метод 2 тест 4 Матрица 5*8");
        int [][] array = new int[5][8];
        int indexElement = ArrayUtil.squareMatrix(array);
        Assertions.assertEquals(-1,indexElement);
        System.out.println("Тест PASS");
        System.out.println();
    }

    @Test
    void testMethod010(){
        System.out.println("Метод 2 тест 5 Матрица 9*7");
        int [][] array = new int[9][7];
        int indexElement = ArrayUtil.squareMatrix(array);
        Assertions.assertEquals(-1,indexElement);
        System.out.println("Тест PASS");
        System.out.println();
    }
}
