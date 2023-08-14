package day08while_loop_do_while_loop;

public class C01WhileLoops {
    public static void main(String[] args) {

        //Example 1: Type code to print even integers from 13 to 8 on the console.
        int i=13;

        while(i>7){

            if(i%2==0){
                System.out.print(i +" ");
            }

            i--;
        }
        /*
            Note: "Infinite Loop" is a risk in using loops.
                  If you forget to type "increment or decrement part" in loops, you will have "infinite loop" and Java will stuck over there
                  it means your application will freeze.
                  If you type "increment or decrement part" wrongly in loops, you will have "infinite loop" and Java will stuck over there
                  it means your application will freeze.
         */

        System.out.println();

        //Example 2: Type code to check if a given integer is palindrome or not
        //           Palindrome: 121 <==> 121        123321 <==> 123321

        int k = -121;

        k = Math.abs(k);

        String m = String.valueOf(k);

        String reversed = "";

        int n = m.length()-1;

        while(n>=0){
            reversed = reversed + m.charAt(n);
            n--;
        }
        System.out.println(reversed);

        if(m.equals(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
