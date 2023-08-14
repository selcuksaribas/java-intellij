package day04logical_operators_if_switch_statements;

public class C02LogicalOperators {
    public static void main(String[] args) {

        //"AND" Logical Operator: &&
        //Note 1: Just a single "false" is enough to make the result false (Perfectionist)
        //Note 2: To get "true" from "&& Operation", all must be true
        int i = 10;
        int k = 5;
        System.out.println((i>k) && (i==2*k) && (i/k==2) && (i%k==2));

        //In the following example, first is false so no need to check others.
        //Because just a single "false" is enough to make the result false.
        System.out.println((i<k) && (i==2*k) && (i/k==2) && (i%k==2));

        //Note 3: If you use "&&" in "AND" operation, Java does not check the others after finding first false
        //      But if you want Java to check all operations us "&"
        System.out.println((i<k) & (i==2*k) & (i/k==2) & (i%k==2));

        //"OR" Logical Operator: ||
        //Note 4: Just a single "true" is enough to make the result "true" in "||" operation (Pollyanna)
        //Note 5: To get "false" from "||" operation, all must  be "false"
        int a = 6;
        int b = 2;
        System.out.println((a>=b) || (a%b!=0) || (a<=3*b));
        System.out.println((a==b) || (a%b!=0) || (a>3*b));

        //Note 6: There is no single usage of "|", in "OR" operation we must use "||"
        System.out.println(((a>=b) || (a%b!=0)) && (a<=3*b));//true
        System.out.println((a>=b) || ((a%b!=0) && (a<=3*b)));//true

    }
}
