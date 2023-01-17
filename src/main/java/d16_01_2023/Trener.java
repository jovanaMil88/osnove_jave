package d16_01_2023;

public class Trener extends Osoba{
    /*godine iskustva
    tip trenera (kondicioni, za igru, pomocni, personalni)*/
    private int godineIskustva;
    private String tipTrenera;

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public String getTipTrenera() {
        return tipTrenera;
    }
    public Trener(){}

    public Trener(String imeIPrezime, String jmbg, int godRodjenja, int godineIskustva, String tipTrenera) {
        super(imeIPrezime, godRodjenja, jmbg);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }
    /*metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.*/

    @Override
    public void stampaj() {
        System.out.print("Trener: ");
        super.stampaj();
        System.out.println("Trener je tipa " + this.tipTrenera + " sa " + this.godineIskustva
        + " godina iskustva.");
        System.out.println();
    }
}
