package ua.hillel.kalina.lessons.less_005;

import java.util.Scanner;

public class dz006 {
    public static void main(String[] args) {

        // Counter Strike

        System.out.println();
        System.out.println("Welcome to game");
        System.out.println();

//        name 1 time

        System.out.println("Please input team name 1");
        Scanner scanner1 = new Scanner(System.in);
        String teamName1 = scanner1.nextLine();
        System.out.println("Team name 1 is " + teamName1);
        System.out.println();

//        name 2 time

        System.out.println("Please input team name 2");
        Scanner scanner2 = new Scanner(System.in);
        String teamName2 = scanner2.nextLine();
        System.out.println("Team name 2 is " + teamName2);
        System.out.println();

//        player 1 team 1

        System.out.println("View the frag indicator for player 1 team " + teamName1);
        Scanner scanner3 = new Scanner(System.in);

        if (scanner3.hasNextInt()){
            int number = 0;
            int t1p1 = scanner3.nextInt();
            System.out.println("Thank you entered the value = " + t1p1);
        } else {
            System.out.println("Incorrect value. Restart the program and try again.");
            System.exit(0);
        }
        System.out.println();

        //       player 2 team 1

        System.out.println("View the frag indicator for player 2 team " + teamName1);
        Scanner scanner4 = new Scanner(System.in);

        if (scanner4.hasNextInt()) {
            int number = 0;
            int t1p2 = scanner4.nextInt();
            System.out.println("Thank you entered the value = " + t1p2);
        } else {
            System.out.println("Incorrect value. Restart the program and try again.");
            System.exit(0);
        }
        System.out.println();

//        player 3 team 1

        System.out.println("View the frag indicator for player 3 team " + teamName1);
        Scanner scanner5 = new Scanner(System.in);

        if (scanner5.hasNextInt()) {
            int number = 0;
            int t1p3 = scanner5.nextInt();
            System.out.println("Thank you entered the value = " + t1p3);
        } else {
            System.out.println("Incorrect value. Restart the program and try again.");
            System.exit(0);
        }
        System.out.println();

//        player 4 team 1

        System.out.println("View the frag indicator for player 4 team " + teamName1);
        Scanner scanner6 = new Scanner(System.in);

        if (scanner6.hasNextInt()) {
            int number = 0;
            int t1p4 = scanner6.nextInt();
            System.out.println("Thank you entered the value = " + t1p4);
        } else {
            System.out.println("Incorrect value. Restart the program and try again.");
            System.exit(0);
        }
        System.out.println();

        //       player 5 team 1

        System.out.println("View the frag indicator for player 5 team " + teamName1);
        Scanner scanner7 = new Scanner(System.in);

        if (scanner7.hasNextInt()) {
            int number = 0;
            int t1p5 = scanner7.nextInt();
            System.out.println("Thank you entered the value = " + t1p5);
        } else {
            System.out.println("Incorrect value. Restart the program and try again.");
            System.exit(0);
        }
        System.out.println();


//        player 1 team 2

        System.out.println("View the frag indicator for player 1 team " + teamName2);
        Scanner scanner8 = new Scanner(System.in);

        if (scanner8.hasNextInt()) {
            int number = 0;
            int t2p1 = scanner8.nextInt();
            System.out.println("Thank you entered the value = " + t2p1);
        } else {
            System.out.println("Incorrect value. Restart the program and try again.");
            System.exit(0);
        }
        System.out.println();

        //       player 2 team 2

        System.out.println("View the frag indicator for player 2 team " + teamName2);
        Scanner scanner9 = new Scanner(System.in);

        if (scanner9.hasNextInt()) {
            int number = 0;
            int t2p2 = scanner9.nextInt();
            System.out.println("Thank you entered the value = " + t2p2);
        } else {
            System.out.println("Incorrect value. Restart the program and try again.");
            System.exit(0);
        }
        System.out.println();

//        player 3 team 2

        System.out.println("View the frag indicator for player 3 team " + teamName2);
        Scanner scanner10 = new Scanner(System.in);

        if (scanner10.hasNextInt()) {
            int number = 0;
            int t2p3 = scanner10.nextInt();
            System.out.println("Thank you entered the value = " + t2p3);
        } else {
            System.out.println("Incorrect value. Restart the program and try again.");
            System.exit(0);
        }
        System.out.println();

//        player 4 team 2

        System.out.println("View the frag indicator for player 4 team " + teamName2);
        Scanner scanner11 = new Scanner(System.in);

        if (scanner11.hasNextInt()) {
            int number = 0;
            int t2p4 = scanner11.nextInt();
            System.out.println("Thank you entered the value = " + t2p4);
        } else {
            System.out.println("Incorrect value. Restart the program and try again.");
            System.exit(0);
        }
        System.out.println();

        //         player 5 team 2

        System.out.println("View the frag indicator for player 5 team " + teamName2);
        Scanner scanner12 = new Scanner(System.in);

        if (scanner12.hasNextInt()) {
            int number = 0;
            int t2p5 = scanner12.nextInt();
            System.out.println("Thank you entered the value = " + t2p5);
        } else {
            System.out.println("Incorrect value. Restart the program and try again.");
            System.exit(0);
        }
        System.out.println();



        int a1 =
        int a2 = t1p2;


        double totolTeamPoints = a1 + a2 + a3 + a4 + a5;

        System.out.println(totolTeamPoints);









    }
}


