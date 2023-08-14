package day08while_loop_do_while_loop;

public class C03DoWhileLoop {
    public static void main(String[] args) {

        //while-loop
        int i=1;
        while(i<1){
            System.out.println("While loop");
            i++;
        }

        //do-while-loop
        int k=1;
        do{
            System.out.println("Do while loop");
            k++;
        }while(k<1);

        /*
            Note 1: Zero Execution is possible for while-loop, but it is not possible for do-while loop
            Note 2: do-while loop body is executed at least once.
            Note 3: do-while loop is good to use game creation.
        */

        //Example 1: Reverse a String by using do-while loop
        String s = "Alex";
        String reversed = "";

        int t = s.length()-1;

        do{
            reversed = reversed + s.charAt(t);
            t--;
        }while(t>=0);
        System.out.println(reversed);

        //Example 2: Type code to find the sum of the integers from 7 to 10
        //           7 and 10 ==> 7+8+9+10 = 34

        //1.Way: for-loop
        int sum1 = 0;

        for(int n=7; n<11; n++){
            sum1 = sum1 + n;
        }
        System.out.println(sum1);

        //2.Way: while loop
        int sum2 = 0;

        int n=7;

        while(n<11){
            sum2 = sum2 + n;
            n++;
        }
        System.out.println(sum2);

        //3.Way: do-while loop
        int sum3 = 0;

        int r = 7;

        do{
            sum3 = sum3 + r;
            r++;
        }while(r<11);
        System.out.println(sum3);
    }
}
