package d_10_01_2023;

public class ClanskaKarta {
    private int popust;
    private String brKartice;

    public ClanskaKarta(int popust, String brKartice) {
        this.popust = popust;
        this.brKartice = brKartice;
    }

    public int getPopust() {
        return popust;
    }

    public String getBrKartice() {
        return brKartice;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }
}
