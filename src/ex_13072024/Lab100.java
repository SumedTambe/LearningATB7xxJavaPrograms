package ex_13072024;

public class Lab100 {
    public static void main(String[] args) {
        char code = 'A';
        int val = switch (code){
            case 'A' -> {
                yield  65;
            }
            default -> -1;
        };

        System.out.println(val);
    }

}
