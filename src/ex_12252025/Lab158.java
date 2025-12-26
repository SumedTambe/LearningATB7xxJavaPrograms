package ex_12252025;

public class Lab158 {
    public static void main(String[] args) {
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        //     |

        //run the rows
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            //run the space
            for (int space = rows - i; space >= 1; space--) {
                System.out.print(" ");
            }
            //run the stars
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //add trunk
        for(int truck=1; truck<=rows-1;truck++){
            System.out.print(" ");
        }
        System.out.println("|");
    }
}
