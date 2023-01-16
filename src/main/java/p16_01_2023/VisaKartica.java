package p16_01_2023;

public class VisaKartica extends PlatnaKartica {

    public VisaKartica(double suma, String brKartice, String godinaVazenja,
                       String mesecVazenja) {
        super(suma, brKartice, godinaVazenja, mesecVazenja);
    }

//    ovlaceno lice, cuva se ime i prezime osobe koja ima ovlascenje da podize novac u ekspozituri.
//    getter i setter za ovlasceno lice
//    konstruktor sa parametrima

    private String ovlascenoLice;

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    public VisaKartica(double suma, String brKartice, String godinaVazenja,
                       String mesecVazenja, String ovlascenoLice) {
        super(suma, brKartice, godinaVazenja, mesecVazenja);
        this.ovlascenoLice = ovlascenoLice;
    }

    //    implementira metodu izvrsiTransakciju,
//    tako da na prosledjenu sumu dodaje proviziju od 1.8% sume.
//    Najmanja provizija moze biti $4.
    @Override
    public void izvsiTransakciju(double vrednost) {
        double procenat = vrednost + (1.8 / 100 + 1);
        super.izvsiTransakciju(procenat);
    }

    @Override
    public void stampaj() {
        System.out.print("VISA CARD: ");
        super.stampaj();

    }


}

