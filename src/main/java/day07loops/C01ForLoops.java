package day07loops;

public class C01ForLoops {
    public static void main(String[] args) {

        //Example 1:Type code to print even integers from 5 to 16 on the console
        for(int i=5; i<17; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        //Homework: Type code to print odd integers from 15 to 6 on the console

        System.out.println();

        //Example 2: Type code to print integers from 5 to 16 except 7 on the console
        //1.Way:
        for(int i=5; i<17;i++){
            if(i!=7){
                System.out.print(i + " ");
            }
        }

        //2.Way:
        for(int i=5; i<17; i++){
            if(i==7){
                continue;//"continue" keyword is used to skip some values in a loop.
                //"continue" keyword takes you to "increment/decrement" part in the loop directly
            }
            System.out.print(i + " ");
        }

        System.out.println();

        //Example 3: Print String characters one by one on the console. If you see "x" stop printing
        //           "I like extra effort" ==> I like e
        String s = "I am extra person";

        for(int i=0; i<s.length(); i++){

            if(s.charAt(i)=='x'){
                break;// "break" keyword stops looping and takes us to the outside of the loop
            }
            System.out.print(s.charAt(i));

        }

        //Note: The last index of String "s" is "s.length()-1"
    }
}
