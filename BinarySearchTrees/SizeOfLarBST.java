package BinarySearchTrees;

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
public class SizeOfLarBST{
    public static  ArrayList<Integer>list=new ArrayList<>();
    public static void isBst(Node root){
        if(root==null){
            return;
        }
        
        isBst(root.left);
        list.add(root.data);
        isBst(root.right);
    }
    public static boolean isABst(Node root){
        list.clear();
        isBst(root);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public static boolean containBst(Node root){
        if(root==null){
            return true;
        }
        if(isABst(root)){
            return true;
        }
        return containBst(root.left)||containBst(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(30);
        root.right=new Node(60);
        root.right.right=new Node(70);
        root.right.left=new Node(45);
        root.left.left=new Node(5);
        root.left.right=new Node(20);
        root.right.right.left=new Node(65);
        root.right.right.right=new Node(80);

        System.out.println(containBst(root));

    }   
}