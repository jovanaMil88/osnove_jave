package mojeVezbeOd10_01_2023;

//Kreirati klasu Radnik koja ima:
//        jmbg radnika
//        ime i prezime
//        broj dece (1,2,3,... ili 0 ako nema dece)
//        stepen strucne spreme (od 1 do 8)
//        godine radnog staza
//        konstuktor koji postavlja samo jmbg
//        konstuktor koji postavlja sve atribute
//        getere i setere
//        metodu koja racuna i vraca minuli rad(Ima ispod kako se racuna)
//        metodu koja vraca koeficijent slozenosti:
//        Racuna se tako sto se pomnozi stepen strucne spreme i broj dece.
//        metodu koja racuna platu radnika, plata se racuna po formuli:
//        25000 + (koeficijent slozenosti + minuli rad) * 10000
//        metodu koja vraca da li je zaposleni kreditno sposoban. (Kreditno je sposoban ako je plata veca od 50 000)

//        Minuli rad - zarada zaposlenog uvećava se za svaku započetu godinu radnog staža:
//        - do 10 godina 0.05
//        - od 10-20 godina 0.075
//        - preko 20 godina 0.1

public class Radnik {
    private String jmbg;
    private String imeIPrezime;
    private int brojDece;
    private int stepStrucSpreme;
    private int radniStaz;

    public Radnik(String jmbg) {
        this.jmbg = jmbg;
    }

    public Radnik(String jmbg, String imeIPrezime,
                  int brojDece, int stepStrucSpreme, int radniStaz) {
        this.jmbg = jmbg;
        this.imeIPrezime = imeIPrezime;
        this.brojDece = brojDece;
        this.stepStrucSpreme = stepStrucSpreme;
        this.radniStaz = radniStaz;
    }


    public String getJmbg() {
        return jmbg;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public int getBrojDece() {
        return brojDece;
    }

    public int getStepStrucSpreme() {
        return stepStrucSpreme;
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

    public void setStepStrucSpreme(int stepStrucSpreme) {
        this.stepStrucSpreme = stepStrucSpreme;
    }

    public void setRadniStaz(int radniStaz) {
        this.radniStaz = radniStaz;
    }

    public double minuliRad() {
        double minuliRad = 0;
        if (this.radniStaz < 10) {
            minuliRad = 0.05;
        } else if (this.radniStaz > 10 && this.radniStaz <= 20) {
            minuliRad = 0.075;
        } else if (this.radniStaz > 20) {
            minuliRad = 0.01;
        }
        return minuliRad;
    }

    public double koeficijentSlozenosti() {
        double koeficijentSlozenosti = this.stepStrucSpreme * this.brojDece;
        return koeficijentSlozenosti;
    }

    public double plata() {
        double plata = 25000 + (this.koeficijentSlozenosti()
                + this.minuliRad() * 10000);
        return plata;
    }
    public boolean jeSposoban(){
        if (this.plata() > 50000){
            return true;
        }
        return false;
    }


}



