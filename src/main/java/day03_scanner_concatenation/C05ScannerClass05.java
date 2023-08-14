package day03_scanner_concatenation;

import java.util.Scanner;

public class C05ScannerClass05 {

    public static void main(String[] args) {

        //Example 5: Type code gets mile from user then converts it to kilometers
        //           1 mile is 1.6 km

        Scanner input = new Scanner(System.in);

        System.out.println("Enter mile value to convert to kilometer");
        double mile = input.nextDouble();

        System.out.println(mile + " mile is " + mile*1.6 + "km");

    }
}