package OOPS;

public class constructers {
    public static void main(String[] args) {
        // Student s1=new Student("samanyu",3482);


        // constructer overloading(when there are multiple constructers present.)

        Student s1=new Student();
        Student s2=new Student(3482);

    }
}
// class Student{
//     String name;
//     int rollNo;
//     Student(String name,int rollNo){
//         this.name=name;
//         this.rollNo=rollNo;
//         System.out.println("hi i am called now..");
//     }
//     public int rollGetter(){
//         return (this.rollNo);
//     }
//     public int rollSetter(int newRoll){
//         rollNo=newRoll;
//         return rollNo;
//     }
// }

class Student{
    int roll;
    Student(){
        System.out.println("non parameterised called..");
    }
    Student(int roll){
        this.roll=roll;
        System.out.println("parameterised called..");
    }
}