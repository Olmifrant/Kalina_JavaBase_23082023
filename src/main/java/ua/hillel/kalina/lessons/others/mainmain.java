package ua.hillel.kalina.lessons.others;

import java.util.Scanner;

public class mainmain {

    public static void main(String[] args) {

        System.out.println("Please enter the salary of employee 1 ");
        Scanner scanner1 = new Scanner(System.in);

        if (scanner1.hasNextInt()){

        } else {
            System.out.println("Incorrect value. Restart the program and try again.");
            System.exit(0);
        }
        int Sal1 = scanner1.nextInt();
        System.out.println();
        System.out.println("Salary1 = " + Sal1);
        System.out.println();


        System.out.println("Please enter the salary of employee 2 ");
        Scanner scanner2 = new Scanner(System.in);

        if (scanner2.hasNextInt()){

        } else {
            System.out.println("Incorrect value. Restart the program and try again.");
            System.exit(0);
        }
        int Sal2 = scanner2.nextInt();
        System.out.println();
        System.out.println("Salary2 = " + Sal2);
        System.out.println();

        System.out.println("Please enter the salary of employee 2 ");
        Scanner scanner3 = new Scanner(System.in);

        if (scanner3.hasNextInt()){

        } else {
            System.out.println("Incorrect value. Restart the program and try again.");
            System.exit(0);
        }
        int Sal3 = scanner3.nextInt();
        System.out.println();
        System.out.println("Salary3 = " + Sal3);
        System.out.println();



        System.out.println("Please enter the number of months for the billing period");
        Scanner scanner4 = new Scanner(System.in);
        String period  = scanner4.nextLine();
        System.out.println("period = " + period);
        System.out.println();

        System.out.println("Please enter the tax rate");
        Scanner scanner5 = new Scanner(System.in);
        String taxRAte = scanner5.nextLine();
        System.out.println("tax value = " + taxRAte);
        System.out.println();

        System.out.println();
        System.out.println("Execute");
        System.out.println();



        double a = Sal1;
        double b = Sal2;
        double c = Sal3;

        int countMountYears = Integer.parseInt(period);

        double salary1 = a * countMountYears;
        double salary2 = b * countMountYears;
        double salary3 = c * countMountYears;

        System.out.println("The salary of employee 1 for the pay period is =" + salary1);
        System.out.println("The salary of employee 2 for the pay period is =" + salary2);
        System.out.println("The salary of employee 3 for the pay period is =" + salary3);

        double tax = Double.parseDouble(taxRAte);

        double salary1WithoutTax =  (salary1 * tax);
        double salary2WithoutTax =  (salary2 * tax);
        double salary3WithoutTax =  (salary3 * tax);

        System.out.println("The net salary of employee 1 for the pay period without taxes is = " + salary1WithoutTax);
        System.out.println("The net salary of employee 2 for the pay period without taxes is = " + salary2WithoutTax);
        System.out.println("The net salary of employee 3 for the pay period without taxes is = " + salary3WithoutTax);

        double sumSalary = salary1WithoutTax + salary2WithoutTax + salary3WithoutTax;
        double avgSalary = sumSalary / 3 ;

        System.out.println("Total employee salary = " + sumSalary);
        System.out.println("Average salary of employees = " + avgSalary);



    }
}
