import java.util.*;

public class KthLevelOfATree {
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
    public static void levelIterative(Node root,int k){
        Queue<Node>q=new LinkedList<>();
        int level=1;
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                    level++;
                }
            }else{
                if(k==level){
                    System.out.print(curr.data+" ");
                }
                    
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
            }
        }

    }
    public static void preorderRecursive(Node root,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.print(root.data+" ");
            return; // jis case me hum level pe paunch gye toh orr niche jane ki zrurat nahi;
        }
        preorderRecursive(root.left, level+1, k);
        preorderRecursive(root.right, level+1, k);
        
    }
    public static void main(String[] args) {
        
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        levelIterative(root,3);
        System.out.println();
        preorderRecursive(root, 1, 3);
    }
}
