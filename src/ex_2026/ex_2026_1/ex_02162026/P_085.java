package ex_2026.ex_2026_1.ex_02162026;

public class P_085 {
    public static void main(String[] args) {
        //Sum of Array Elements
        int[] arr = {10, 20, 30, 40};
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum: "+sum);
    }
}
