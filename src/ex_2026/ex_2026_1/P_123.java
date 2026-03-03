package ex_2026.ex_2026_1;

public class P_123 {
    public static void main(String[] args) {
        polymorph pl = new polymorph();
        int A = pl.add(10, 20);
        double B = pl.add(10.5, 20.5);
    }
}


class polymorph{
    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }


}