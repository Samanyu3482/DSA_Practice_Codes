public class Practice{

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            left=right=null;
        }

    }

    public static void inorder(Node root){

        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public static boolean search(Node root,int key){
        if(root==null) return false;

        if(root.data==key) return true;

        if(root.data<key){
            return search(root.right, key);
        }
        else if(root.data>key){
            return search(root.left, key);
        }
        else{
            return false;
        }
    }

    public static Node insert(Node root,int val){
        if(root==null){
            return new Node(val);
        }

        if(root.data<val){
            root.right= insert(root.right, val);
        }else{
            root.left= insert(root.left, val);
        }
        return root;
    }

    public static boolean isBST(Node root,int min,int max){
        if(root==null) return true;
        if(root.data>=max || root.data<=min) return false;

        return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
    }

    public static void delete(Node root,int key){
        if(root==null) return;

        

        if(root.left!=null && root.left.data==key){
            // case 1 leaf Node
            if(root.left.left==null && root.left.right==null){
                root.left=null;
            }
            // case 2 single child
            if(root.left.left==null && root.left.right!=null){
                root.left=root.left.right;
            }else if(root.left.left!=null && root.left.right==null){
                root.left=root.left.left;
            }
        }
        else if(root.right!=null && root.right.data==key){
            // case 1 leaf Node
            if(root.right.left==null && root.right.right==null){
                root.right=null;
            }
            // case 2 single child
            if(root.right.left==null && root.right.right!=null){
                root.right=root.right.right;
            }else if(root.right.left!=null && root.right.right==null){
                root.right=root.right.left;
            }
        }
        else{
            if(root.data<key){
                delete(root.right, key);
            }else{
                delete(root.left, key);
            }
        }
        

    }
      
    public static void main(String[] args) {

        Node root=new Node(20);
        root.right=new Node(25);
        root.right.left=new Node(22);
        root.right.right=new Node(26);
        root.left=new Node(19);
        root.left.left=new Node(18);

      

        inorder(root);
        delete(root, 19);
        System.out.println("---------------");
        inorder(root);


        
    }
}