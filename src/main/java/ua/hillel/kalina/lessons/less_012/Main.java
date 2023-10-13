package ua.hillel.kalina.lessons.less_012;

public class Main {

    public static void main(String[] args) {


        UserData user1 = new UserData("Бенедикт", "Камбербэтч", 19, 7, 1976,
                "+38635314585", "benya@gmail.com", 88, 120, 80, 10000);

        UserData user2 = new UserData("Мартин", "Фримен", 8, 9, 1971,
                "+380501234567", "martiarti@gmail.com", 95, 140, 110, 15000);

        UserData user3 = new UserData("Эми́лия", "Кларк", 23, 10, 1986,
                "+380667412369", "emmykl@gmail.com", 62, 110, 85, 21000);

        UserData user4 = new UserData("Шон", "Бин", 17, 4, 1959,
                "+380504567896", "shonebin@gmail.com", 85, 120, 80, 15000);

        UserData user5 = new UserData("Кри́стофер", "Ха́рингтон", 26, 12, 1986,
                "+380997949599", "kithar@gmail.com", 82, 125, 85, 18000);


        System.out.println();

        user1.printUserInfo();
        user2.printUserInfo();
        user3.printUserInfo();
        user4.printUserInfo();
        user5.printUserInfo();

        System.out.println("Клиент " + user3.getName() + " " + user3.getSurname() + " " + "изменил(а) свои данные ");
        user3.setSurname("Кларик");
        user3.setWeight(59);
        user3.setPressure1(115);
        user3.setPressure2(88);
        user3.setSteps(14000);

        System.out.println("Новые данные клиента");
        user3.printUserInfo();

        System.out.println("Клиент " + user4.getName() + " " + user4.getSurname() + " " + "изменил(а) свои данные ");
        user4.setSurname("Небин");
        user4.setWeight(95);
        user4.setPressure1(130);
        user4.setPressure2(95);
        user4.setSteps(5000);

        System.out.println("Новые данные клиента");
        user4.printUserInfo();

    }
}



