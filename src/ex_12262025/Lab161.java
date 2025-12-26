package ex_12262025;

public class Lab161 {
    public static void main(String[] args) {
        //****
        //***
        //**
        //*

        int rows=4;
        //run rows
        for(int i=1; i<=rows; i++){
            //run stars
            for (int star=rows; star>=i; star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
