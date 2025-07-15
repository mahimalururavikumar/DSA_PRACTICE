package OOPS.acess_specifier;

public class practice {

    public int publicVar = 1;
    
    protected int protectedVar = 2;
    int defaultVar = 3;
    private int privateVar = 4;

    public void publicMethod() {
        System.out.println("Public Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }
    public static void main(String[] args) {
        practice obj = new practice();

        // Accessing variables
        System.out.println("publicVar: " + obj.publicVar);
        System.out.println("protectedVar: " + obj.protectedVar);
        System.out.println("defaultVar: " + obj.defaultVar);
        System.out.println("privateVar: " + obj.privateVar);

        // Accessing methods
        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
        obj.privateMethod();
    }
}
