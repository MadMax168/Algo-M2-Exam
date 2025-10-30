package th.ac.kmutt.cpe.algorithm.polwarit.Practice.nextPermutation;

import java.util.ArrayList;
import java.util.Collections;

public class NextPerm<T extends Comparable<T>> {
    private ArrayList<T> list;

    public NextPerm(ArrayList<T> list){
        this.list = list;
    }

    public ArrayList<T> getList() { return list; }
    public void setList(ArrayList<T> list) { this.list = list; }

    public void nextPermutation() {
        if (list == null || list.size() <= 1) {
            return;
        }

        // Step 1: Find the pivot (first decreasing element from right)
        int pivot = -1;
        for (int i = list.size() - 2; i >= 0; i--) {
            if (list.get(i).compareTo(list.get(i + 1)) < 0) {
                pivot = i;
                break;
            }
        }
        // If no pivot found, array is in descending order (largest permutation)
        if (pivot == -1) {
            Collections.reverse(list);
            return;
        }

        // Step 2: Find the successor (smallest element larger than pivot from right)
        int successor = -1;
        for (int i = list.size() - 1; i > pivot; i--) {
            if (list.get(i).compareTo(list.get(pivot)) > 0) {
                successor = i;
                break;
            }
        }

        // Step 3: Swap pivot and successor
        swap(pivot, successor);

        // Step 4: Reverse the suffix (everything after pivot)
        reverse(pivot + 1, list.size() - 1);
    }

    // Helper method to swap two elements
    private void swap(int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    // Helper method to reverse a portion of the list
    private void reverse(int start, int end) {
        while (start < end) {
            swap(start, end);
            start++;
            end--;
        }
    }
}