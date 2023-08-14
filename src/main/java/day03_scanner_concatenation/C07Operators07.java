package day03_scanner_concatenation;

public class C07Operators07 {

    public static void main(String[] args) {

        // "=" ==> Assignment Operator ==> Takes the value from the right then puts it into the container on the left

        // "==" ==> Equality Operator ==> Checks if the value on the left is the same with the value on the right
        //          2+3==5 ==> true    2+4==3 ==> false so "==" in Java returns "boolean"
        //          'A'==65 ==> true If you use char with any mathematical operation Java uses the ASCII value of the char
        System.out.println('A'==65);
        System.out.println('A' + 'a');//162 ==> Because, I used char with addition operation so Java used the ASCII value of the char
        //Example: Find ASCII value of "!" by typing code
        System.out.println('!'*1);//33
        System.out.println('!'+0);//33

        //"!" ==> Not Operator ==> !true=false  !false=true  !!true=true

        //"!=" ==> Not Equals Operator
        //         2+3!=7 ==> true  3+4!=7 ==> false

        // "<", ">", "<=", ">=" return boolean

        /*
            "==" with Strings
            Every String has two main things i)Value ii)Address

            "==" checks both i)Value and ii)Address, if both are same it returns true
            But as a developer, we do not need to check address that is why when we compare two Strings we do not use "=="

            equals() checks just the i)Value, if the values are same it returns true.
            To compare Strings we use equals() method
        */
        String s1 = "Tom";
        String s2 = "Hanks";
        String s3 = "Tom";
        String s4 = new String("Tom");

        System.out.println(s1==s2);//false
        System.out.println(s1==s3);// true
        System.out.println(s1==s4);// false

        System.out.println(s1.equals(s4));// true
    }
}