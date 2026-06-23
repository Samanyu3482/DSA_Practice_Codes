package Queue;

public class queueArrayImple {
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        Queue(int n){
            arr=new int[n];
            size=n;

        }
        public static boolean isEmpty(){
            if(rear==-1){
                return true;
            }
            return false;
        }
        public static void add(int data){
            if(rear==size-1){
                System.out.println("Queue is full.");
                return;
            }
            rear+=1;
            arr[rear]=data;
            System.out.println("added at index : "+rear);

        }
        public static int remove(){
            if(rear==-1){
                System.out.println("Queue is already empty");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<size-1;i++){
                arr[i]=arr[i+1];
            }
            rear-=1;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q= new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }


    }
}
