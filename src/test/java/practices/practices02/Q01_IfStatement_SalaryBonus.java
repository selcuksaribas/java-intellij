package practices.practices02;

import java.util.Scanner;

public class Q01_IfStatement_SalaryBonus {
    public static void main(String[] args) {

//        Scanner inp = new Scanner(System.in);
//        System.out.println("Enter year of service");
//        int year = inp.nextInt();
//
//        if (year<0 || year>60){
//            System.out.println("Invalid values");
//
//        } else if (year<5) {
//
//            System.out.println("You need to work " + (5-year) + " more years");
//        } else{
//            System.out.println("Enter your salary");
//            int salary = inp.nextInt();
//            System.out.println("Your bonus is : " + salary*0.05);
//        }
//
          /*
    A company decided to give bonus of 5% of salary to the employee if his/her year of
    service is 5 and more than 5 years.
    Ask user for their salary and year of service and print the net bonus amount.
    If employee can not get bonus, print how many years he/she should work more.
    EXAMPLE:
    INPUT  :   Year     => 4 years service
               Salary   => 4000
    OUTPUT:   You need to work 1 more year(s) to get bonus
     */

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number of your service year");
            int year = Math.abs(scan.nextInt());
            System.out.println("Enter your salary");
            double salary = Math.abs(scan.nextDouble());
            if (year>=5){
                // calculate the bonus
                double bonus = salary*5/100;
                System.out.println("Your bonus = " + bonus);
            }else {
                System.out.println("You need to work "+(5-year) +" year(s) more to get the bonus!");
            }
        }
    }


