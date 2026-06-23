package OOPS.polymorphism;

public class methodOverriding {

    // RUN TIME POLYMORPHISM
    public static void main(String[] args) {
        Deer d1=new Deer();
        d1.eats();
    }
}
class Animal{
    void eats(){
        System.out.println("eats anything");
    }

}
class Deer extends Animal{
    void eats(){
        System.out.println("eats grass");
    }
}