package day08while_loop_do_while_loop;

public class C02WhileLoops {
    public static void main(String[] args) {

        //Example 3: Type code to find the sum of the digits of an integer
        //           587 ==> 5+8+7=20
        int i=587;
        int sumOfDigits = 0;

        while(i>0){
            sumOfDigits = sumOfDigits + i%10;
            i/=10;
        }
        System.out.println(sumOfDigits);

        //Example 4: Type code to create multiplication for the given integer.
        //           3 ==> 3x1=3  3x2=6  3x3=9 ... 3x9=27  3x10=30
        int k = 1;
        int number = 3;

        while(k<11){
            System.out.println(number + "x" + k + "=" + (number*k));
            k++;
        }
    }
}
