package BinaryTrees;

import BinaryTrees.LowestCommonAncestor2.Node;

public class TransformToSumTree {
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
        if(root==null){
            return;
        }

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    
    public static int transform(Node root){
        if(root==null){
            return 0;
        }
        int left=transform(root.left);
        int right=transform(root.right);
        int rootLeft=root.left==null ? 0:root.left.data;
        int rootRight=root.right==null ? 0:root.right.data;



        int data=root.data;
        root.data=left+right+rootLeft+rootRight;



        return data;


    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        transform(root);
        preorder(root);

    }
}
