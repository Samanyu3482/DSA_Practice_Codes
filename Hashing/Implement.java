import java.util.ArrayList;
import java.util.LinkedList;

public class Implement{

    static class HashMap<K,V>{ // generic
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n; //no of nodes
        private int N; // no of buckets
        private LinkedList<Node> buckets[]; // N=buckets.length

        @SuppressWarnings("unchecked")

        public HashMap(){
            
            this.N=4;
            buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();

            }
        }

        private int hashFunction(K key){
            int hc=key.hashCode();
            int bi=(int)Math.abs(hc)%buckets.length;
            return bi;

        }
        private int searchInLL(K key){
            int bi=hashFunction(key);
            LinkedList<Node> ll=buckets[bi];
            int di=0;
            for(int i=0;i<ll.size();i++){
                Node node=ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;

        }
         @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBucket[]=buckets;
            buckets=new LinkedList[N*2];
            N=N*2;
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
            for(int i=0;i<oldBucket.length;i++){
                LinkedList<Node>ll=oldBucket[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.remove();
                    put(node.key, node.value);
                }
            }

        }
        public void put(K key,V value){
            int bi=hashFunction(key);
            int di=searchInLL(key); //valid // invalid -1

            if(di!=-1){
                Node node=buckets[bi].get(di);
                node.value=value;
            }else{
                Node node=new Node(key, value);
                buckets[bi].add(node);
                n++;
            }
            double lambda=(double)n/N;
            if(lambda>2.0){
                rehash();
            }


        }
         @SuppressWarnings("unchecked")
        public boolean containsKey(K key){
            int bi=hashFunction(key);
            LinkedList<Node> ll=buckets[bi];
            for(int i=0;i<ll.size();i++){
                Node node=ll.get(i);i
                if(node.key==key){
                    return true;
                }
            }
            return false;
        }
        public V get(K key){
            int bi=hashFunction(key);
            int di=searchInLL(key);
            if(di==-1){
                return null;
            }
            return buckets[bi].get(di).value;
        }
        public V remove(K key){
            int bi=hashFunction(key);
            int di=searchInLL(key);

            if(di!=-1){
                Node node=buckets[bi].remove(di);
                n--;
                return node.value;
            }
            else{
                return null;
            }

        }
        public ArrayList<K> keySet(){
            ArrayList<K> arr=new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node>ll=buckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    arr.add(node.key);
                }
            }
            return arr;
        }
        public boolean isEmpty(){
            return n==0;
        }



    }
    

    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Nepal",5);
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.get("China"));
        ArrayList<String>arr=hm.keySet();
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i)+" "+hm.get(arr.get(i)));
        }

    }
}