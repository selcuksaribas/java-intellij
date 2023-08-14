package day10multidimensional_arrays_arraylists;

import java.util.Arrays;

public class C02MultidimensionalArrays {

    public static void main(String[] args) {

        //How to create multidimensional array
        int[][] a = new int[3][2];

        //How to print multidimensional array
        System.out.println(Arrays.deepToString(a));// [[0, 0], [0, 0], [0, 0]]

        //How to add elements
        a[0][1] = 3;
        a[0][0] = 2;
        a[1][0] = 5;
        a[1][1] = 2;
        a[2][0] = 7;
        a[2][1] = 9;
        System.out.println(Arrays.deepToString(a));// [[2, 3], [5, 2], [7, 9]]

        //Example 1: Type code to find the total number of elements in a multidimensional array
        String[][] b = { {"X", "U"}, {"a", "d", "m"}, {"T"} };

        int sum = 0;
        //{ {"X", "U"}, {"a", "d", "m"}, {"T"} }
        for(String[] w : b){
            sum = sum + w.length;
        }
        System.out.println(sum);

        //Example 2: Print the elements which has "a" in it from a multidimensional array
        String[][] c = { {"Java", "is"}, {"easy"}, {"to", "learn"} };

        // { {"Java", "is"}, {"easy"}, {"to", "learn"} }
        for(String[] w : c){

            for(String u : w){

                if(u.contains("a")){
                    System.out.println(u);
                }
            }
        }

        //Example 3: Type code to find the maximum and minimum elements in a 2 dimensional integer array
        int[][] n = { {5, 2}, {14, 9}, {-7} };

        int maximum = n[0][0];
        int minimum = n[0][0];
        // { {5, 2}, {14, 9}, {7} }
        for(int[] w : n){

            for(int u : w){

                maximum = Math.max(u, maximum);

                minimum = Math.min(u, minimum);

            }
        }
        System.out.println(maximum);
        System.out.println(minimum);

        //Example 4: Type code to convert a multidimensional array to a one dimensional array
        //           { {5, 2}, {14, 9}, {-7} } ==> { 5, 2, 14, 9, -7 }
        int[][] p = { {5, 2}, {14, 9}, {-7} };

        int ln = 0;
        // { {5, 2}, {14, 9}, {-7} }
        for(int[] w : p){
            ln = ln + w.length;
        }

        int[] r = new int[ln];

        int idx = 0;
        // { {5, 2}, {14, 9}, {-7} }
        for(int[] w : p){

            for(int u : w){

                r[idx] = u;

                idx++;
            }
        }
        System.out.println(Arrays.toString(r));// [5, 2, 14, 9, -7]
    }
}
