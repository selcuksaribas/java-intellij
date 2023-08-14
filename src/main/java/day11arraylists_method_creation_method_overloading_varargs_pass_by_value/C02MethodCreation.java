package day11arraylists_method_creation_method_overloading_varargs_pass_by_value;

public class C02MethodCreation {

    public static void main(String[] args) {
        //Method Call: Using a method in "main" method is called "Method Call"
        int r1 = add(3, 5);// Non-static method 'add(int, int)' cannot be referenced from a static context
        System.out.println(r1);// 8

        //Method Call
        double r2 = multiplyThreeNumbers(1.2, 4, 5.31);
        System.out.println(r2);// 25.487999999999996

        //Method Call
        String r3 = joinTwoStrings("Ja", "va");
        System.out.println(r3);// Java
    }

    //Create a method to add 2 numbers
    public static int add(int a, int b){
        return a+b;
    }
    //Create a method to multiply 3 numbers
    public static double multiplyThreeNumbers(double a, double b, double c){
        return a*b*c;
    }
    //Create a method joins two Strings
    public static String joinTwoStrings(String s, String t){
        return s.concat(t);
    }
    //Note: Variables used in "method creation" are called "Parameters"
    //      Actual values used in method call are called "Arguments"
}