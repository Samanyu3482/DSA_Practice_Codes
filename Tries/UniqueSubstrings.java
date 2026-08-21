import java.util.*;

public class UniqueSubstrings {
    static class Node {
        Node children[] = new Node[26];
        boolean eow;

        public Node() {
            Arrays.fill(children, null);

        }
    }
    public static Node root = new Node();
    public static void insert(String word) {
        Node curr = root;
        for(int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static int countNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int count = 0;
        for(int i = 0; i < 26; i++) {
            if(root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }
        return count + 1;
    }
    public static int countUnique(String word) {
        for(int i = 0; i < word.length(); i++) {
            String suffix = word.substring(i);
            insert(suffix);
        }

        return countNodes(root);
    }
    public static void main(String[] args) {
        String word = "ababa";
        System.out.println(countUnique(word));
    }
}