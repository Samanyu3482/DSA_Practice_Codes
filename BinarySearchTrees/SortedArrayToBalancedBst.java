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

public class SortedArrayToBalancedBst{
    public static Node createBst(int[]arr,int start,int end){
        if(start>end){
            return null;
        }

        int mid=start+(end-start)/2;
        Node newNode=new Node(arr[mid]);

        newNode.left=createBst(arr, start, mid-1);
        newNode.right=createBst(arr, mid+1, end);

        return newNode;

    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void preorder(Node root){
        if(root==null) return;

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int arr[]={3,5,6,8,10,11,12};

        Node root=createBst(arr, 0, arr.length-1);

        preorder(root);


    }
}