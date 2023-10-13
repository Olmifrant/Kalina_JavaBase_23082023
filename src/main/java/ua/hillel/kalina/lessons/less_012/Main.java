package ua.hillel.kalina.lessons.less_012;

public class Main {

    public static void main(String[] args) {


        UserData userData1 = new UserData("Бенедикт", "Камбербэтч", 19, 7, 1976,
                "+38635314585", "benya@gmail.com", 88, 120, 80, 10000);

        UserData userData2 = new UserData("Мартин", "Фримен", 8, 9, 1971,
                "+380501234567", "martiarti@gmail.com", 95, 140, 110, 15000);

        UserData userData3 = new UserData("Эми́лия", "Кларк", 23, 10, 1986,
                "+380667412369", "emmykl@gmail.com", 62, 110, 85, 21000);

        UserData userData4 = new UserData("Шон", "Бин", 17, 4, 1959,
                "+380504567896", "shonebin@gmail.com", 85, 120, 80, 15000);

        UserData userData5 = new UserData("Кри́стофер", "Ха́рингтон", 26, 12, 1986,
                "+380997949599", "kithar@gmail.com", 82, 125, 85, 18000);


        System.out.println();

        userData1.printUserInfo();
        userData2.printUserInfo();
        userData3.printUserInfo();
        userData4.printUserInfo();
        userData5.printUserInfo();

        System.out.println("Клиент " + userData3.getName() + " " + userData3.getSurname() + " " + "изменил(а) свои данные ");
        userData3.setSurname("Кларик");
        userData3.setWeight(59);
        userData3.setPressure1(115);
        userData3.setPressure2(88);
        userData3.setSteps(14000);

        System.out.println("Новые данные клиента");
        userData3.printUserInfo();

        System.out.println("Клиент " + userData4.getName() + " " + userData4.getSurname() + " " + "изменил(а) свои данные ");
        userData4.setSurname("Небин");
        userData4.setWeight(95);
        userData4.setPressure1(130);
        userData4.setPressure2(95);
        userData4.setSteps(5000);

        System.out.println("Новые данные клиента");
        userData4.printUserInfo();

    }
}



