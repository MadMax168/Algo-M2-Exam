package th.ac.kmutt.cpe.algorithm.polwarit.sort;

import java.util.ArrayList;

public class BottomUpMergeSort<T extends Comparable<T>> implements SortStrategy<T> {
    @Override
    public void sort(ArrayList<T> list) {
        int n = list.size();

        if ( n < 2 ) {
            return;
        }

        int i = 1;
        while ( i < n ) {
            int j = 0;
            while ( j < n - i ) {
                if ( n < j + (2 * i) ) {
                    merge(list, j, j + i, n);
                } else {
                    merge(list, j, j + i, j + (2 * i));
                }
                j = j + 2 * i;
            }
            i = i * 2;
        }
    }

    private void merge(ArrayList<T> list, int left, int mid, int right) {
        ArrayList<T> leftArr = new ArrayList<>();
        for (int i = left; i < mid; i++) {
            leftArr.add(list.get(i));
        }

        ArrayList<T> rightArr = new ArrayList<>();
        for (int i = mid; i < right; i++) {
            rightArr.add(list.get(i));
        }

        int i = 0, j = 0, k = left;
        while (i < leftArr.size() && j < rightArr.size()) {
            if (leftArr.get(i).compareTo(rightArr.get(j)) <= 0) {
                list.set(k, leftArr.get(i));
                i = i + 1;
            } else {
                list.set(k, rightArr.get(j));
                j = j + 1;
            }
            k = k + 1;
        }

        if ( i == leftArr.size() ){
            while (j < rightArr.size()) {
                list.set(k, rightArr.get(j));
                j++;
                k++;
            }
        }else {
            while (i < leftArr.size()) {
                list.set(k, leftArr.get(i));
                i++;
                k++;
            }
        }
    }
}
