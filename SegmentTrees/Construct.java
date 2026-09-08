import java.util.*;

public class Construct {
    static int[] tree;
    public static void init(int n) {
        tree = new int[4 * n];
    }
    public static int buildTree(int[] arr, int sIdx, int start, int end) {
        if(start == end) {
            tree[sIdx] = arr[start];
            return tree[sIdx];
        }
        int mid = (start + end) / 2;
        int left = buildTree(arr, 2 * sIdx + 1, start, mid);
        int right = buildTree(arr, 2 * sIdx + 2, mid + 1, end);
        tree[sIdx] = left + right;
        return tree[sIdx];
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        init(n);
        int sum = buildTree(arr, 0, 0, n - 1);
        System.out.println(sum);
        for(int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
    }
}