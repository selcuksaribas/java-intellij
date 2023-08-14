package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C04IfStatement02 {
    public static void main(String[] args) {

        //Example 3: Ask user to enter initial of the day names, then print all possible day names on the console.
        //           S ==> Sunday, Saturday     T ==> Tuesday, Thursday
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial of the day name...");
        char dayNameInitial = input.next().charAt(0);//To get char from user use input.next().charAt(0);

        if(dayNameInitial=='S' || dayNameInitial=='s'){
            System.out.println("Sunday, Saturday");
        }else if(dayNameInitial=='T' || dayNameInitial=='t'){
            System.out.println("Tuesday, Thursday");
        }else if(dayNameInitial=='M' || dayNameInitial=='m'){
            System.out.println("Monday");
        }else if(dayNameInitial=='W' || dayNameInitial=='w'){
            System.out.println("Wednesday");
        }else if(dayNameInitial=='F' || dayNameInitial=='f'){
            System.out.println("Friday");
        }else{
            System.out.println("Invalid day name initial");
        }
    }
}
