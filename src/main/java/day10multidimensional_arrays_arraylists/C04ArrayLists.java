package day10multidimensional_arrays_arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C04ArrayLists {

    public static void main(String[] args) {

        //Example 3: Create a character list which has repeated elements then remove the duplicates
        //           [J, a, v, a, c] ==> [J, a, v, c]
        List<Character> a = new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');

        List<Character> b = new ArrayList<>();// [          ]

        // [ J, a, v, a, v ]
        for(Character w : a){

            if(!b.contains(w)){
                b.add(w);
            }
        }
        System.out.println(b);

        //Example 4: Find the closest 2 integers in the given list.
        //           [20, 15, 14, 11, 19] ==> 14-15, 19-20

        List<Integer> p = new ArrayList<>();
        p.add(20);
        p.add(15);
        p.add(14);
        p.add(11);
        p.add(19);
        System.out.println(p);// [ 20, 15, 14, 11, 19 ]

        //Sort the list elements in ascending order
        Collections.sort(p);
        System.out.println(p);// [ 11, 14, 15, 19, 20 ]

        //Find the minimum difference
        int minimum = p.get(1) - p.get(0);

        for(int i=1; i<p.size(); i++){
            minimum = Math.min(minimum, p.get(i) - p.get(i-1));
        }
        System.out.println(minimum);

        //Find the elements give minimum difference
        for(int i=1; i<p.size(); i++){
            if(p.get(i) - p.get(i-1) == minimum){
                System.out.println(p.get(i-1) + " and " + p.get(i));
            }
        }
    }
}