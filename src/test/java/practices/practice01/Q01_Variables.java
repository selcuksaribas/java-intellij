package practices.practice01;

import java.util.Scanner;

public class Q01_Variables {
    public static void main(String[] args) {
//        Task: Write a Java programme to break an integer into a sequence of individual digits.
//                Hint: use / and %
//                x: input: 12345
//        output: 1
//        2
//        3
//        4
//        5
//        int a = 12345;
//        String as = String.valueOf(a);
//
//        for (int i=10000; i>0; i=i/10){
//
//            System.out.println(a/i);
//
//            a = a%i;
//       2.way
//        int a = 12345678;
//        String b = String.valueOf(a);
//
//        for (int i=0; i<b.length(); i++){
//            System.out.println(b.charAt(i));
//

        int x = 12345;
        int ones = x%10;
        int tens = (x/10)%10;
        int hundreds = (x/100)%10;
        int thousands = (x/1000)%10;      // 12345/1000 =>  12.345
        int tenThousands = (x/10000)%10;   // 12345/10000 =>  1.2345
        // camelCase, snake_case, PASCAL_CASE, kebab-case ... naming conventions

        System.out.println(tenThousands +"\n" + thousands + "\n" + hundreds+ "\n" +tens + "\n" + ones);


    }

}
