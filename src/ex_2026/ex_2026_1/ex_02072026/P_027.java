package ex_2026.ex_2026_1.ex_02072026;

public class P_027 {
    public static void main(String[] args) {
        // JDK > 13
        char code = 'A';

        int val = switch (code) {
            case 'A':
                yield 65;   // return value
            default:
                throw new IllegalStateException("Unexpected value");
        };

        System.out.println(val);
    }
}
