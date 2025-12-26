package ex_12252025;

public class Lab155 {
    public static void main(String[] args) {
        //1. Right Triangle Star Pattern
        //*
        //**
        //***
        //****
        int row=4;

        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");
                }
            System.out.println();
        }
    }
}
