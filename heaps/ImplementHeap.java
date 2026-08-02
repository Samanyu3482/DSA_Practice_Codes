import java.util.*;
public class ImplementHeap {
    static class Heap {
        private ArrayList<Integer> arr = new ArrayList<>();

        public void add(int val) {
            arr.add(val);
            int childIdx = arr.size() - 1;
            
            while(childIdx > 0) {
                int parentIdx = (childIdx - 1) / 2;

                if(arr.get(childIdx) < arr.get(parentIdx)) {
                    int temp = arr.get(childIdx);
                    arr.set(childIdx, arr.get(parentIdx));
                    arr.set(parentIdx, temp);
                    childIdx = parentIdx;
                }else{
                    break;
                }
                
            }
        }

        public int peek() {
            if(arr.size() == 0) {
                throw new NoSuchElementException("Heap is Empty");
                
            }
            return arr.get(0);
        }

        private void heapify(int rootIdx) {
            int left = 2 * rootIdx + 1;
            int right = 2 * rootIdx + 2;
            int minIdx = rootIdx;
            if(left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }
            if(right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if(minIdx != rootIdx) {
                int temp = arr.get(rootIdx);
                arr.set(rootIdx, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }

        }

        public int remove() {
            int data = arr.get(0);

            // step 1 
            int temp = arr.get(arr.size() - 1);
            arr.set(0, temp);
            arr.set(arr.size() - 1, data);

            // step 2
            arr.remove(arr.size() - 1);

            //step 3
            heapify(0);

            return data;
        }
        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap hp = new Heap();

        hp.add(2);
        hp.add(5);

        hp.add(1);

        System.out.println(hp.peek());
    }
}