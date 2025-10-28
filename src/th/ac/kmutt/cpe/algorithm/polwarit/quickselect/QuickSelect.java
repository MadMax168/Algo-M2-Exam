package th.ac.kmutt.cpe.algorithm.polwarit.quickselect;

import java.util.ArrayList;

public class QuickSelect {
    private int arrSize;
    private ArrayList<Integer> list;
    private int k;

    public QuickSelect(int arrSize, ArrayList<Integer> list, int k){
        this.arrSize = arrSize;
        this.list = list;
        this.k = k;
    }

    public int getArrSize() { return arrSize; }
    public ArrayList<Integer> getList() { return list; }
    public int getK() { return k; }

    public void setArrSize( int arrSize ) { this.arrSize = arrSize; }
    public void setList( ArrayList<Integer> list ) { this.list = list; }
    public void setK( int k ) { this.k = k; }

    public int quickSelect() {
        if (list == null || list.isEmpty() || k < 1 || k > list.size()) {
            return -1;
        }
        return quickSelect(list, 0, list.size() - 1, k);
    }

    private int quickSelect(ArrayList<Integer> list, int left, int right, int k) {
        if (left == right) {
            return list.get(left);
        }
        
        int s = lomutoPartition(list, left, right);
        
        if (s == left + k - 1) {
            return list.get(s);
        } 
        else if (s > left + k - 1) {
            return quickSelect(list, left, s - 1, k);
        } 
        else {
            return quickSelect(list, s + 1, right, k - (s - left + 1));
        }
    }

    private int lomutoPartition(ArrayList<Integer> list, int left, int right) {
        int pivot = list.get(left);
        int s = left;
        
        for (int i = left + 1; i <= right; i++) {
            if (list.get(i) < pivot) {
                s = s + 1;
                swap(list, s, i);
            }
        }
        
        swap(list, left, s);
        return s;
    }

    private void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}