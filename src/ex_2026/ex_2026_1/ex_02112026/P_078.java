package ex_2026.ex_2026_1.ex_02112026;

public class P_078 {
    public static void main(String[] args) {
        //Prime Number: return true
        boolean result = primeNumber(10);
        System.out.println(result);
    }
    static boolean primeNumber(int a) {
        if (a <= 1) {
            return false;
        } else if (a % 2 == 0) {
            return false;
        } else if (a % a == 0) {
            return true;
        }
        return false;
    }


//        for(int i=2; i<=a/2; i++){
//            if(a%i==0){
//                return false;
//            }
//        }

    }


