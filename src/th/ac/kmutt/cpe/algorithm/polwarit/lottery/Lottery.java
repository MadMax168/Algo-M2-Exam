package th.ac.kmutt.cpe.algorithm.polwarit.lottery;

public class Lottery {
    private String lot;
    private String prize;

    public Lottery(String lot, String prize){
        this.lot = lot;
        this.prize = prize;
    }

    public String getLot() { return lot; }
    public String getPrize() { return prize; }
    
    public void setLot(String lot) { this.lot = lot; }
    public void setPrize(String prize) { this.prize = prize; }

    public void horspoolMatching() {
        shiftTable(lot);

        
    }

    private String shiftTable(String p) {
        String table = null;
        char temp;
        for ( int i = 0; i < p.length(); i++) {
            temp = p.charAt(p.length());
        }
        for ( int j = 0; j < p.length() - 1; j++) {

        }
        return table;
    }
}
