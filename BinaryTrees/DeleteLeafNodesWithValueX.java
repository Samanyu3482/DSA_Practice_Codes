package BinaryTrees;

import BinaryTrees.MinimumDistanceBetweenTwoNodes.Node;

public class DeleteLeafNodesWithValueX {
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

    public static void preorder(Node root){
        if(root==null) return;

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static boolean isLeaf(Node root){
        if(root==null) return false;
        if(root.left==null && root.right==null) return true;

        return false;
    }

    
    public static Node deleteLeaf(Node root,int x){
        if(root==null) return null;

        root.left= deleteLeaf(root.left,x);
        root.right=deleteLeaf(root.right,x);

        if(root.data==x && isLeaf(root)){
            return null;

        }

       
        return root;



    }

    public static void main(String[] args){
        Node root1=new Node(1);
        root1.left=new Node(3);
        root1.right=new Node(3);
        root1.left.left=new Node(3);
        root1.left.right=new Node(2);
        

        
        preorder(deleteLeaf(root1,3));
    }
}
