package ex_12232025;

public class Lab123 {
    public static void main(String[] args) {
        // print 1 to 50 numbers, but from of identify like Even -> 2 and Odd -> 3

        for(int i=1; i<=50; i++){
            if(i%2 == 0){
                System.out.println("Even -> "+i);
                continue;
            }
            System.out.println("Odd -> "+i);
    }
}
}
