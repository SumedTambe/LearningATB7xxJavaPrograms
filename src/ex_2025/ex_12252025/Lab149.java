package ex_2025.ex_12252025;

import java.util.Arrays;

public class Lab149 {
    public static void main(String[] args) {
        //Find the Max in the Array
        //Find the Max Salary in the Array
        // using function

        int[] nums = {110, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        Arrays.sort(nums);
        System.out.println(nums[nums.length-1]);
    }
}
