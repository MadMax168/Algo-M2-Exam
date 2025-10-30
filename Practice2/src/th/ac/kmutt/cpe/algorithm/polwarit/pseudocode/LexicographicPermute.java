package src.th.ac.kmutt.cpe.algorithm.polwarit.pseudocode;

import java.util.ArrayList;
import java.util.Collections;

public class LexicographicPermute {
    private ArrayList<Integer> list;

    public LexicographicPermute(ArrayList<Integer> list) {
        this.list = list;
    }

    public ArrayList<Integer> getList() {return list;}
    public void setList(ArrayList<Integer> list) {this.list = list;}

    public void permutation() {
        if (list.isEmpty()) {
            return ;
        }        

        int pivot = -1;
        Swap<Integer> swap = new Swap<>();
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i).compareTo(list.get(i + 1)) < 0) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            Collections.reverse(list);
            return;
        }

        int successor = -1;
        for (int i = list.size() - 1; i > pivot; i--) {
            if (list.get(i).compareTo(list.get(pivot)) > 0) {
                successor = i;
                break;
            }
        }

        swap.swap(list, pivot, successor);
        
        reverse(swap, pivot + 1, list.size() - 1);
    }

    private void reverse(Swap<Integer> swap,int start, int end) {
        while (start < end) {
            swap.swap(list, start, end);
            start++;
            end--;
        }
    }
}
