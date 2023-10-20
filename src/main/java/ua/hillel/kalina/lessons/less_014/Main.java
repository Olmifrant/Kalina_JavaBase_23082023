package ua.hillel.kalina.lessons.less_014;

public class Main {

    public static void main(String[] args) {

        System.out.println();

        Androids android = new Androids();
        android.call();
        android.sms();
        android.internet();
        android.version();

        IPhones iPhone = new IPhones();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.version();
    }
}
