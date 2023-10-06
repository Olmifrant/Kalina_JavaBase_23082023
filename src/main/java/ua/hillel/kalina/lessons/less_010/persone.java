package ua.hillel.kalina.lessons.less_010;

public class persone {

    public static void main(String[] args) {

        personeInfo("Dean", "Winchester", "Lawrence", " 1-866-907-3235");
        personeInfo("Samuel", "Winchester", "Lawrence", "1-806-307-0741");
        personeInfo("John", "Winchester", "Lawrence", "1-855-723-6997");
        personeInfo("Castiel", "(Cas)", "Heaven", "Angel Radio");
        personeInfo("Fergus", "MacLeod", "Hell", "Rite at the crossroads");

    }

    static void personeInfo(String firstName, String lastName, String sity, String number) {
        System.out.print("Позвонить персонажу " + " " + firstName + " ");
        System.out.println(lastName + " " + "живет в городе " + sity + " " + "можно по номеру " + number);

    }
}
