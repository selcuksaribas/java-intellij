package review;


import java.util.Scanner;

public class C03Dog {
    public static void main(String[] args) {

//        Ask user for a string and print a new string made of 3 copies of the last 2 letters
//        The strings length will be at least 2.
//        Sample:
//        INPUT       : Mustafa
//        OUTPUT      : fafafa
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = inp.next();

        String name1 = name.substring(name.length()-2);

        name1 = name1.repeat(3);
        System.out.println(name1);
    }
}















