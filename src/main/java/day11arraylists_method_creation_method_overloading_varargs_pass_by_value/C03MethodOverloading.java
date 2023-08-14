package day11arraylists_method_creation_method_overloading_varargs_pass_by_value;

public class C03MethodOverloading {

    public static void main(String[] args) {

        add(3, 5);

        String s = "Java";
        s.substring(2);

    }

    //Create a method adds two integers
    public static int add(int a, int b){
        return a+b;
    }

    //Create a method adds three integers
    protected static int add(int a, int b, int c){
        return a+b+c;
    }

    //Create a method adds one integer and one double
    static double add(int a, double b){
        return a+b;
    }

    //Create a method adds one double and one integer
    private static double add(double a, double b){
        return a+b;
    }

    //Note 1: You can create "many methods with the same name" in a class, but method parameters must be different
    //Note 2: If you create "many methods with the same name and the different parameters" in a class, it is called "Method Overloading"
    //Note 3: You need to make the parameters different in "method overloading"
    //        To make them different you have 3 ways;
    //           i) Change the number of parameters
    //           ii) Change the data  types of the parameters
    //           iii) Change the places of the parameters, if the data types of the parameters are different
    //Note 4: You can use any access modifier in "method overloading"
    //Note 5: "static" and "non-static" methods can be overloaded. Being static or non-static does not affect "Method Overloading"
    //Note 6: "Method Names" and "Method Parameters" are essentials in Methods
    //        "Method Names" and "Method Parameters" are called "Method Signature"
    //        If you want to check two methods are same or not look at just "Method Names" and "Method Parameters"
    //        "Access Modifiers", "Return Types", "static keyword" cannot make methods different from each other.
    //Note 7: Java is an "Object-Oriented Programming Language"(OOP)
    //        OOP has 4 principals; i)Inheritance
    //                              ii)Polymorphism = Method Overloading + Method Overriding
    //                              iii)Encapsulation
    //                              iv)Abstraction
}