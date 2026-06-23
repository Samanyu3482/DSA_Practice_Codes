package Stacks;
import java.util.ArrayList;
public class stacks {
    static class Stack{
        static ArrayList<Integer> arrl=new ArrayList<>();
        public static boolean isEmpty(){
            return arrl.size()==0;
        }
        public static void push(int data){
            arrl.add(data);
        }
        public static int pop(){
            if(arrl.isEmpty()){
                return -1;
            }
            int top=arrl.get(arrl.size()-1);
            arrl.remove(arrl.get(arrl.size()-1));
            return top;
        }
        public static int peek(){
            if(arrl.isEmpty()){
                return -1;
            }
            return arrl.get(arrl.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}