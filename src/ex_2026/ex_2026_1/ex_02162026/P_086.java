package ex_2026.ex_2026_1.ex_02162026;

public class P_086 {
    public static void main(String[] args) {
        //Find Maximum Element in Array
        int[] arr = {12, 45, 7, 89, 23};

        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max: "+max);
    }
}
