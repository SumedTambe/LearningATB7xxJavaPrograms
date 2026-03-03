package ex_2026.ex_2026_1.ex_02162026;

public class P_087 {
    public static void main(String[] args) {
        //Find Minimum Element in Array
         int[] arr = {12, 45, 7, 89, 23, 7};

         int min = arr[0];

         for(int i=arr.length-1; i>=0; i--){
             if(min > arr[i]){
                 min = arr[i];
             }
         }
        System.out.println("Min: "+min);
    }
}
