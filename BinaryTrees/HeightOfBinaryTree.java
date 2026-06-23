package BinaryTrees;

public class HeightOfBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){

                this.data=data;
                this.left=null;
                this.right=null;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int ln=height(root.left);
        int rh=height(root.right);
        int h=Math.max(ln, rh)+1;
        return h;
    }
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int cl=count(root.left);
        int cr=count(root.right);
        int cnt=cl+cr+1;
        return cnt;
    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int lsum=sum(root.left);
        int rsum=sum(root.right);
        return lsum+rsum+root.data;
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(sum(root));

    }
}
