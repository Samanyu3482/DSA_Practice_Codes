

class Person{
        private String name;
        private int age;

        void talk(){
            System.out.println("Hi my name is "+name+" and age is "+age);
        }

}
public class Oops1{
   


    public  static void main(String args[]){
       
        Person Raju=new Person();

        Person Ram=Raju;

        System.out.println(Raju.hashCode());
        System.out.println(Ram.hashCode());

        
        
        Raju.talk();


       

    }
}