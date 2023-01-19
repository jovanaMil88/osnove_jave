package p17_01_2023;

public abstract class Student {
//    ime i prezime studenta
//    broj indeksa
//    godinu studija
//    gettere, settere i konstruktore

    protected String imeIPrezime;
    protected String brIndexa;
    protected int brStudija;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(String brIndexa) {
        this.brIndexa = brIndexa;
    }

    public int getBrStudija() {
        return brStudija;
    }

    public void setBrStudija(int brStudija) {
        this.brStudija = brStudija;
    }

    public Student(String imeIPrezime, String brIndexa, int brStudija) {
        this.imeIPrezime = imeIPrezime;
        this.brIndexa = brIndexa;
        this.brStudija = brStudija;
    }

    public abstract double vratiSkolarinu();
//    apstraktnu metodu koja vraca cenu skolarine.
//apstraktnu metodu koja vraca da li je student na buzetu ili ne.
    public abstract boolean jeNaBudzetu();
//    metodu koja stampa podatke u formatu:
//    ime i prezime, broj indeksa, godina studija
//    Finansiranje: budzet/samofinansirajuci
//    Cena skolarine: cena
    public void stampaj(){
        System.out.println(this.imeIPrezime + ", " + this.brIndexa + ", " + this.brStudija);
        System.out.print("Fimnansiranje: ");
        if (jeNaBudzetu()){
            System.out.println("budzet");
        }else {
            System.out.println("samofinansirajuci");
        }
    }




}
