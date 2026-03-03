package ex_2026.ex_2026_1.ex_02242026;

public class P_121 {
    public static void main(String[] args) {

    }
}
//Private: Accessible only inside the same class, Used for data hiding.
class student{
    private int marks;
    int number = 10;
    void setMarks(int m){
        marks = m;
    }

    int getMarks(){
        return marks;
    }
}