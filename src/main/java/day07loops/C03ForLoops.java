package day07loops;

public class C03ForLoops {
    public static void main(String[] args) {
       /*
            Example 7: Type code to print the following image on the console (Nested For Loop)
            X X X
            X X X

       */
        int row = 2;
        int column = 3;

        for(int i=1; i<=row; i++){

            String s = "";

            for(int k=1; k<=column; k++){
                s = s + "X ";
            }

            System.out.println(s);

        }
    }
}
