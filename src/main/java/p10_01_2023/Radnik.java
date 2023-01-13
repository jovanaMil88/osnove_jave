package p10_01_2023;

public class Radnik {
    private String jmbgRadnika;
    private String imeIPrezime;
    private int brojDece;
    private int stepStruSpreme;
    private int radniStaz;

    public Radnik(String jmbgRadnika) {
        this.jmbgRadnika = jmbgRadnika;
    }

    public Radnik(String jmbgRadnika, String imeIPrezime, int brojDece,
                  int stepStruSpreme, int radniStaz) {
        this.jmbgRadnika = jmbgRadnika;
        this.imeIPrezime = imeIPrezime;
        this.brojDece = brojDece;
        this.stepStruSpreme = stepStruSpreme;
        this.radniStaz = radniStaz;
    }

    public String getJmbgRadnika() {
        return jmbgRadnika;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public int getBrojDece() {
        return brojDece;
    }

    public int getStepStruSpreme() {
        return stepStruSpreme;
    }

    public int getRadniStaz() {
        return radniStaz;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void setBrojDece(int brojDece) {
        this.brojDece = brojDece;
    }

    public void setStepStruSpreme(int stepStruSpreme) {
        this.stepStruSpreme = stepStruSpreme;
    }

    public void setRadniStaz(int radniStaz) {
        this.radniStaz = radniStaz;
    }

    public double minuliRad (){
        double minuliRad = 0;
        if (radniStaz < 10){
            minuliRad = 0.05;
        } else if (radniStaz > 10 && radniStaz <= 20) {
            minuliRad = 0.075;
        } else if (radniStaz > 20) {
            minuliRad = 0.1;
            
        }
        return minuliRad;
    }

    public double koeficijentSlozenosti(){
        double koeficijent = this.stepStruSpreme * this.brojDece;
        return koeficijent;
    }

    public double plata(){
        double plata = 25000 + (this.koeficijentSlozenosti() + this.minuliRad()) * 10000;
        return plata;
    }

    public boolean jeSposoban(){
        if (this.plata() > 50000){
            return true;
        }
        return false;
    }






}
