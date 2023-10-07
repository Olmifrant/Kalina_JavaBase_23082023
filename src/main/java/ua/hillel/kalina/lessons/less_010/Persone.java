package ua.hillel.kalina.lessons.less_010;

public class Persone {

    public static void main(String[] args) {


        System.out.println();
        System.out.println(personeInfo("Dean   ", "Winchester ", "Lawrence ", "1-866-907-3235"));
        System.out.println(personeInfo("Samuel ", "Winchester ", "Lawrence ", "1-806-307-0741"));
        System.out.println(personeInfo("John   ", "Winchester ", "Lawrence ", "1-855-723-6997"));
        System.out.println(personeInfo("Cas    ", "Castiel    ", "Heaven   ", "Angel Radio"));
        System.out.println(personeInfo("Fergus ", "MacLeod    ", "Hell     ", "Rite at the crossroads"));
    }

    static String personeInfo(String name, String surname, String sity, String number){
        return "Позвонить персонажу " + name + " " + surname + "из города " + sity + "можно по номеру " + number;
    }

}