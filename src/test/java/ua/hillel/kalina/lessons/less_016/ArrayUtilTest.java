package ua.hillel.kalina.lessons.less_016;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayUtilTest {


    @Test
    void testMethod1() {

        System.out.println("Tест 1 Если массив null");
        int [] array = null;
        int indexElement = ArrayUtil.averageSum(array);
        Assertions.assertEquals(-3,indexElement);
        System.out.println("Тест 1 PASS");
    }

    @Test
    void testMethod2() {

        System.out.println("Тест 2 Если массив пустой");
        int[] array = {};
        int indexElement = ArrayUtil.averageSum(array);
        Assertions.assertEquals(-2, indexElement);
        System.out.println("Тест 2 PASS");
    }

    @Test
    void testMethod3(){

        System.out.println("Тест 3 Когерентный массив ");
        int x = 0;
        int [] array = {14,74,44,74,85};
        ArrayUtil.averageSum(array);
        System.out.println("Тест PASS");

    }



//    @Test
//    void testMethod4(){
//        int [] [] array = new int[5][10];
//        Assertions.assertTrue();
//    }



}
