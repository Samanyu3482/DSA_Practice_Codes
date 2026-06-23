package Queue;

public class circularQueueArr {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        public static boolean isEmpty(){
            if(rear==-1 && front==-1){
                return true;
            }
            return false;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full.");
                return;
            }
            //this is the case where we are adding 1 st element;
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
            System.out.println("added at index : "+rear);

        }
        public static int remove(){
            if(rear==-1){
                System.out.println("Queue is already empty");
                return -1;
            }
            int result=arr[front];
            
            //last element removal
            if(rear==front){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        
    }
}
