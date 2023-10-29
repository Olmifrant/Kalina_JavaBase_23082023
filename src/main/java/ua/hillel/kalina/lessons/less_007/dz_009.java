package ua.hillel.kalina.lessons.less_007;

import java.util.Arrays;

public class dz_009 {

    public static void main(String[] args) {

        System.out.println("Регби");
        System.out.println();

        int[] team1 = new int[25];
        for (int i = 0; i < team1.length; i++) {
            int rand1 = (int) ((Math.random() * 23) + 18);
            team1[i] = rand1;
        }
        System.out.print("Возраст игроков первой команды ");
        for (int i = 0; i < team1.length; i++) {
            if (i == team1.length - 1) {
                System.out.print(team1[i]);
            } else {
                System.out.print(team1[i] + ", ");
            }
        }

        System.out.println();

        int[] team2 = new int[25];
        for (int i = 0; i < team2.length; i++) {
            int rand2 = (int) ((Math.random() * 23) + 18);
            team2[i] = rand2;
        }
        System.out.print("Возраст игроков второй команды ");
        for (int i = 0; i < team2.length; i++) {
            if (i == team2.length - 1) {
                System.out.print(team2[i]);
            } else {
                System.out.print(team2[i] + ", ");
            }
        }

        System.out.println();
        System.out.println();

        double sumAgeTeam1 =0;
        for (double i = 0; i < team1.length; i++) {
            sumAgeTeam1 = Arrays.stream(team1).sum();
        }
        double avAgeTeam1 = (sumAgeTeam1 / team1.length);
        System.out.println("Средний возраст первой команды " + avAgeTeam1);


        double sumAgeTeam2 =0;
        for (double i = 0; i < team2.length; i++) {
            sumAgeTeam2 = Arrays.stream(team2).sum();
        }
        double avAgeTeam2 = (sumAgeTeam2 / team2.length);
        System.out.println("Средний возраст второй команды " + avAgeTeam2);


    }
}
