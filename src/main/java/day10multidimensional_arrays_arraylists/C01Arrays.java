package day10multidimensional_arrays_arraylists;

import java.util.Arrays;

public class C01Arrays {
    public static void main(String[] args) {
        //Note 1: split() method in String Class returns Array
        String s = "Learn Java earn money";

        String[] t = s.split("a");

        System.out.println(Arrays.toString(t));// [Le, rn J, v,  e, rn money]

        //Note 2: Arrays.equals() method is used to check if two arrays are "same"(Elements and the order are the same) or not
        int[] a = new int[3];
        a[0] = 2;
        a[1] = 1;
        a[2] = 5;
        int[] b = new int[3];
        b[0] = 2;
        b[1] = 5;
        b[2] = 1;

        boolean u = Arrays.equals(a, b);

        System.out.println(u);// false
    }
}
