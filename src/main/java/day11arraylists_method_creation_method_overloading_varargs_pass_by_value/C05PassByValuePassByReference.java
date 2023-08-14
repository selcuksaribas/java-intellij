package day11arraylists_method_creation_method_overloading_varargs_pass_by_value;

public class C05PassByValuePassByReference {

    public static void main(String[] args) {

        int n = 5;
        int m = 7;

        int sum = add(n, m);


    }

    public static int add(int... a){
        int sum = 0;

        for(int w : a){
            sum = sum + w;
        }
        return sum;
    }

}
