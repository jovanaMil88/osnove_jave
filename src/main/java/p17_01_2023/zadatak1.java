package p17_01_2023;

public class zadatak1 {
    public static void main(String[] args) {
        VisaKartica visa = new VisaKartica(1000, "1234-5678", 2019, 11, "Melanija Krstojevic");

        visa.dodajSredstva(200);
        visa.izvrsiTransakciju(150);
        visa.stampaj();

        MasterKartica master = new MasterKartica(2000, "0098-5678", 2020, 5);
        master.dodajSredstva(100);
        master.izvrsiTransakciju(200);
        master.naplatiOdrzavanje();
        master.stampaj();
    }
    }

