package th.ac.kmutt.cpe.algorithm.polwarit.Practice.android;

import java.util.ArrayList;
import java.util.Arrays;

public class Android {
    private int nPattern;
    private int mPass;

    public Android(int nPattern, int mPass) {
        this.nPattern = nPattern;
        this.mPass = mPass;
    } 

    public int getN() { return nPattern; }
    public int getM() { return mPass; }
    
    public void setN( int nPattern ) { this.nPattern = nPattern; }
    public void setM( int mPass ) { this.mPass = mPass; }
    
    public long generatePerm(String password) {
        if (password != null) {
            char[] sorted = password.toCharArray();
            Arrays.sort(sorted);

            char[] target = password.toCharArray();

            long position = 0;
            long factorial = 1;

            for (int i = 1; i < nPattern; i++) {
            factorial *= i;
            }
            
            ArrayList<Character> available = new ArrayList<>();
            for (char c : sorted) {
                available.add(c);
            }

            for (int i = 0; i < nPattern; i++) {
                char currentChar = target[i];
                
                // Find how many available characters come before this one
                int index = available.indexOf(currentChar);
                
                if (index == -1) {
                    return -1; // Invalid character
                }
                
                // Add to position: index * (remaining positions)!
                position += index * factorial;
                
                // Remove this character from available list
                available.remove(index);
                
                // Update factorial for next position
                if (i < nPattern - 1) {
                    factorial /= (nPattern - i - 1);
                }
            }
            
            return position + 1;
        }
        return -1;
    }
}