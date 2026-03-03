package ex_2026.ex_2026_1.ex_02072026;

public class P_033 {
    public static void main(String[] args) {
//        Pass / Fail Logic
//        Return result based on marks.
//        35+ → Pass
//        Below 35 → Fail

        int mark = 40;

        String result = switch (mark >= 35 ? 1 : 0){
            case 1:
                yield "Pass";
            default:
                yield "Fail";
        };
        System.out.println(result);
    }
}
