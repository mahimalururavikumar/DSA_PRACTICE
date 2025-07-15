package OOPS.thisAndsuper;


public class practice {

    public static void main(String[] args) {

        B obj = new B(20);

    }
}

class A{

    A(){
        System.out.println("Constructor of A");
    }

    A(int a){
        System.out.println("Constructor of A with parameter: " + a);
    }
}

class B extends A{

    B(){
        super(10);
        System.out.println("Constructor of B");
    }

    B(int b){
        this();
        System.out.println("Constructor of B with parameter: " + b);
    }
}
