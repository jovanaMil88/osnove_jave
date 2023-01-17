package mojeVezbe16_01_2023;

public class VisaKartica extends PlatnaKartica{

  /*  ovlaceno lice, cuva se ime i prezime osobe koja ima ovlascenje da podize novac u ekspozituri.
    getter i setter za ovlasceno lice*/
    private String ovlascenoLice;

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    public VisaKartica(double suma, String brKartice, int godinaVazenja, int mesecVazenja) {
        super(suma, brKartice, godinaVazenja, mesecVazenja);
    }
    /*implementira metodu izvrsiTransakciju,  tako da na prosledjenu sumu dodaje proviziju
    od 1.8% sume. Najmanja provizija moze biti $4.*/
 private double izracunajProvizuju(double iznos){
     double provizija = iznos * (1.8 / 100);
     if (provizija > 4){
         provizija = 4;
     }
     return provizija;
 }
    @Override
    public void izvrsiTransakciju(double iznos) {
     super.izvrsiTransakciju(iznos);
        this.suma = this.suma - this.izracunajProvizuju(iznos);
 }
    /*implementira metodu koja stampa podatke o kartici u formatu:
    Visa Card: 4012-1239-1221-3381, 11/2019, $212*/

 @Override
 public void stampaj(){
     System.out.print("Visa Card: ");
     super.stampaj();
     System.out.println("Ovlasceno lice: " + this.ovlascenoLice);
     System.out.println();
 }
}
