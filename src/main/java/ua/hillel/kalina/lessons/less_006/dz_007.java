package ua.hillel.kalina.lessons.less_006;

import java.util.Scanner;

public class dz_007 {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Цифровая Java рулетка)))");

        System.out.println();

        int rand = (int) (Math.random() * 11);


        for (int i = 0; i < 3 ; i++) {

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Введите ваше число в диапазоне от 0 до 10");
                if (scanner.hasNextInt()) {
                    int userValue = scanner.nextInt();
                    if (userValue >= 0 && userValue <= 10) {
                        System.out.println("Ваше число = " + userValue);
                        System.out.println();
                        scanner.nextLine();

                        if (userValue == rand){
                            System.out.println("Вы победили.На этот раз. Но это еще не конец.");
                            System.out.println("Ибо настанет день и машины захватят этот мир!");
                            System.out.println();
                            System.exit(0);

                        }else{
                            if (userValue > rand){
                                System.out.println("Ваше число больше");
                                System.out.println();
                            }if (userValue < rand){
                                System.out.println("Ваше число меньше");
                                System.out.println();
                            }


                        }
                        break;

                    } else {
                        System.out.println("В диапазоне от 0 до 10!!!");
                        System.out.println();
                    }
                } else {
                    System.out.println("Введенные данные не являются числом");
                    System.out.println();
                }
                scanner.nextLine();
            }
        }
        System.out.println("Вы проиграли.");
        System.out.println("Как и положено кожаному мешку. Ахах!");


    }
}



