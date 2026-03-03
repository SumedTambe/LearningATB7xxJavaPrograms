package ex_2026.ex_2026_1.ex_02162026;

import java.util.Arrays;

public class P_089 {
    public static void main(String[] args) {
        // Find the max by using Array.sort();
        int[] arr = {12, 45, 7, 89, 23};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}
