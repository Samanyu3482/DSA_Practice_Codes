package GreedyAlgorithms.JavaComparator;
import java.util.*;
public class ComparatorJava {
    public static void main(String[] args) {
        ArrayList<Person>arr=new ArrayList<>();
        arr.add(new Person("Sam", 25));
        arr.add(new Person("Samanyu", 19));

        System.out.println(arr);
        Collections.sort(arr);

        System.out.println(arr);
        



    }
}
class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String s,int a){
        name=s;
        age=a;

    }
    @Override
    public int compareTo(Person p){
        return this.age-p.age;

    }

    @Override
    public String toString() { 
        return name + " : " + age;
    }
}