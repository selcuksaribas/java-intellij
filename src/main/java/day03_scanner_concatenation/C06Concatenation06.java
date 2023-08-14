package day03_scanner_concatenation;

public class C06Concatenation06 {

        //Concatenation is an operation to join Strings with Strings or to join String with other data types
        //Symbol of concatenation is "+"

    public static void main(String[] args) {

        System.out.println("Tom" + "Hanks");// TomHanks
        System.out.println("Tom " + "Hanks");// Tom Hanks
        System.out.println("Tom" + " Hanks");// Tom Hanks
        System.out.println("Tom" + " " + "Hanks");// Tom Hanks

        //Tom32 Because first come String for this doesn't take + as addition, take it as concatenation
        System.out.println("Tom" + 3 + 2); //Tom32
        System.out.println("Tom" + (3 + 2)); //Tom5

        //Multiplication is done before addition that is why th result is Tom6
        System.out.println("Tom" + 3*2);// Tom6

        System.out.println(3 + 2 + "Tom");

        System.out.println(3*2 + 4 + "Tom" + 5 + 6);
    }
}