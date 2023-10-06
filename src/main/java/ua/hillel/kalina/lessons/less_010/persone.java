package ua.hillel.kalina.lessons.less_010;

public class persone {

    public static void main(String[] args) {

    personeInfo("Alex","kalina","Zapor","380638084228");
    personeInfo("Alex","kalina","Zapor","380638084228");
    personeInfo("Alex","kalina","Zapor","380638084228");
    personeInfo("Alex","kalina","Zapor","380638084228");

    }

    static void personeInfo(String firstName,String lastName,String sity,String number) {
        System.out.print("Позвонить персонажу " + " " + firstName + " ");
        System.out.println(lastName + " " + "живет в городе " + sity + " " + "можно по номеру " + number);

    }

}
