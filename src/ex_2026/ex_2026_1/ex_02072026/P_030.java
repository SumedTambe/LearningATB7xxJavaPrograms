package ex_2026.ex_2026_1.ex_02072026;

public class P_030 {
    public static void main(String[] args) {
//        Calculator Using yield:
//        Perform calculation based on operator.
//        + → addition
//        - → subtraction

        int a = 10, b = 20;
        char op = '+';

        int result = switch (op){
            case '+':
                yield a+b;
            case '-':
                yield a-b;
            default:
                yield 0;
        };
    }
}
