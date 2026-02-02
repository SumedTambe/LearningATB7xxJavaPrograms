package ex_2025.ex_12282025;

class Parent {
    int x = 10;
}

class child extends Parent{
    int x = 20;

    void show(){
        System.out.println(this.x);
        System.out.println(super.x);
    }

    public static void main(String[] args) {
        child c = new child();
        c.show();
    }
}



