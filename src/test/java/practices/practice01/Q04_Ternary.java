package practices.practice01;

import java.util.Scanner;

public class Q04_Ternary {
    public static void main(String[] args) {
        /*
                Ask user to enter a character and check if it is a letter.
                If it is not a letter print "Not Letter" on console.
                If it is letter check if it is lowercase or uppercase letter.
                If it is lowercase print "Lowercase Letter", if it is uppercase letter print "Uppercase Letter" on console.
                */

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char c = inp.next().charAt(0);

        String s = (c>='a' && c<='z') || (c>='A' && c<='Z') ? ((c>='a' && c<='z') ? "Lowercase letter" : "Uppercase letter") : "Not letter";
        System.out.println(s);

    }
}
