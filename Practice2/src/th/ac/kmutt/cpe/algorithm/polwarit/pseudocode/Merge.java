package src.th.ac.kmutt.cpe.algorithm.polwarit.pseudocode;

import java.util.ArrayList;

public class Merge<T extends Comparable<T>> {
    public void merge(ArrayList<T> b, ArrayList<T> c, ArrayList<T> a) {
        int i = 0, j = 0, k = 0;
        while ( i < b.size() && j < c.size()) {
            if ( b.get(i).compareTo(c.get(j)) <= 0 ) {
                a.set(k, b.get(i));
                i = i + 1;
            }else {
                a.set(k, c.get(j));
                j = j + 1;
            }
            k = k + 1;
        }
        if ( i == b.size() ) {
            while (j < c.size()) {
                a.set(k, c.get(j));
                j++;
                k++;
            }
        }else {
            while (i < b.size()) {
                a.set(k, b.get(i));
                i++;
                k++;
            }
        }
    }
}
