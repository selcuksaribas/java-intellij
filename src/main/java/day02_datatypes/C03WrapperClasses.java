package day02_datatypes;

public class C03WrapperClasses {

    public static void main(String[] args) {

        //Wrapper Classes: Java created a new data structure by adding some useful methods to primitive data types.
        //                 This new data structure is called "Wrapper Class"

        //Java created "Wrapper Class" for every primitive data type.

        /*
            Primitive      Wrapper Class
              byte    ===>    Byte
              short   ===>    Short
              int     ===>    Integer
              long    ===>    Long
              float   ===>    Float
              double  ===>    Double
              boolean ===>    Boolean
              char    ===>    Character
         */

        //Following one is wrapper class it has many useful methods
        Integer age = 35;

        //Following one is primitive it does not have any method
        int weight = 25;

        //If you use wrapper class name, you will be able to use more methods
        System.out.println(Integer.MIN_VALUE);// -2147483648
        System.out.println(Integer.MAX_VALUE);// 2147483647

        //Find the min and max value of short data type.
        System.out.println(Short.MIN_VALUE);// -32768
        System.out.println(Short.MAX_VALUE);// 32767

        //How to convert "primitive" to "wrapper" ==>  Autoboxing
        char ch = '?';
        Character chWrapper = ch;// Autoboxing

        //How to convert "wrapper" to "primitive" ==> Unboxing
        Boolean b1 = true;
        boolean b2 = b1;// Unboxing

    }
}