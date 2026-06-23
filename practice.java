
import java.util.*;
public class practice {

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

            if(root==null) return;

            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);


        }
        public static void inorder(Node root){
            if(root==null) return;

            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);


        }
        public static void postorder(Node root){

            if(root==null) return;

            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        } 
        public static void levelorder(Node root){
            if(root==null) return;

            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node curr=q.remove();
                if(curr==null){
                    System.out.println();
                    

                    if(q.isEmpty()) break;
                    q.add(null);
                }
                else{
                    System.out.print(curr.data+" ");
                    if(curr.left!=null){
                        q.add(curr.left);
                        
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                }
            }

        }
        public static int height(Node root){
            if(root==null) return 0;


            return(Math.max(height(root.left), height(root.right))+1);
        }
        public static int count(Node root){
            if(root==null) return 0;

            return (count(root.left)+count(root.right)+1);
        }
        public static int sum(Node root){
            if(root==null) return 0;

            return (sum(root.left)+sum(root.right)+root.data);
        }
        public static int diameter1(Node root){

            if(root==null) return 0;
            int lh=height(root.left);
            int rh=height(root.right);
            int a=diameter1(root.left);
            int b=diameter1(root.right);

            return Math.max(Math.max(a, b), lh+rh+1);

        }
        static class Info{
            int diameter;
            int height;
            Info(int diameter,int height){
                this.diameter=diameter;
                this.height=height;
            }

        }
        public static Info diameter(Node root){
            if(root==null){
                return new Info(0, 0);
            }
            Info  leftInfo=(diameter(root.left));
            Info rightInfo=diameter(root.right);

            int diameter=Math.max(Math.max(leftInfo.diameter,rightInfo.diameter),leftInfo.height+rightInfo.height+1);
            int height=Math.max(leftInfo.height, rightInfo.height)+1;

            Info newInfo=new Info(diameter,height);

            return newInfo;
        }
        public static boolean isIdentical(Node root,Node subtree){
            if(root==null && subtree==null) return true;

            if((root==null) || (subtree==null) || (root.data!=subtree.data)) return false;

            if(!isIdentical(root.left,subtree.left)) return false;

            if(!isIdentical(root.right,subtree.right)) return false;

            return true;
        }
        public static boolean isSubtree(Node root, Node subtree){
            if(root==null) return false;

            if(root.data==subtree.data){
                if(isIdentical(root, subtree)) return true;
            }

            return ((isSubtree(root.left, subtree)) || (isSubtree(root.right, subtree)));
        }

        static class TopInfo{
            Node node;
            int hd;
            public TopInfo(Node node,int hd){
                this.node=node;
                this.hd=hd;
            }

        }

        public static void topView(Node root){

            Queue<TopInfo> q=new LinkedList<>();

            HashMap<Integer,Node> map=new HashMap<>();

            int min=0;
            int max=0;

            q.add(new TopInfo(root, 0));
            q.add(null);

            while(!q.isEmpty()){
                TopInfo curr=q.remove();
                if(curr==null){
                    if(q.isEmpty()){
                        break;
                    }
                    q.add(null);
                }else{
                    if(!map.containsKey(curr.hd)){
                        map.put(curr.hd,curr.node);
                    }

                    if(curr.node.left!=null){
                        q.add(new TopInfo(curr.node.left, curr.hd-1));
                        min=Math.min(min,curr.hd-1);
                    }

                    if(curr.node.right!=null){
                        q.add(new TopInfo(curr.node.right, curr.hd+1));
                        max=Math.max(max, curr.hd+1);
                    }


                }
            }

            for(int i=min;i<=max;i++){
                System.out.println(map.get(i).data);
            }

        }

        public static void horizontalDistance(Node root,int start){

            if(root==null) return;

            System.out.println(root.data+" : "+start);
            horizontalDistance(root.left, start-1);
            horizontalDistance(root. right, start+1);

        }
        public static void kThLevel2(Node root, int level , int rootLevel){
            if(root==null || level<1 || rootLevel<1) return;
            if(level==rootLevel){
                 System.out.println(root.data);
            }
            rootLevel++;
            kThLevel2(root.left, level, rootLevel);
            kThLevel2(root.right, level,rootLevel);



        }

        public static void kThLevel(Node root,int level){
            if(level<1) return;
            
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            int l=1;
            while(!q.isEmpty()){
                
                Node curr=q.remove();
                if(curr==null){
                    if(q.isEmpty()) break;

                    //System.out.println();
                    q.add(null);
                    l++;

                }else{
                    if(l==level){
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
    }
   
    public static void main(String[] args) {

     
        // int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BinaryTree tree=new BinaryTree();
        // Node root=tree.buildTree(nodes);

        // tree.preorder(root);
        // tree.inorder(root);
        //tree.postorder(root);
        //tree.levelorder(root);
        //System.out.println(tree.height(root));
        //System.out.println(tree.count(root));
        //System.out.println(tree.sum(root));
        // System.out.println(tree.diameter1(root));
        // System.out.println(tree.diameter(root).diameter);
        
        
        // BinaryTree.idx=-1;
        // int sub[]={2,4,-1,-1,5,-1,-1};
        // BinaryTree subtree=new BinaryTree();
        // Node subRoot=subtree.buildTree(sub);

        // System.out.println(tree.isSubtree(root, subRoot));




        // Top View 

        int nodes[]={1,2,-1,4,-1,5,-1,6,-1,-1,3,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        
        //tree.horizontalDistance(root, 0);

        //tree.topView(root);

        //tree.kThLevel(root, 3);
        tree.kThLevel2(root, 2, 1);



      
    }
}