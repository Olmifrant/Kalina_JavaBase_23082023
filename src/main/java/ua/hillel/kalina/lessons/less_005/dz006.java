package ua.hillel.kalina.lessons.less_005;

import javax.swing.table.AbstractTableModel;
import java.util.Scanner;

public class dz006 {
    public static void main(String[] args) {

        // Counter Strike

        System.out.println();
        System.out.println("Welcome to game");
        System.out.println();

//        name 1 team

        System.out.println("Please input team name 1");
        Scanner scanner1 = new Scanner(System.in);
        String teamName1 = scanner1.nextLine();
        System.out.println("Team name 1 is " + teamName1);
        System.out.println();

//        name 2 team

        System.out.println("Please input team name 2");
        Scanner scanner2 = new Scanner(System.in);
        String teamName2 = scanner2.nextLine();
        System.out.println("Team name 2 is " + teamName2);
        System.out.println();

//        player 1 team 1

        System.out.println("Enter the frag value for player 1 team " + teamName1);
        Scanner scanner3 = new Scanner(System.in);

        if (scanner3.hasNextInt()){

        } else {
            System.out.println("Incorrect value. Restart the program and try again.");
            System.exit(0);
        }
        int str1 = scanner3.nextInt();
        System.out.println();

 //       player 2 team 1

        System.out.println("Enter the frag value for player 2 team " + teamName1);
        Scanner scanner4 = new Scanner(System.in);

        if (scanner4.hasNextInt()) {

        } else {
            System.out.println("Incorrect value. Restart the program and try again.");
            System.exit(0);
        }
        int str2 = scanner4.nextInt();
        System.out.println();

//        player 3 team 1

        System.out.println("Enter the frag value for player 3 team " + teamName1);
        Scanner scanner5 = new Scanner(System.in);

        if (scanner5.hasNextInt()) {

        } else {
            System.out.println("Incorrect value. Restart the program and try again.");
            System.exit(0);
        }
        int str3 = scanner5.nextInt();
        System.out.println();

//        player 4 team 1

        System.out.println("Enter the frag value for player 4 team " + teamName1);
        Scanner scanner6 = new Scanner(System.in);

        if (scanner6.hasNextInt()) {

        } else {
            System.out.println("Incorrect value. Restart the program and try again.");
            System.exit(0);
        }
        int str4 = scanner6.nextInt();
        System.out.println();

 //       player 5 team 1

        System.out.println("Enter the frag value for player 5 team " + teamName1);
        Scanner scanner7 = new Scanner(System.in);

        if (scanner7.hasNextInt()) {

        } else {
            System.out.println("Incorrect value. Restart the program and try again.");
            System.exit(0);
        }
        int str5 = scanner7.nextInt();
        System.out.println();

//        player 1 team 2

        System.out.println("Enter the frag value for player 1 team " + teamName2);
        Scanner scanner8 = new Scanner(System.in);

        if (scanner8.hasNextInt()) {

        } else {
            System.out.println("Incorrect value. Restart the program and try again.");
            System.exit(0);
        }
        int str6 = scanner8.nextInt();
        System.out.println();

//        player 2 team 2

        System.out.println("Enter the frag value for player 2 team " + teamName2);
        Scanner scanner9 = new Scanner(System.in);

        if (scanner9.hasNextInt()) {

        } else {
            System.out.println("Incorrect value. Restart the program and try again.");
            System.exit(0);
        }
        int str7 = scanner9.nextInt();
        System.out.println();

//        player 3 team 2

        System.out.println("Enter the frag value for player 3 team " + teamName2);
        Scanner scanner10 = new Scanner(System.in);

        if (scanner10.hasNextInt()) {

        } else {
            System.out.println("Incorrect value. Restart the program and try again.");
            System.exit(0);
        }
        int str8 = scanner10.nextInt();
        System.out.println();

//        player 4 team 2

        System.out.println("Enter the frag value for player 4 team " + teamName2);
        Scanner scanner11 = new Scanner(System.in);

        if (scanner11.hasNextInt()) {

        } else {
            System.out.println("Incorrect value. Restart the program and try again.");
            System.exit(0);
        }
        int str9 = scanner11.nextInt();
        System.out.println();

 //       player 5 team 2

        System.out.println("Enter the frag value for player 5 team " + teamName2);
        Scanner scanner12 = new Scanner(System.in);

        if (scanner12.hasNextInt()) {

        } else {
            System.out.println("Incorrect value. Restart the program and try again.");
            System.exit(0);
        }
        int str10 = scanner12.nextInt();

        System.out.println();



        int totalPointsTeam1 = str1 + str2 + str3 + str4 + str5;
        int totalPointsTeam2 = str6 + str7 + str8 + str9 + str10;

        System.out.println("The overall value of team frags " + "teamName1 " +  totalPointsTeam1);
        System.out.println("The overall value of team frags " + "teamName2 " +  totalPointsTeam2);

        System.out.println();

        double avTeamResult = (totalPointsTeam1 + totalPointsTeam2) * 0.5 ;
        System.out.println("Average team result " + avTeamResult);

        if (totalPointsTeam1 > totalPointsTeam2){
            System.out.println("Team victory " + teamName1);
        }
        if (totalPointsTeam1 < totalPointsTeam2){
            System.out.println("Team victory " + teamName2);
        }
        if (totalPointsTeam1==totalPointsTeam2){
            System.out.println("The battle ended in a draw");
        }



    }
}


