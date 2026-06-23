package OOPS;

public class abstraction {
    public static void main(String[] args) {
        // Chicken c=new Chicken();
        // c.eats();
        // c.walk();
        // Horse h= new Horse();
        // h.eats();
        // h.walk(); // cannot create instance of abstract classes and abstract methods only have idea not implemenation.
        redChicken rc=new redChicken();
    }
}
abstract class Animal{
    Animal(){
        System.out.println("animal constructer called..");
    }
    void eats(){
        System.out.println("animal eats..");

    }

    abstract void walk();

}
class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken constructer called..");
    }
    void walk(){
        System.out.println("walks on two legs..");
    }
}
class redChicken extends Chicken{
    redChicken(){
        System.out.println("redChicken constructer called..");
    }
}
class Horse extends Animal{
    void walk(){
        System.out.println("walks on four legs");
    }
}