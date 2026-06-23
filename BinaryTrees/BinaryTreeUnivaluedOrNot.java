package BinaryTrees;

import BinaryTrees.MinimumDistanceBetweenTwoNodes.Node;

public class BinaryTreeUnivaluedOrNot {
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
    public static boolean univalued(Node root,int value){
        if(root==null) return true;
        if(root.data!=value) return false;
        return (univalued(root.left,value) && univalued(root.right,value));
       
        
    }
    public static void main(String[] args) {
        Node root=new Node(2);
        root.left=new Node(2);
        root.right=new Node(2);
        root.left.left=new Node(5);
        root.left.right=new Node(2);
        root.right.left=new Node(2);
        root.right.right=new Node(2);



        System.out.println(univalued(root, root.data));
        
    }
}
