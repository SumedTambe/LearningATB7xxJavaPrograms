package ex_12262025;

public class Lab162 {
    public static void main(String[] args) {
        //   *
        //  **
        // ***
        //****

        int rows=4;
        //run the rows
        for(int i=1; i<=rows; i++){
            //run the spaces
            for(int space=rows-1; space>=i; space--){
                System.out.print(" ");
            }
            //run the stars
            for(int star=1; star<=i; star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
