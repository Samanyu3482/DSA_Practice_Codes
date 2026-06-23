package Stacks;
import java.util.*;
public class StackLL {
    // static class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data=data;
    //         this.next=null;
    //     }
    // }
    // static class Stack{
    //     static Node head=null;
    //     public static boolean isEmpty(){
    //         return head==null;
    //     }
    //     public static void push(int data){
    //         Node newNode=new Node(data);
    //         if(head==null){
    //             head=newNode;
    //             return;
    //         }
    //         newNode.next=head;
    //         head=newNode;
    //     }
    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int val=head.data;
    //         head=head.next;
    //         return val;
    //     }
    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return head.data;
    //     }
    // }
    public static void main(String[] args) {
        // Stack st=new Stack();
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
