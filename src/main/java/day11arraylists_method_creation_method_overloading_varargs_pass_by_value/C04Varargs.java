package day11arraylists_method_creation_method_overloading_varargs_pass_by_value;

public class C04Varargs {

    //"Varargs" stands for "Variable Arguments"
    //By using "Varargs", we made method work with different number of arguments
    //"Varargs" uses "Arrays" behind, that is why when you work with "Varargs", think you are working with "Arrays"
    //You cannot use any parameter after "Varargs", so "Varargs" must be the last parameter in a method
    //You can use parameter before "Varargs", because the parameter you used can be make full, then "Varargs" will be reachable
    //You can use just a single "Varargs" in a method parenthesis

    public static void main(String[] args) {

        System.out.println(add());

        System.out.println(add(5));

        System.out.println(add(5, 3));

        System.out.println(add(5, 3, 2, 1, 34, 23, 12, 5, 9, 11));

    }

    //Create a method able to do addition with any number of parameters
    public static int add(int... a){
        int sum = 0;

        for(int w : a){
            sum = sum + w;
        }
        return sum;
    }
}