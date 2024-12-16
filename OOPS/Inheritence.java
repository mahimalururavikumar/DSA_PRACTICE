package OOPS;

public class Inheritence{
    public static void main(String[] args) {
        Human obj = new Human();
        obj.eats();
        fish obj2 = new fish();
        obj2.breaths();
        birds obj3 = new birds();
        obj3.eats();

    }
}

class Animals{
    String color;
    void eats()
    {
        System.out.println("eats..");
    }
    void breaths(){
        System.out.println("breathing");
    }
}

class Human extends Animals{

    void speaks(){
        System.out.println("talks each other");
    }
}

class fish extends Animals{
    
    void swims(){
        System.out.println("Swims");
    }
}

class birds extends Animals{

    birds(){
        System.out.println("birds constructor");
    }
}