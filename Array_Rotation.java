
/* Take last digit of an array and placed it at front. 
 * The process run upto n times by user input
 * 
 * Input :
 * ----------------
 * 5
 * 1 2 3 4 5
 * 3
 * 
 * Output :
 * ----------------
 * 3 4 5 1 2
 */

import java.util.Scanner;

public class Array_Rotation {




    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

    public static int[] reverse(int[] nums,int i ,int j){

        while (i<j) {
            swap(nums, i, j);
            i++;
            j--;
            
        }

        return nums;
    }

        public static void rotate(int[] nums,int k){
            k = k%nums.length;


            reverse(nums, 0,nums.length-1);
            reverse(nums, 0, k-1);
            reverse(nums, k, nums.length-1 );


            

        }


    public static void main(String[] args) {
       int k=3;
       int [] nums = {1,2,3,4,5};
       for (int i = 0; i < nums.length; i++) {

        System.out.print(", "+nums[i]);
        
    }
        System.out.println();
       rotate(nums, k);
        for (int i = 0; i < nums.length; i++) {

            System.out.print(", "+nums[i]);
            
        }

    }
    
}
