package th.ac.kmutt.cpe.algorithm.polwarit.Practice.lottery;

public class Lottery {
    private String lot;
    private String prize;
    private static final int ALPHABET_SIZE = 256;

    public Lottery(String lot, String prize){
        this.lot = lot;
        this.prize = prize;
    }

    public String getLot() { return lot; }
    public String getPrize() { return prize; }
    
    public void setLot(String lot) { this.lot = lot; }
    public void setPrize(String prize) { this.prize = prize; }
        
    public String horspoolMatching() {
        int m = prize.length();
        int n = lot.length();
        
        if (m > n || m == 0) {
            return "NO 0 -1";
        }
        
        int[] Table = shiftTable(lot);
        
        int i = m - 1;
        
        int shiftCount = 0;
        
        while (i <= n - 1) {
            shiftCount++;
            int k = 0;
            
            while (k <= m - 1 && prize.charAt(m - 1 - k) == lot.charAt(i - k)) {
                k = k + 1;
            }
            
            if (k == m) {
                int position = i - m + 1;
                return "YES " + (shiftCount - 1) + " " + position;
            } else {
                i = i + Table[lot.charAt(i)];
            }
        }
        
        return "NO " + (shiftCount - 1) + " -1";
    }

    private int[] shiftTable(String p) {
        int[] table = new int[ALPHABET_SIZE];

        for ( int i = 0; i < ALPHABET_SIZE; i++ ) {
            table[i] = p.length();
        }

        for ( int j = 0; j <= p.length() - 2; j++ ) {
            table[p.charAt(j)] = p.length() - 1 - j;
        }

        return table;
    }
}
