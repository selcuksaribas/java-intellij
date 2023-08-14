package day03_scanner_concatenation;

public class C08IncrementDecrement08 {
    public static void main(String[] args) {
        int age = 13;
        //addition operation
        //1.way
        age = age+2;

        //2.way
        age += 2;

        //multiplication operation
        //1. way
        age = age*2;

        //2. way
        age *= 2;
        System.out.println(age);

        // Syntax used just to increase by 1
        age++;
        System.out.println(age);

        // Decrement means to decrease value of a variable
        age = age-2;
        age -= 2;
        System.out.println(age);

        // Decrement can be done by division as well
        age = age/5;
        System.out.println(age);

        age /= 13;

        //Syntax is used to just decrease by one
        age--;
        System.out.println(age);
    }
}
