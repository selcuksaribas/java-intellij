package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C03IfStatement01 {
    public static void main(String[] args) {

        //If it rains, I will cancel the picnic.
        int a = 5;
        int b = 2;

        //"if statement" is used to execute codes under some conditions.
        //If the condition is true, the code will be executed otherwise, it will not be executed.
        if(a%b==2){
            System.out.println("Activated...");
        }

        //Example 1: Type code to print "Even" for even integers and "Odd" for odd integers.
        //           Get the numbers from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check if it is even or odd...");
        int x = input.nextInt();

        //1.Way:
        if(x%2==0){
            System.out.println("Even");
        }
        if(x%2!=0){
            System.out.println("Odd");
        }

        //2.Way:
        //"else" is used for the "last option"
        if(x%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        //Example 2: Type code to check if a number is positive, negative or neutral
        System.out.println("Enter a number to check if it is positive, negative or neutral");
        double y = input.nextDouble();

        //1.Way:
        if(y>0){
            System.out.println("Positive");
        }
        if(y==0){
            System.out.println("Neutral");
        }
        if(y<0){
            System.out.println("Negative");
        }

        //2.Way:
        if(y>0){
            System.out.println("Positive");
        }else if(y==0){
            System.out.println("Neutral");
        }else{
            System.out.println("Negative");
        }
    }
}
