package day19exceptions;

        /*
            1)Exceptions are strict rules in Java to protect developers from critical mistakes.
              For example, you created a method uses division operation, and you are not good at math.
              You think any number can be divided by any other number, but actually it is not.
              Zero cannot be divisor in Math, when you make zero divisor, Java will give you a message explains the rule and stops the execution
         */

public class C01Exceptions {

    public static void main(String[] args) {

        System.out.println(divide(6, 2));
        System.out.println(divide(0, 5));
        System.out.println(divide(12, 0));//ArithmeticException: Java throws ArithmeticException when you got a mistake in math rules
        System.out.println("Hi!");

        System.out.println(doDivison(12, 0));

        System.out.println(getNumOfChars("Java"));
        System.out.println(getNumOfChars(""));
        System.out.println(getNumOfChars(null));//NullPointerException: Java throws NullPointerException when you use "null" value for some String methods
    }

    //1.Way: To handle Exceptions (Not recommended)
    public static int divide(int a, int b){
        if(b==0){
            return 0;
        }
        return a/b;
    }
    //2.Way: To handle Exception
    public static int doDivison(int a, int b){
        int result = 0;
        try{
            result = a/b;
            System.out.println("Hi Java!");
        }catch(ArithmeticException e){
            result = 0;
        }
        return result;
    }

        //Create a method  to get the number of characters in a String

    //1.Way:To handle Exception (Not recommended)
    public static int getNumOfChars(String s){
        if(s==null) {
            return 0;
        }
        return s.length();
    }

    //2.Way:Recommended
    public static int getNumOfCharacters(String s){

        int result = 0;

        try{
            result = s.length();
        }catch(NullPointerException e){
            result = 0;
        }

        return result;
    }

}