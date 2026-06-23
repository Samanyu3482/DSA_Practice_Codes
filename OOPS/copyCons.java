package OOPS;

public class copyCons {
    public static void main(String[] args) {
        int marks[]={100,100,100};
        Student s1=new Student("samanyu",19,marks);
        Student s2=new Student(s1);
        s1.marks[0]=99;
        for(int i=0;i<3;i++){
            System.out.print(marks[i]+" ");
        }System.err.println();
        
        

    }
}
class Student{
    String name;
    int age;
    int marks[];
    Student(){
        System.out.println("Created.");
    }
    Student(String name,int age,int marks[]){
        this.name=name;
        this.age=age;
        this.marks=new int[marks.length];
        for(int i=0;i<3;i++){
            this.marks[i]=marks[i];
        }
        System.out.println("Created.");
    }
    Student(Student s){
        this.name=s.name;
        this.age=s.age;
        this.marks=s.marks;
    }
}