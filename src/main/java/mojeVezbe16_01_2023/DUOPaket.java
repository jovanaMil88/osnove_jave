package mojeVezbe16_01_2023;

public class DUOPaket extends Paket{
//    Kreirati klasu DUOPaket koaj nasledjuje klasu Paket i koja ima:
//    ovaj paket ima 6 meseci po dinar
//    naziv paketa je EON FULL DUO
//    uredjaj koji dodatno ide uz ovaj paket (moze biti fiksni/mobilni/tablet/laptop)
//    brzina interneta ovog paketa je 250/100 MB
private int meseciPoDin;
private String uredjaj;
    public DUOPaket(String korisnik, double mesecnaCena,
                    int ugovornaObaveza, String uredjaj) {
        super(korisnik, mesecnaCena, ugovornaObaveza);
        this.meseciPoDin = 6;
        this.nazivPaketa = "EON FULL DUO";
        this.brzinaZaDownload = 250;
        this.brzinaZaUpload = 100;
        this.uredjaj = uredjaj;
    }
//    metodu za povecanje brzine interneta, kao parametar se unosi koliko je to uvecanje
    public void povecajBrzinu(int povecanje){
        this.brzinaZaUpload = this.brzinaZaUpload + povecanje;
        this.brzinaZaDownload = this.brzinaZaDownload + povecanje;
    }

    @Override
    public void stampaj() {
        System.out.println("Ime i prezime korisnika: " + this.korisnik);
        System.out.println(this.nazivPaketa + " - " + this.brzinaZaDownload + "/"
                + this.brzinaZaUpload + " - " + this.ugovornaObaveza);
        System.out.println("Cena: " + this.mesecnaCena + " + " + this.meseciPoDin
                + " meseca po 1 din.");
        System.out.println("Uređaj: " + this.uredjaj);
    }
}
