package Array;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Arrays;

public class BiggestNumber {
    public static void main(String[] args) {

        //create an array to store these numbers
        //find biggest number from this array

        int[] nums = {45, 5, 6, 47, 57, 8, 12, 20, 30, };

        int biggest = nums[0];


        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > biggest) {
                biggest = nums[i];
            }
            System.out.println(biggest);
        }
        System.out.println(biggest);

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        //print last element from this array
        System.out.println(nums[nums.length-1]); // this is the last element and also biggest number
                                                 //since the array is sorted

        System.out.println(nums[0]); //this is first element and also smallest Number
                                       //since the array is sorted

        //write a code to find smallest number with out using sort method

        int[] nums1 = {45, 5, 6, 47, 57, 8, 12, 20, 30, };

        int smallest = nums1[0];
        for (int i =1; i < nums1.length; i++){

            if( nums1[i]<smallest){
                smallest= nums1[i];

            }
        }
        System.out.println("The smallest number is "+ smallest);

    }

}

