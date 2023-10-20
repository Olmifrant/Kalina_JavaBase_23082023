package ua.hillel.kalina.lessons.less_014;

public class IPhones implements Smartphones,IOS {


    @Override
    public void call() {

        System.out.println("Входящий   вызов   на устройстве Iphone");
    }

    @Override
    public void sms() {

        System.out.println("Входящее сообщение на устройстве Iphone");
    }

    @Override
    public void internet() {

        System.out.println("Мобильный интернет на устройстве Iphone");
    }

    @Override
    public void osVersion() {

        System.out.println("Версия программного обеспечения = IOS 17");
    }

    @Override
    public  void modelInfo() {
        System.out.println("Модель устройства Iphone 15 pro max ");
    }
}
