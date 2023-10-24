package ua.hillel.kalina.lessons.less_015;

public class Drinks {

    public static final double COFFEE_PRICE = 2.0;
    public static final double TEA_PRICE = 1.25;
    public static final double LEMONADE_PRICE = 1.75;
    public static final double MOCHITO_PRICE = 3.50;
    public static final double SODA_PRICE = 1.25;
    public static final double COCA_COLA_PRICE = 2.0;
    public static final double WHISKEY_PRICE = 10.25;
    public static final double COGNAC_PRICE = 8.50;
    public static final double ABSCENT_PRICE = 9.75;
    public static final double TEQUILA_PRICE = 7.50;
    private static double totalСost = 0.0;
    private static int totalDrinks = 0;



    public static void makeDrink(DrinksMachine drink) {

        switch (drink) {

            case COFFEE:
                System.out.println("Выполнен заказ Кофе стоимостью " + COFFEE_PRICE + " UAH");
                break;

            case TEA:
                System.out.println("Выполнен заказ Чай стоимостью " + TEA_PRICE + " UAH");
                break;

            case LEMONADE:
                System.out.println("Выполнен заказ Лимонад стоимостью " + LEMONADE_PRICE + " UAH");
                break;

            case MOCHITO:
                System.out.println("Выполнен заказ Мохито стоимостью " + MOCHITO_PRICE + " UAH");
                break;

            case SODA:
                System.out.println("Выполнен заказ Газировка стоимостью " + SODA_PRICE + " UAH");
                break;

            case COCA_COLA:
                System.out.println("Выполнен заказ Кока Кола стоимостью " + COCA_COLA_PRICE + " UAH");
                break;

            case COGNAC:
                System.out.println("Выполнен заказ Коньяк стоимостью " + COGNAC_PRICE + " UAH");
                break;

            case WHISKEY:
                System.out.println("Выполнен заказ Виски стоимостью " + WHISKEY_PRICE + " UAH");
                break;

            case ABSCENT:
                System.out.println("Выполнен заказ Абсент стоимостью " + ABSCENT_PRICE + " UAH");
                break;

            case TEQUILA:
                System.out.println("Выполнен заказ Текила стоимостью " + TEQUILA_PRICE + " UAH");
                break;

            default:
                System.out.println("Для душевного спокойствия JAVы ");

        }
        totalDrinks++;

    }

    public static void calculateTotalAmount(DrinksMachine drink) {

        switch (drink) {

            case COFFEE:
                totalСost += COFFEE_PRICE;
                break;

            case TEA:
                totalСost += TEA_PRICE;
                break;

            case LEMONADE:
                totalСost += LEMONADE_PRICE;
                break;

            case MOCHITO:
                totalСost += MOCHITO_PRICE;
                break;

            case SODA:
                totalСost += SODA_PRICE;
                break;

            case COCA_COLA:
                totalСost += COCA_COLA_PRICE;
                break;

            case WHISKEY:
                totalСost += WHISKEY_PRICE;
                break;

            case COGNAC:
                totalСost += COGNAC_PRICE;
                break;

            case ABSCENT:
                totalСost += ABSCENT_PRICE;
                break;

            case TEQUILA:
                totalСost += TEQUILA_PRICE;
                break;
        }

    }

    public static void displayTotal() {

        System.out.println("Всего заказано напитков: " + totalDrinks);

        System.out.println("Общая стоимость заказа: " + totalСost + " UAH");

    }

}















