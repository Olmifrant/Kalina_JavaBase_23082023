package ua.hillel.kalina.lessons.less_015;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Выберете напиток из списка: ");
            System.out.println("1. Кофе");
            System.out.println("2. Чай");
            System.out.println("3. Лимонад");
            System.out.println("4. Мохито");
            System.out.println("5. Газировка");
            System.out.println("6. Кока Кола");
            System.out.println("7. Виски");
            System.out.println("8. Коньяк");
            System.out.println("9. Абсент");
            System.out.println("10. Текила");
            System.out.println("11. Закончить выбор напитков");

            int choice = 0;
            while (true) {
                if (scanner.hasNextInt()) {
                     choice = scanner.nextInt();
                    scanner.nextLine();
                    if (choice >= 0 && choice <= 11) {
                        break;
                    } else {
                        System.out.println("Выберите вариант с 1 по 11");
                    }
                } else {
                    System.out.println("Только цифры пожалуйста!");
                    scanner.nextLine();
                }
            }

            DrinksMachine drink;

            switch (choice) {

                case 1:
                    drink = DrinksMachine.COFFEE;
                    break;

                case 2:
                    drink = DrinksMachine.TEA;
                    break;

                case 3:
                    drink = DrinksMachine.LEMONADE;
                    break;

                case 4:
                    drink = DrinksMachine.MOCHITO;
                    break;

                case 5:
                    drink = DrinksMachine.SODA;
                    break;

                case 6:
                    drink = DrinksMachine.COCA_COLA;
                    break;

                case 7:
                    drink = DrinksMachine.WHISKEY;
                    break;

                case 8:
                    drink = DrinksMachine.COGNAC;
                    break;

                case 9:
                    drink = DrinksMachine.ABSCENT;
                    break;

                case 10:
                    drink = DrinksMachine.TEQUILA;
                    break;

                case 11:
                    Drinks.displayTotal();
                    return;

                default:
                    System.out.println("Неправильный выбор");
                    continue;

            }

            Drinks.makeDrink(drink);

            Drinks.calculateTotalAmount(drink);

        }

    }

}








