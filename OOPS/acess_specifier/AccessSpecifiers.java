package OOPS.acess_specifier;


// **Access Specifiers**
class AccessSpecifiers {
    // **Public Access Modifier**
    public int publicVariable = 10;

    // **Protected Access Modifier**
    protected int protectedVariable = 20;

    // **Default Access Modifier (No Modifier)**
    int defaultVariable = 30;

    // **Private Access Modifier**
    private int privateVariable = 40;

    // **Public Method**
    public void publicMethod() {
        System.out.println("Public Method");
    }

    // **Protected Method**
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    // **Default Method**
    void defaultMethod() {
        System.out.println("Default Method");
    }

    // **Private Method**
    private void privateMethod() {
        System.out.println("Private Method");
    }

    // **Main Class**
    public static void main(String[] args) {
        AccessSpecifiers accessSpecifiers = new AccessSpecifiers();

        // **Accessing Public Variable and Method**
        System.out.println(accessSpecifiers.publicVariable);
        accessSpecifiers.publicMethod();

        // **Accessing Protected Variable and Method (In the same package)**
        System.out.println(accessSpecifiers.protectedVariable);
        accessSpecifiers.protectedMethod();

        // **Accessing Default Variable and Method (In the same package)**
        System.out.println(accessSpecifiers.defaultVariable);
        accessSpecifiers.defaultMethod();

        // **Accessing Private Variable and Method (In the same class)**
        System.out.println(accessSpecifiers.privateVariable);
        accessSpecifiers.privateMethod();

        // **Accessing Private Variable and Method (In another class)**
        try {
            System.out.println(accessSpecifiers.getClass().getDeclaredField("privateVariable").get(null));
            accessSpecifiers.getClass().getDeclaredMethod("privateMethod").invoke(null);
        } catch (Exception e) {
            System.out.println("Cannot access private variable and method from another class");
        }
    }
}