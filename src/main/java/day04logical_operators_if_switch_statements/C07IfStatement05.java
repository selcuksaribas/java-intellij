package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C07IfStatement05 {
    public static void main(String[] args) {
        // Nested if statement
        //Example 6: If a number is even then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
//"Perfect even number" otherwise, the output will be "Good even number."
//If the number is odd then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
//"Perfect odd number" otherwise, the output will be "Good odd number."
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = inp.nextInt();

        if (num%2==0){
            if (num%3==0){
                System.out.println("Perfect even number");
            }else{
                System.out.println("Good even number");
            }
        }else{
            if (num%3==0){
                System.out.println("Perfect odd number");
            }else{
                System.out.println("Good odd number");
            }
        }
    }
}
