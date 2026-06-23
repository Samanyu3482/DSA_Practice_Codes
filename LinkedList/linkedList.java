package LinkedList;

public class linkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }//when we will create a single object of this class a node will be created.
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        //step 1 create new node
        Node newNode=new Node(data);
        size++;
        //handling exceptional case
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step 2 newnode next=head
        newNode.next=head;
        //step 3 newnode=head
        head=newNode;
    }
    public void addLast(int data){
        //step 1 create new node
        Node newNode=new Node(data);
        size++;
        //corner case
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step 2 tail next=new node
        tail.next=newNode;
        // step 3 tail=newNode
        tail=newNode;
    }
    public void prnt(){
        if(head==null){
            System.out.println("LL is empty.");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }System.out.println("null");
    }
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;//this case written seperately as if we add at idx 0 we also need to update head reference.
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<(idx-1)){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        //the following condition checks whether if we are adding at the last index so we also update the tail;
        if(newNode.next==null){
            tail=newNode;
        }
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;

    }
    public int itrSearch(int key){
        int idx=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return idx;
            }
            idx++;
            temp=temp.next;
        }
        return -1;

    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return idx;
        }
        return idx+1;
    }
    public int recurSearch(int key){
        return helper(head, key);


    }
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;//as curr is now null;

    }
    public void deleteNthNodeFromEnd(int n){
        // calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        
        //handling the condition if we are removing head
        if(n==sz){
            head=head.next;
            size--;
            return;
        }
        //handling if we are removing tail
        
        int i=1;
        int idx=sz-n;
        Node prev=head;
        while(i<idx){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        //handling if we are removing tail
        if(prev.next==null){
            tail=prev;
        }
        size--;
        return;

    }
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;
    }
    public boolean palindrome(){
        //corner cases
        if(head==null||head.next==null){
            return true;
        }
        //step 1 find mid
        Node mid=findMid(head);
        //step 2 reverse 2nd half
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        Node right=prev;//2nd half head
        Node left=head;//1 st half head

        //step 3 compare
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public  static boolean isCycle(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }

        }
        return false;

    }
    public static void removeCycle(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }

        }
        if(cycle==false){
            return;
        }
        //find meeting point
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
            
        }
        //setting to null
        prev.next=null;

    }
    public Node mergeSort(Node head){
        //corner cases
        if(head==null ||head.next==null){
            return head;
        }
        //fing mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        //left and right
        Node rightHalf=mid.next;
        mid.next=null;
        Node leftHalf=head;
        Node newLeft=mergeSort(leftHalf);
        Node newRight=mergeSort(rightHalf);
        

        //merge fxn
        return merge(newLeft,newRight);

    }
    private Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }
    public void zigzag(){
        //mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        Node mid=slow;
        //2nd half reverse
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left=head;
        Node right=prev;
        Node nextL,nextR;

        //zig zag merging
        while(left!=null &&right!=null){
            //merging
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            //updating
            right=nextR;
            left=nextL;
        }

    }
    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.addFirst(1);
        ll.addFirst(2);

        ll.addFirst(3);
        ll.addFirst(4);
        
        ll.prnt();
        ll.addLast(5);
        ll.prnt();
        ll.zigzag();
        ll.prnt();
        
        
    }

}
