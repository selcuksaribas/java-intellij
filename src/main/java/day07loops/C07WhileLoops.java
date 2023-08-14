package day07loops;

public class C07WhileLoops {
    public static void main(String[] args) {

        //Example 1: Type code to print integers from 4 to 7

        //1.Way:
        for(int i=4; i<8; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        //2.Way:
        int i=4;

        while(i<8){

            System.out.print(i + " ");

            i++;

        }
    }
}
