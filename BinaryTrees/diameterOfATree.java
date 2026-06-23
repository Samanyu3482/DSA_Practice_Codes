import java.util.*;

public class diameterOfATree{
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
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);

        }
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            
            inorder(root.right);

        }
        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
            
           

        }
        public static void levelorder(Node root){
            

            Queue<Node>que=new LinkedList<>();
            que.add(root);
            que.add(null);
            while(!que.isEmpty()){
                Node currNode=que.remove();
                if(currNode==null){
                    System.out.println();
                    if(que.isEmpty()){
                        break;
                    }else{
                        que.add(null);
                    }

                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        que.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        que.add(currNode.right);

                    }
                }
            }
            
           

        }
        public static int height(Node root){
            if(root==null){
                return 0;
            }

            return Math.max(height(root.left),height(root.right))+1;
            

        }
        public static int count(Node root){
            if(root==null){
                return 0;
            }

            return count(root.left)+count(root.right)+1;
        }
        public static int sum(Node root){

            if(root==null){
                return 0;
            }

            return sum(root.right)+sum(root.left)+root.data;
        }
        public static int diameter(Node root){
            if(root==null){
                return 0;
            }

            int case1=height(root.left)+height(root.right)+1;
            int case2=Math.max(diameter(root.left), diameter(root.right));
            return Math.max(case1, case2);
        }
        
        static class Info{
            int diameter;
            int height;
            public Info(int d,int h){
                diameter=d;
                height=h;
            }
        }
        public static Info optimisedDiameter(Node root){
            if(root==null){
                return new Info(0, 0);
            }

            Info leftInfo=optimisedDiameter(root.left);
            Info rightInfo=optimisedDiameter(root.right);

            int diameter=Math.max(Math.max(leftInfo.diameter, rightInfo.diameter),leftInfo.height+rightInfo.height+1);
            int height=Math.max(leftInfo.height,rightInfo.height)+1;
            return new Info(diameter,height);
        }
        
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println();
        tree.levelorder(root);
        System.out.println(tree.height(root));
        System.out.println(tree.count(root));
        System.out.println(tree.sum(root));
        System.out.println(tree.diameter(root));
        System.out.println(tree.optimisedDiameter(root).diameter);

    }
}