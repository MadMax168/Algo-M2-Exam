package th.ac.kmutt.cpe.algorithm.polwarit.sort;

import java.util.ArrayList;

public class PresortElenentUniqueness<T extends Comparable<T>> implements SortStrategy<T> {
    @Override
    public void sort(ArrayList<T> list) {
        list.sort(null);

        ArrayList<T> result = new ArrayList<>();
        boolean unique;

        for (int i = 0; i <= list.size() - 1; i++) {
            if (list.get(i).compareTo(list.get(i+1)) == 0) {
                unique = false;
            }
        }
        

        list.clear();
        list.addAll(result);
    }
}