package th.ac.kmutt.cpe.algorithm.polwarit.Practice.hashTable;

import java.util.ArrayList;

public class HashTable {
    private ArrayList<String> strs;

    public HashTable(ArrayList<String> strs) {
        this.strs = strs;
    }

    public ArrayList<String> getStr() { return strs; }
    public void setStr( ArrayList<String> strs ) { this.strs = strs; }

    public ArrayList<String> hashTable(int size) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            result.add("NULL");
        }
    
        for (String str : strs) {
            int pos = findPos(str, size);
            int originPos = pos;

            while (result.get(pos) != null && !result.get(pos).equals("NULL")) {
                pos = (pos + 1) % size;

                if (pos == originPos) {
                    return result;
                }
            }

            result.set(pos, str);
        }     

        return result;
    }

    private int findPos(String word, int size) {
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int charValue = c - 'A' + 1;
            sum += charValue;
        }
        return sum % size;
    }
}
