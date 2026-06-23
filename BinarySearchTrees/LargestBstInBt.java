package BinarySearchTrees;


class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }

}
class Info{
    boolean isBST;
    int size;
    int min;
    int max;

    public Info(boolean isBST,int size,int min,int max){
        this.isBST=isBST;
        this.size=size;
        this.min=min;
        this.max=max;
    }
}


public class LargestBstInBt{
    public static int maxBST=0;
    public static Info largestBst(Node root){

        if(root==)

        Info left=largestBst(root.left);
        Info right=largestBst(root.right);

        int size=left.size+right.size+1;
        int min=(int)(Math.min(Math.min(left.min,right.min),root.data));
        int max=(int)(Math.max(Math.max(left.max,right.max),root.data));

        
        
        return newInfo;
    }

    public static boolean isValidBST(Node root,int max,int min){
        if(root==null){
            return true;
        }
        if(root.data>=max || root.data<=min){
            return false;
        }
        return isValidBST(root.left, root.data, min) && isValidBST(root.right, max,root.data);
    }

    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(30);
        root.left.left=new Node(5);
        root.left.right=new Node(20);
        root.right=new Node(60);
        root.right.left=new Node(45);
        root.right.right=new Node(70);
        root.right.right.left=new Node(65);
        root.right.right.right=new Node(80);
        System.out.println(isValidBST(root.right, Integer.MAX_VALUE, Integer.MIN_VALUE));
    }
}