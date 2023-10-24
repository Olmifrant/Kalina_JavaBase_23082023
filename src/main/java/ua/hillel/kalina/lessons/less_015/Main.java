package ua.hillel.kalina.lessons.less_015;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Автомат с напитками");


        while (true) {
            System.out.println();
            System.out.println("Выберете напиток из списка: ");
            System.out.println("01. Кофе");
            System.out.println("02. Чай");
            System.out.println("03. Лимонад");
            System.out.println("04. Мохито");
            System.out.println("05. Газировка");
            System.out.println("06. Кока Кола");
            System.out.println("07. Виски");
            System.out.println("08. Коньяк");
            System.out.println("09. Абсент");
            System.out.println("10. Текила");
            System.out.println("11. Закончить выбор напитков");

            Scanner scanner = new Scanner(System.in);
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
                    System.out.println("JAVе так спокойнее");
                    continue;

            }

            Drinks.makeDrink(drink);

            Drinks.calculateTotalAmount(drink);

        }

    }

}








