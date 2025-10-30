package th.ac.kmutt.cpe.algorithm.polwarit.sort;

import java.util.ArrayList;

public class PancakeSort<T extends Comparable<T>> implements SortStrategy<T> {
    @Override
    public void sort(ArrayList<T> list) {
        int n = list.size();

        for (int currSize = n; currSize > 1; currSize--) {
            int max = findMax(list, currSize);
            if (max != currSize - 1) {
                flip(list, max);
                flip(list, currSize - 1);
            }
        }
    }

    private int findMax(ArrayList<T> list, int n) {
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (list.get(i).compareTo(list.get(maxIndex)) > 0) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    
    private void flip(ArrayList<T> list, int index) {
        int start = 0;
        while (start < index) {
            T temp = list.get(start);
            list.set(start, list.get(index));
            list.set(index, temp);
            start++;
            index--;
        }
    }
}
