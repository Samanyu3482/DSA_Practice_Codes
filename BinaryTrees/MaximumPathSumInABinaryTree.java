package BinaryTrees;

public class MaximumPathSumInABinaryTree {
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
    static class Res{
        public int val;
    }
    public static int findMaxPath(Node root,Res res){
        if(root==null) return 0;

        int left=findMaxPath(root.left, res);
        int right=findMaxPath(root.right, res);

        int max_single=Math.max(root.data,root.data+Math.max(left, right));

        int max_top=Math.max(max_single, root.data+left+right);

        res.val=Math.max(res.val, max_top);


        return max_single;
    }

    public static int maxPath(Node root){
        Res res=new Res();
        res.val=Integer.MIN_VALUE;
        findMaxPath(root, res);
        return res.val;
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(10);
        root.left.left = new Node(20);
        root.left.right = new Node(1);
        root.right.right = new Node(-25);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(4);


        System.out.println(maxPath(root));
    }
}
