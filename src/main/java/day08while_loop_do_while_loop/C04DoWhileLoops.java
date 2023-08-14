package day08while_loop_do_while_loop;

import java.util.Scanner;

public class C04DoWhileLoops {
    public static void main(String[] args) {

        /*
              Ask user to enter an integer.
              If the integer is less than 100, tell user "Won!"
              Otherwise, tell user "Lost!"
        */
        Scanner input = new Scanner(System.in);

        //1.Way:
        int i = 0;

        do{
            System.out.println("Enter an integer...");
            i = input.nextInt();
            if(i<100){
                System.out.println("Won");
            }
        }while(i<100);
        System.out.println("Lost");

        //2.Way:
        int k=0;

        do{
            System.out.println("Enter an integer...");
            k = input.nextInt();

            if(k>99){
                System.out.println("Lost");
                break;
            }else{
                System.out.println("Won");
            }
        }while(true);
    }
}
