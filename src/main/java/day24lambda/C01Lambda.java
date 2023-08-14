package day24lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class C01Lambda {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(17);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        System.out.println(findSquareOfDistinctEvens(nums));
        System.out.println(findMultiplicationOfLastDigitOfDistinctOdds(nums));

    }
    //Example 1:Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements
    public static int findSquareOfDistinctEvens(List<Integer> list){
        return list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0, (t,u)->t+u);
    }

    //Example 2:Create a method to calculate the "multiplication" of the "last digit" of "distinct" "odd" elements
    public static int findMultiplicationOfLastDigitOfDistinctOdds(List<Integer> list){
        return list.stream().distinct().filter(t->t%2!=0).map(t->t%10).reduce(1, (t,u)->t*u);
    }

    //Example 3: Find the maximum element in the list
    //1.Way:
    public static int findMax1(List<Integer> list){
        return list.stream().distinct().reduce(list.get(0), (t,u)->t>u ? t : u);
    }
    //2.Way:Put the elements in ascending order then the last element will be the maximum
    public static int findMax2(List<Integer> list){
        return list.stream().distinct().sorted().reduce((t,u)->u).get();
    }

    //3.Way:Put the elements in descending order then the first element will be the maximum
    public static int findMax3(List<Integer> list){
        return list.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get();
    }

        //Homework: Find the minimum element in the list by using 3 ways.

    //Example 4: Create a method to find the minimum value which is greater than 7 and even from the list
    public static int findMinEvenGreaterThanSeven(List<Integer> list){
        return list.
                stream().
                distinct().
                filter(t->t>7).
                filter(t->t%2==0).
                sorted().
                findFirst().
                get();
    }
}