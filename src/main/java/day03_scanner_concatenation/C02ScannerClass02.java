package day03_scanner_concatenation;

import java.util.Scanner;

public class C02ScannerClass02 {

    public static void main(String[] args) {

        //Example 2: Ask user to enter the width and the length of a rectangle, then print the area and perimeter on the console
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the width and the length of a rectangle to calculate the perimeter and the area...");
        double width = input.nextDouble();
        double length = input.nextDouble();

        System.out.println("Area is " + width*length);
        System.out.println("Perimeter is " + 2*(width+length));
    }

}