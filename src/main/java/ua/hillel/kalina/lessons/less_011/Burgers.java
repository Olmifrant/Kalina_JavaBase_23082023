package ua.hillel.kalina.lessons.less_011;

public class Burgers {

    public static void main(String[] args) {


        System.out.println("Меню" + "\t");
        System.out.println("В нашем меню доступно четыре вида бургеров");
        System.out.println();


        burger burger1 = new burger();
        burger burger2 = new burger(true, true, true, true);
        burger burger3 = new burger(true, true, true, true, true);
 //       burger burger4 = new burger();

        System.out.println();
        System.out.println(burger1);
        System.out.println(burger2);
        System.out.println(burger3);

    }
}

    class burger {

        private boolean bun;

        private boolean meat;

        private boolean cheese;

        private boolean lettuce;

        private boolean mayonnaise;

        public burger() {

            this.bun = true;
            this.meat = true;
            this.cheese = true;
            this.lettuce = true;
            this.mayonnaise = true;

            System.out.println("Стандартный бургер. Состав: булка, мясо, сыр, зелень, майонез");


        }

        public burger(boolean bun, boolean meat, boolean cheese, boolean lettuce) {

            this.bun = bun;
            this.meat = meat;
            this.cheese = cheese;
            this.lettuce = lettuce;
            this.mayonnaise = false;

            System.out.println("Диетический бургер. Состав: булка, мясо, сыр, зелень, без майонеза");

        }

        public burger(boolean bun, boolean meat, boolean cheese, boolean lettuce, boolean mayonnaise) {

            this.bun = bun;
            this.meat = meat;
            this.cheese = cheese;
            this.lettuce = lettuce;
            this.mayonnaise = mayonnaise;

            System.out.println("Счастливый бургер.  Состав: булка, мясо двойное, сыр, зелень, майонез");


        }



    }


















//        System.out.println("Стандартный бургер. Состав: булка, мясо, сыр, зелень, майонез");





//    public burger(boolean bun, boolean meat, boolean cheese, boolean lettuce) {
//
//        this.bun = bun;
//        this.meat = meat;
//        this.cheese = cheese;
//        this.lettuce = lettuce;
//        this.mayonnaise = false;
//        System.out.println("Диетический бургер. Состав: булка, мясо, сыр, зелень, без майонеза");
//
//    }
//
//    public burger(boolean bun, boolean meat, boolean cheese, boolean lettuce, boolean mayonnaise) {
//
//        this.bun = bun;
//        this.meat = meat;
//        this.cheese = cheese;
//        this.lettuce = lettuce;
//        this.mayonnaise = mayonnaise;
//        System.out.println("Двойной бургер. Состав: булка, двойная порция мяса, сыр, зелень, майонез");
//    }


