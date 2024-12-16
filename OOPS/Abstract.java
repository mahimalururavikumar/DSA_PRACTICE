package OOPS;

public class Abstract {

    public static void main(String args[]){
        Bike obj = new Bike();
        obj.wheels = 4;
        System.out.println(obj.wheels);
    }
    
}

abstract class Vehicle{
    int wheels;
    
    Vehicle(){
        System.out.println("Vehicle constructor");
    }
    abstract void model();
}

class Car extends Vehicle{
    Car(){
        System.out.println("car constructor");
    }
    void model(){
        System.out.println("maruti 650");
    }
}

class Bike extends Car{
    Bike(){
        System.out.println("jum.. jum.. juum....");
    }
    void model(){
        System.out.println("TVS XL");
    }
}