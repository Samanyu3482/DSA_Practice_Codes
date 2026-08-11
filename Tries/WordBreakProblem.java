import java.util.*;

public class WordBreakProblem {
    static class Node {
        Node[] children; // 26
        boolean eow;

        public Node() {
            children = new Node[26];
            eow = false;

            Arrays.fill(children, null);
        }
    }
    public static Node root = new Node();
    public static void insert(String word) {
        Node curr = root;
        for(int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }
    public static boolean search(String word) {
        Node curr = root;
        for(int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }
    public static boolean wordBreak(String key) {
        if(key.length() == 0) return true;
        for(int i = 1; i <= key.length(); i++) {
            //substring(firstIdx, lastIdx);
            String firstPart = key.substring(0, i);
            String secondPart = key.substring(i);

            if(search(firstPart) && wordBreak(secondPart)) {
                return true;
            }
            

        }
        return false;
    }
    public static void main(String[] args) {
        String words[] = {"i", "like", "sam", "samsung", "mobile", "ice"};


        // create a trie 
        for(String word : words) {
            insert(word);
        }

        String key = "ilikesams";

        System.out.println(wordBreak(key));
    }
}