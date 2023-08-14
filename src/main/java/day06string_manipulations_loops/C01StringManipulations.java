package day06string_manipulations_loops;

public class C01StringManipulations {
    public static void main(String[] args) {
        //Example 1: Make the all digits except last 4 digits of a credit card invisible by using '*'
        //           1234 1234 1234 1234 ==> **** **** **** 1234

        String ccNum = "1234 1234 1234 1234";

        String first = ccNum.substring(0, 15).replaceAll("[0-9]", "*");
        System.out.println(first);

        String last = ccNum.substring(15);
        System.out.println(last);

        String result1 = first + last;
        System.out.println(result1);// **** **** **** 1234

        String result2 = first.concat(last);
        System.out.println(result2);// **** **** **** 1234

        //Example 2: Count the number of characters different from space were used in a String
        //          "Tom Hanks was born in 1975."

        String sentence = "Tom Hanks was born in 1975.";

        int numOfCharDiffFromSpace = sentence.replace(" ", "").length();
        System.out.println(numOfCharDiffFromSpace);//22

        /*
            1)concat() method is for joining two Strings like "+" sign

            2)replace(char, char) or replace(String, String): It is used to replace single character or multiple characters
              note: If you need to use Regular Expressions use replaceAll() otherwise use replace()
        */
    }
}
