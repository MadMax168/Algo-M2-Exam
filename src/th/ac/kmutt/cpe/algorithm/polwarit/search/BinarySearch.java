package th.ac.kmutt.cpe.algorithm.polwarit.search;

import java.util.ArrayList;

public class BinarySearch<T extends Comparable<T>> implements SearchStrategy<T> {
    @Override
    public int search(ArrayList<T> list, T target) {
        int left = 0, right = list.size() - 1;
        while ( left <= right ) {
            int mid = left + (right - left) /2;
            T midValue = list.get(mid);
            
            int comparison = midValue.compareTo(target);
            
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
