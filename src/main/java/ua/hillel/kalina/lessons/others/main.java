package ua.hillel.kalina.lessons.others;

public class main {

    public static void main(String[] args) {

     //   int a = 5;

     //   int b = 2;

     //   int result= --b + a++ + ++a;

     //   System.out.println("result = " + result );
      //  System.out.println("value a = " + a );
      //  System.out.println("value b = " + b );


        int a = 700;
        int b = 2000;
        int c = 3500;

        int countMountYears = 10 * 12;

        int salary1 = a * countMountYears;
        int salary2 = b * countMountYears;
        int salary3 = c * countMountYears;

        System.out.println(salary1);
        System.out.println(salary2);
        System.out.println(salary3);

        double tax = 0.95;

        int salary1WithoutTax = (int) (salary1 * tax);
        int salary2WithoutTax = (int) (salary2 * tax);
        int salary3WithoutTax = (int) (salary3 * tax);

        System.out.println(salary1WithoutTax);
        System.out.println(salary2WithoutTax);
        System.out.println(salary3WithoutTax);

        double sumSalary = salary1WithoutTax + salary2WithoutTax + salary3WithoutTax;
        double avgSalary = sumSalary / 3 ;

        System.out.println("sumSalary = " + sumSalary);
        System.out.println("avgSalary = " + avgSalary);







    }


}
