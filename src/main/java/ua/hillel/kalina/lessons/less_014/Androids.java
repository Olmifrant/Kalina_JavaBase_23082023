package ua.hillel.kalina.lessons.less_014;

public class Androids implements Smartphones,LinuxOS {


    @Override
    public void call() {

        System.out.println("Входящий вызов на устройстве Android ");
    }

    @Override
    public void sms() {

        System.out.println("Входящее сообщение на устройстве Android");
    }

    @Override
    public void internet() {

        System.out.println("Мобильный интернет на устройстве Android");
    }

    @Override
    public void osVersion() {

        System.out.println("Версия программного обеспечения = Android 13");

    }

    @Override
    public void modelInfo(){
        System.out.println("Модель устройства LG V60 V600EA");
    }
}


