package ex_13072024;

public class Lab098 {
    public static void main(String[] args) {

        int itemCode = 106;
        switch (itemCode){
            case 100 -> System.out.println("It is a laptop.");
            case 101,102 -> System.out.println("It is a toy.");
            case 103,104,105 -> System.out.println("It is a book.");
            default -> System.out.println("None");
        }
    }
}
