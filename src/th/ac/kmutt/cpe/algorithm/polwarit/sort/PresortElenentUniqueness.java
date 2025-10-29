package th.ac.kmutt.cpe.algorithm.polwarit.sort;

import java.util.ArrayList;

public class PresortElenentUniqueness<T extends Comparable<T>> implements SortStrategy<T> {
    @Override
    public void sort(ArrayList<T> list) {
        list.sort(null); //Must create own sorting

        ArrayList<T> result = new ArrayList<>();
        result.add(list.get(0));

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(list.get(i-1)) != 0) {
                result.add(list.get(i));   
            }
        }

        list.clear();
        list.addAll(result);
    }
}