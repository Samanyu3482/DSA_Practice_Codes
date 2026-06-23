package LinkedList;

public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }
        if(size==1){
            newNode.next=head;
            newNode.prev=null;
            head=tail=newNode;
            size++;
            return;

        }
        
        newNode.next=head;
        newNode.prev=head.prev;
        head=newNode;
        size++;
        
    }
    public void prnt(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }System.out.println("null");
    }
    public int removeFirst(){
        if(head==null){
            System.out.println("ll is empty.");
            return Integer.MIN_VALUE;
        }
        int val=head.data;
        if(size==1){
            head=tail=null;
            size--;
            return val;
        }
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
  public void reverse(){
    Node curr=head;
    Node prev=null;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        curr.prev=next;
        prev=curr;
        curr=next;
    }
    head=prev;
  }
    public static void main(String[] args) {
        DoublyLL dll=new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.prnt();
        System.out.println(dll.size);
        dll.removeFirst();
        dll.prnt();
        dll.reverse();
        dll.prnt();
        
        
    }
}
