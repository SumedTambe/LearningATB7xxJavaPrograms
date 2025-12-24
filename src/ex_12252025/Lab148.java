package ex_12252025;

public class Lab148 {
    public static void main(String[] args) {
        //Find the Max in the Array
        //Find the Max Salary in the Array

        int[] nums = {110, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int max = nums[0];

        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }else {
                max = max;
            }
        }
        System.out.println(max);
    }
}
