package day11arraylists_method_creation_method_overloading_varargs_pass_by_value;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C01ArrayLists {

    public static void main(String[] args) {

        //From a given list find all pairs whose sum is a given number
        //{4, 6, 5, -10, 8, 5, 20} ==> 10
        //For example;  4+6=10, 5+5=10, -10+20=10

        List<Integer> m = new ArrayList<>();
        m.add(4);
        m.add(6);
        m.add(5);
        m.add(-10);
        m.add(8);
        m.add(5);
        m.add(20);
        System.out.println(m);

        for(int i=0; i<m.size();i++){

            for(int k=i+1; k<m.size(); k++){

                if(m.get(i) + m.get(k)==10){
                    System.out.println(m.get(i) + " and " + m.get(k));
                }
            }
        }

        //Short syntax to create a list and add elements into it
        List<Integer> n = Arrays.asList(4, 6, 5, -10, 8, 5, 20);

        System.out.println(n);// [4, 6, 5, -10, 8, 5, 20]

        //n.remove(6);
        //n.add(11);
        //n.clear();

        //Collections.sort(n);
        n.set(1,22);
        System.out.println(n);// [4, 22, 5, -10, 8, 5, 20]

        //Note: If you create a list by using Arrays.asList() method, you cannot use the ArrayList methods change the
        //      number of elements in the list. For example; remove(), add(), clear() cannot be used but set(), size() can be used.
    }
}