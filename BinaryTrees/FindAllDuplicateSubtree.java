package BinaryTrees;

import java.util.*;

public class FindAllDuplicateSubtree {
    static HashMap<String,Integer> map;
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    
    static String inorder(Node root){
        if(root==null) return "";
        String str="(";
        str+=inorder(root.left);
        str+=Integer.toString(root.data);
        str+=inorder(root.right);
        str+=")";

        if(map.get(str)!=null && map.get(str)==1){
            System.out.print(root.data+" ");
        }
        if(map.containsKey(str)){
            map.put(str, map.get(str)+1);
        }else{
            map.put(str, 1);
        }

        return str;

    }
    static void printDup(Node root){
        map=new HashMap<>();
        inorder(root);

    }
    
    public static void main(String[] args) {
        Node root1=new Node(1);
        root1.left=new Node(4);
        root1.right=new Node(3);
        root1.left.left=new Node(3);
        root1.right.right=new Node(3);
        root1.right.left=new Node(4);
        root1.right.left.left=new Node(4);

        

        printDup(root1);
    }
}
