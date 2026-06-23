package OOPS.polymorphism;

public class methodOverloading {


    // COMPILE TIME POLYMORPHISM
    public static void main(String[] args) {
        Calculater c1=new Calculater();
        System.out.println(c1.sum(1,2));
        System.out.println(c1.sum(1.5f,2.3f));
        System.out.println(c1.sum(1,2,3));
    }
}
class Calculater{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}