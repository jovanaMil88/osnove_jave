package mojeVezbe16_01_2023;

public class EONPaket extends Paket {
    //    Kreirati klasu EONPaket koja nasledjuje klasu Paket i koja ima:
//    ovaj paket ima 3 meseca po dinar
//    ovaj paket se zove EON LIGHT DUO
//    brzina interneta ovog paketa je 150/75 MB
    private int meseciPoDin;

    public EONPaket(String korisnik, double mesecnaCena, int ugovornaObaveza) {
        super(korisnik, mesecnaCena, ugovornaObaveza);
        this.nazivPaketa = "EON LIGHT DUO";
        this.brzinaZaDownload = 150;
        this.brzinaZaUpload = 75;
        this.meseciPoDin = 3;
    }

    public int getMeseciPoDin() {
        return meseciPoDin;
    }
    //    metodu za stampu koja stampa podatke u formatu:
//    ime i prezime korisnika
//    naziv paketa - brzina download/brzina upload - ugovorna obaveza
//    cena + broj meseci za dinar


    @Override
    public void stampaj() {
        System.out.println("Ime i prezime korisnika: " + this.korisnik);
        System.out.println(this.nazivPaketa + " - " + this.brzinaZaDownload + "/"
                + this.brzinaZaUpload + " - " + this.ugovornaObaveza);
        System.out.println("Cena: " + this.mesecnaCena +
                " + " + this.meseciPoDin + " meseca po 1 din.");


    }
}
