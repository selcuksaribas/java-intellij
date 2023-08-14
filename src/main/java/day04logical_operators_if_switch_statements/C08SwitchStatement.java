package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C08SwitchStatement {
    public static void main(String[] args) {

        //Example 1: Type code gives you the name of the day after giving number of the day
        //           1 ==> Sunday  2 ==> Monday  ...  7 ==> Saturday

        Scanner input = new Scanner(System.in);
        System.out.println("Enter day number to see day name...");
        byte dayNum = input.nextByte();

        //1.Way:
        if(dayNum==1){
            System.out.println("Sunday");
        }else if(dayNum==2){
            System.out.println("Monday");
        }else if(dayNum==3){
            System.out.println("Tuesday");
        }else if(dayNum==4){
            System.out.println("Wednesday");
        }else if(dayNum==5){
            System.out.println("Thursday");
        }else if(dayNum==6){
            System.out.println("Friday");
        }else if(dayNum==7){
            System.out.println("Saturday");
        }else{
            System.out.println("Invalid day number");
        }

        //2.Way:
        switch(dayNum){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number");
                break;// default is the last part in switch statement, that is why using "break" after default is optional
        }

        //Note: You can use i)int ii)byte  iii)short  iv)char  v)String in switch statement
        //      float, double, long, boolean cannot be used in switch statement
    }
}
