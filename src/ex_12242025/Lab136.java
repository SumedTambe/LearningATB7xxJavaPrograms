package ex_12242025;

public class Lab136 {
    public static void main(String[] args) {
        // 1. Without Parameters and Without Return type
        // 2. Without Parameters but With Return type
        // 3. With Parameters and Without Return type
        // 4. With Parameters and With Return type


        //Call
        //1.
        funtion_type1();

        //2.
        String i = function_type2();

        //3.
        function_type3("Sumed");

        //4.
        int sum = function_type4(4, 5);

    }

    //Define
    //1. Without Parameters and Without Return type
    static void funtion_type1(){
        System.out.println("Hello");
    }

    //2. Without Parameters but With Return type
    static String function_type2(){
        return "Hello";
    }

    //3. With Parameters and Without Return type
    static void function_type3(String name){
        System.out.println(name);
    }

    // 4. With Parameters and With Return type
    static int function_type4(int a, int b){
        return a+b;
    }

}
