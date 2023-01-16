package mojeVezbe13_01_2023;

public class HistoryPage {
    private String nazivStranice;
    private String link;
    private int vremeOtvranjaSati;
    private int vremeOtvaranjaMinuti;
    private String usernameZaStranicu;
    private String passwordZaStranicu;

    public HistoryPage(String nazivStranice, String link, int vremeOtvranjaSati,
                       int vremeOtvaranjaMinuti) {
        this.link = link;
        this.nazivStranice = nazivStranice;
        this.vremeOtvranjaSati = vremeOtvranjaSati;
        this.vremeOtvaranjaMinuti = vremeOtvaranjaMinuti;
    }

    public String getNazivStranice() {
        return nazivStranice;
    }

    public String getLink() {
        return link;
    }

    public int getVremeOtvranjaSati() {
        return vremeOtvranjaSati;
    }

    public int getVremeOtvaranjaMinuti() {
        return vremeOtvaranjaMinuti;
    }

    public String getUsernameZaStranicu() {
        return usernameZaStranicu;
    }

    public String getPasswordZaStranicu() {
        return passwordZaStranicu;
    }

    public void setNazivStranice(String nazivStranice) {
        this.nazivStranice = nazivStranice;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setVremeOtvranjaSati(int vremeOtvranjaSati) {
        this.vremeOtvranjaSati = vremeOtvranjaSati;
    }

    public void setVremeOtvaranjaMinuti(int vremeOtvaranjaMinuti) {
        this.vremeOtvaranjaMinuti = vremeOtvaranjaMinuti;
    }
//    metodu sacuvaj kredencijale za ovu stranicu.
//    Metoda kao parametre  prima username i password i setuje te atribute.
    public void sacuvajKredencijale(String usernameZaStranicu, String passwordZaStranicu){
        this.usernameZaStranicu = usernameZaStranicu;
        this.passwordZaStranicu = passwordZaStranicu;
    }
//    Metoda obrisi kolacice koja setuje username i password na null.

    public void obrisiKolacice(){
    this.usernameZaStranicu = null;
    this.passwordZaStranicu = null;
    }

//    Metoda stampaj koja stampa podatke u formatu:
//            [sat] - [minut] - [ naziv ]…[ link ]
//            [Ako postoje kredencijali stampa se zvezdica pored linka]
    public void stampaj(){
        System.out.print(this.vremeOtvranjaSati + " - " + this.vremeOtvaranjaMinuti + " - " +
                this.nazivStranice + " ... " + this.link);
        if (this.usernameZaStranicu != null && this.passwordZaStranicu != null){
            System.out.print("*");
        }
    }

}

