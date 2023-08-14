package day06string_manipulations_loops;

public class C07ForLoops {
    public static void main(String[] args) {

        //Example 1: Type "Hi" 5 times on the console...

        //1.Way: Not Recommended because difficult to type, update, fix errors and there is repetition
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2.Way: Java created "Loops" to make "repeated actions" easy
        //       There are 4 Loops in Java: i)for-loop  ii)while-loop  iii)do-while-loop  iv)for-each-loop

        //i)for-loop
        //Starting Value  Ending Value Increment/Decrement
        for( int i = 1    ;  i<6        ;    i++            ){
            System.out.println("Hi");
        }

        //Example 2: Type code to print integers from 10 to 3 in a same line and a space between them
        //           10 9 8 7 6 5 4 3
        for(int i = 10; i > 2; i--){
            System.out.print(i + " ");
        }
    }
}
