package day06string_manipulations_loops;

public class C04StringManipulations {
    public static void main(String[] args) {
        //Example 5:  String shirtPrice = "$12.99";
        //            String bookPrice = "$35.99";
        //            Type code to find the sum of the shirt and book prices.

        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

        //1.Step: Remove currency symbols or characters different from "digits" and "."
        String newShirtPrice = shirtPrice.replaceAll("[^0-9.]", "");
        System.out.println(newShirtPrice);

        String newBookPrice = bookPrice.replaceAll("[^0-9.]", "");
        System.out.println(newBookPrice);

        //2.Step: Change String data type to a numeric data type
        double doubleShirtPrice = Double.valueOf(newShirtPrice);
        System.out.println(doubleShirtPrice);

        double doubleBookPrice = Double.valueOf(newBookPrice);
        System.out.println(doubleBookPrice);

        System.out.println("Total Price: " + (doubleShirtPrice + doubleBookPrice));// 48.98
    }
}
