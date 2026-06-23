package OOPS;

public class inheritance {
    public static void main(String[] args) {
     Children s1=new Children();
     System.out.println(s1.eyes);   

     Class8 c1=new Class8();

     System.out.println(c1.ears);
    }
}
//base class
class Human{
    int eyes=2;
    int ears=2;
    int nose=1;

}

// derived class 1
class Children extends Human{
    int maxAge=13;

}

// derived class 2
class Class8 extends Children{
    int grade=8;
}