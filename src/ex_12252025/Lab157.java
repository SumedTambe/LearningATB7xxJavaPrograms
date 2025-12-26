package ex_12252025;

public class Lab157 {
    public static void main(String[] args) {
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        //     |

        int height = 5; // height of the tree

        // Print the tree (triangle part)
        for (int i = 1; i <= height; i++) {

            // Print spaces
            for (int space = height - i; space > 0; space--) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }

        // Print the trunk
        for (int i = 1; i <= 2; i++) {
            for (int space = 1; space < height; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

    }
}
