
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }

}

public class MergeTwoBST{
    public static void inorder(Node root,ArrayList<Integer>list){
        if(root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);

    }
    public static ArrayList<Integer> merge(ArrayList<Integer>list1,ArrayList<Integer>list2){
        ArrayList<Integer>result=new ArrayList<>();
        int p1=0;
        int p2=0;
        while(p1<list1.size() && p2<list2.size()){
            if(list1.get(p1)<list2.get(p2)){
                result.add(list1.get(p1));
                p1++;
            }else{
                result.add(list2.get(p2));
                p2++;
            }
        }
        while(p1<list1.size()){
            result.add(list1.get(p1));p1++;
        }
        while(p2<list2.size()){
            result.add(list2.get(p2));p2++;
        }
        return result;
    }
    public static void printInorder(Node root){
        if(root==null){
            return;
        }
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }
    public static Node mergeTree(ArrayList<Integer>list,int start,int end){
        if(end<start){
            return null;
        }
        if(end==start){
            return new Node(list.get(end));
        }
        int mid=(start+end)/2;
        Node newNode=new Node(list.get(mid));
        newNode.left=mergeTree(list, start, mid-1);
        newNode.right=mergeTree(list, mid+1, end);
        return newNode;
    }

    public static void main(String[] args) {
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);

        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        inorder(root1,list1);
    
        inorder(root2,list2);

        ArrayList<Integer> result=merge(list1, list2);

        Node root=mergeTree(result, 0, result.size()-1);

        printInorder(root);
        




    }
}