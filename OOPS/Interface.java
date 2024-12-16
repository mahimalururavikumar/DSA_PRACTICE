package OOPS;

public class Interface {

    public static void main(String[] args) {
        Bear obj = new Bear();
        obj.flash();
        obj.grass();
    }
}

interface Carnivour{
    void flash();
}

interface Herbivour{
    void grass();
}

class Bear implements Carnivour, Herbivour{

    public void grass(){
        System.out.println("Eats grass");
    }

    public void flash(){
        System.out.println("Eats flash");
    }
}