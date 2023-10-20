package ua.hillel.kalina.lessons.less_014;

public class IPhones implements Smartphones,IOS {


    public void call() {

        System.out.println("Звонок на Iphone");

    }

    public void sms() {

        System.out.println("Сообщение на Iphone");

    }

    public void internet() {

        System.out.println("Интернет на Iphone");

    }

    public void version() {

        System.out.println("Версия IOS = 17");

    }
}
