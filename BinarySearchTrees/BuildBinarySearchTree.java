package BinarySearchTrees;

import java.util.ArrayList;

public class BuildBinarySearchTree {
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

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }
        if(root.data<val){
            root.right=insert(root.right, val);
        }

        return root;
    }
    public static boolean search(Node root,int key){
        if(root==null) return false;

        if(root.data==key) return true;

        if(root.data<key){
            return search(root.right, key);
        }else{
            return search(root.left, key);
        }

    
    }
    public static Node findInorderSucc(Node root){
        while(root.left!=null){
            root=root.left;

        }
        return root;
    }
    public static Node delete(Node root,int val){
        if(root.data<val){
            root.right=delete(root.right, val);
        }else if(root.data>val){
            root.left=delete(root.left, val);
        }else{
            // case 1
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2
            else if(root.left==null || root.right==null){
                if(root.left==null){
                    return root.right;
                }else{
                    return root.left;
                }
            }
            //case 3
            else{
                
                Node IS=findInorderSucc(root.right);
                root.data=IS.data;
                root.right=delete(root.right, IS.data);
            }
        }

        return root;
    }
    public static void printInRange(Node root,int k1,int k2){
        if(root==null) return;

        if(root.data<=k2 && root.data>=k1){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data>k2){
            printInRange(root.right, k1, k2);
        }else{
            printInRange(root.left, k1, k2);
        }
    }
    public static void print(ArrayList<Integer>path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"-");
        }
        System.out.println();
    }
    public static void printRoot2Leaf(Node root,ArrayList<Integer>path){
        if(root==null) return;
         path.add(root.data);
        if(root.left==null && root.right==null){
            print(path);
        }
       
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);

        path.remove(path.size()-1);

    }
    public static boolean isValidBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        else if(max!=null && root.data>=max.data){
            return false;
        }
        else{
            return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
        }

    }
    public static Node mirror(Node root){
        if(root==null){
            return root;
        }
        Node leftS=mirror(root.left);
        Node rightS=mirror(root.right);
        root.left=rightS;
        root.right=leftS;
        return root;
    }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7,6,8,9,10};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }

        inorder(root);
        System.out.println();

        root=mirror(root);

        System.out.println();
        inorder(root);

        // System.out.println(search(root, 9));



        // root=delete(root, 1);

        // inorder(root);


        // System.out.println();

        // printInRange(root, 4, 9);



        // System.out.println("-------------");

        // printRoot2Leaf(root, new ArrayList<>());

        // System.out.println(isValidBST(root, null, null));

        


        

    }
}
