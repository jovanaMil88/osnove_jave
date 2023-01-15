package d_12_01_2023;


import java.util.ArrayList;

public class ElektricniSporet {
    private String marka;
    private int brGodinaGarancije;
    private int maxBrUkljucenihRingli;
    private ArrayList<Ringla> ringle;

    public ElektricniSporet(String marka, int brGodinaGarancije, int maxBrUkljucenihRingli) {
        this.marka = marka;
        this.brGodinaGarancije = brGodinaGarancije;
        this.maxBrUkljucenihRingli = maxBrUkljucenihRingli;
        this.ringle = new ArrayList<Ringla>();
    }

    public void ringle(Ringla ringle) {
        this.ringle.add(ringle);
    }

    public String getMarka() {
        return marka;
    }

    public int getBrGodinaGarancije() {
        return brGodinaGarancije;
    }

    public int getMaxBrUkljucenihRingli() {
        return maxBrUkljucenihRingli;
    }

    public ArrayList<Ringla> getRingle() {
        return ringle;
    }


    public void pojacaj(int pozicija) {
        int counter = 0;
        for (int i = 0; i < this.ringle.size(); i++) {
            if (pozicija == i + 1) {
                this.ringle.get(i).pojacajRinglu();
            }
            if (this.ringle.get(i).jeUkljucena()) {
                counter++;
            }
        }
        if (counter > this.maxBrUkljucenihRingli) {
            for (int i = 0; i < this.ringle.size(); i++) {
                if (this.ringle.get(i).jeUkljucena()) {
                    this.ringle.get(i).iskljuciRinglu();
                }
                if (i + 1 == pozicija) {
                    this.ringle.get(i).pojacajRinglu();
                }

            }

        }
    }

    public void iskljuciRingluSporeta(int pozicija) {
        for (int i = 0; i < this.ringle.size(); i++) {
            if (pozicija == i + 1) {
                this.ringle.get(i).iskljuciRinglu();
            }

        }
    }


    //    metodu koja racuna i vraca ukupnu potrosnju za ceo elektricni sporet,
//    tako sto sabira potrosnju za sve ringle
//            (kao parametar se unosi vreme koliko vec ringle rade)
    public double ukupnaPotrosnja(double brojSati) {
        double suma = 0;
        for (int i = 0; i < this.ringle.size(); i++) {
                suma = suma + this.ringle.get(i).potrosnja(brojSati);
            }
            return suma;
        }

    //        metodu koja stampa podatke u formatu:
//        marka - garancija u godinama
//        Ringle:
//        Gore levo:
//        Ringla je ukljucena/iskljucena
//        Tip ringle: tip ringle
//        Jacina: jacina
//        Grejac: jacina grejaca kW
    public void stampaj() {
        System.out.println(this.marka + " - " + this.brGodinaGarancije +
                " godina garancije.");
        System.out.println();
        System.out.println("Ringle: ");
        System.out.println();
        for (int i = 0; i < this.ringle.size(); i++) {
            System.out.println(i + 1);
            this.ringle.get(i).stampaj();
        }
    }

    //    naknadna metoda za razlicito vreme rada
    public void stampajUkupnupotrosnju(double brSati) {
        System.out.println("Ukupna potrosnja za " + brSati +
                "h rada je " + this.ukupnaPotrosnja(brSati) + "din.");
    }

}



















