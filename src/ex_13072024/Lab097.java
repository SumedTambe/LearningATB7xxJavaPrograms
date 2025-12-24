package ex_13072024;

public class Lab097 {
    public static void main(String[] args) {
        int iteamcode = 105;

        switch (iteamcode){
            case 100,101,102:
                System.out.println("It is electronic gadget.");
                break;
            case 103,104,105:
                System.out.println("It is machanical gadget.");
                break;
            default:
                System.out.println("None");
        }
    }
}
