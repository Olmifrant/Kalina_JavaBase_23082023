package ua.hillel.kalina.lessons.less_011;

public class BurgersMain {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("В нашем меню доступно четыре вида бургеров");
        System.out.println();

        Burger burger1 = new Burger();
        Burger burger2 = new Burger(true, true, true, true);
        Burger burger3 = new Burger(true, true, true, true, true);
        Burger burger4 = new Burger(false);

        System.out.println();
        System.out.println("При выборе любого варианта зубочистка в подарок!");

//        System.out.println();
//        System.out.println(burger1);
//        System.out.println(burger2);
//        System.out.println(burger3);
//        System.out.println(burger4);

    }
}

    class Burger {

        int count = 2;
        private boolean bun;
        private boolean meat;
        private boolean cheese;
        private boolean lettuce;
        private boolean mayonnaise;

        public Burger() {

            this.bun = true;
            this.meat = true;
            this.cheese = true;
            this.lettuce = true;
            this.mayonnaise = true;

            System.out.println("1. Стандартный бургер.");
            System.out.println("Состав: булка, мясо, сыр, зелень, майонез");
            System.out.println();
        }

        public Burger(boolean bun, boolean meat, boolean cheese, boolean lettuce) {

            this.bun = bun;
            this.meat = meat;
            this.cheese = cheese;
            this.lettuce = lettuce;
            this.mayonnaise = false;

            System.out.println("2. Диетический бургер.");
            System.out.println("Состав: булка, мясо, сыр, зелень, без майонеза");
            System.out.println();
        }

        public Burger(boolean bun, boolean meat, boolean cheese, boolean lettuce, boolean mayonnaise) {


            this.count = count;
            this.bun = bun;
            this.meat = meat;
            this.cheese = cheese;
            this.lettuce = lettuce;
            this.mayonnaise = mayonnaise;

            if (count == 2) {
                System.out.println("3. Счастливый  бургер.");
                System.out.println("Состав: булка, мясо двойное, сыр, зелень, майонез");
                System.out.println();
            } else {
                System.out.println("Обязательна двойная порция мяса");
            }
        }

        public Burger(boolean bun) {

            this.bun = false;
            this.meat = false;
            this.cheese = false;
            this.lettuce = false;
            this.mayonnaise = false;

            System.out.println("4. Бургер Обещания депутата");
            System.out.println("Состав: пустота + ничто");
            System.out.println("При выборе этого варианта действует СУПЕР АКЦИЯ! Два бургера по цене трех!");

        }

    }















