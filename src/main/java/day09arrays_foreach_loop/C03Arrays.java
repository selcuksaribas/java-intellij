package day09arrays_foreach_loop;

import java.util.Arrays;

public class C03Arrays {

    public static void main(String[] args) {

        //Example 5: Create an integer array and print all the elements less than 5
        //           [12, 3, -3, 5, 23] ==> 3, -3
        int[] numbers = {12, 3, -3, 5, 23};

        for(int w : numbers){
            if(w<5){
                System.out.print(w + " ");
            }
        }

        //Example 6: Check if a specific element exists in an array or not.
        int[] nums = {12, 3, 14, 5, 23};

        Arrays.sort(nums);

        int result = Arrays.binarySearch(nums, 5);

        System.out.println(result);// 1 ==> binarySearch() method gives you the index of the existing element
        //       binarySearch() method cannot be used with repeated elements
        //       *** Before using binarySearch() method, you have to use sort()

        int r = Arrays.binarySearch(nums, 11);

        System.out.println(r);// -3 ==> "-" means "does not exist"
        //        "3" means if it exists it would be 3rd element in the sorted array
        
    }
}
