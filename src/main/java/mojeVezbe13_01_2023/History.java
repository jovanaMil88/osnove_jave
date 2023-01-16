package mojeVezbe13_01_2023;

import java.util.ArrayList;

public class History {
    private ArrayList<HistoryPage> stranice;

    public History() {
        this.stranice = new ArrayList<>();
    }

    public ArrayList<HistoryPage> getStranice() {
        return stranice;
    }

    //    metoda otvori stranicu koja dodaje novi historypage u niz.
    public void otvoriStranicu(HistoryPage stranica) {
        this.stranice.add(stranica);
    }
//    metodu obrisi prema linku - metoda koja iz niza izbacuje stranicu prema linku

    public void obrisiPremaLinku(String link) {
        for (int i = 0; i < this.stranice.size(); i++) {
            if (link.equals(this.stranice.get(i).getLink())) {
                this.stranice.remove(i);
            }
        }
    }

    //    metoda obrisi kolacice za link - metoda koja za homepage brise kolacice
    public void obrisiKolaciceZaLink(String link) {
        for (int i = 0; i < this.stranice.size(); i++) {
            if (link.equals(this.stranice.get(i).getLink())) {
                this.stranice.get(i).obrisiKolacice();
            }
        }
    }

    //    metoda obrisi istoriju - metoda brise celu istoriju
    public void obrisiIstoriju() {
        for (int i = this.stranice.size() - 1; i >= 0; i--) {
            this.stranice.remove(i);
        }
        System.out.println("Istorija je obrisana.");
    }

    //    metoda sacuvajKredencija - od parametara se prima naziv stranice i username i password
//    koji se cuvaju.
    public void sacuvajKredencijale(String nazivStranice, String username, String password) {
        for (int i = 0; i < this.stranice.size(); i++) {
            if (nazivStranice.equals(this.stranice.get(i).getNazivStranice())) {
                {
                    this.stranice.get(i).sacuvajKredencijale(username, password);
                }
            }
        }
    }

    //    metoda pogledajIstoriju - stampa sve posecene stranice
    public void pogledajIstoriju() {
        for (int i = 0; i < this.stranice.size(); i++) {
            this.stranice.get(i).stampaj();
            System.out.println();
        }
        if (this.stranice.size() == 0) {
            System.out.println("Istorija je prazna.");
        }
        System.out.println();
    }


//    metoda obrisiSveKolacice - metoda brise kredencijale za sve stranice.

    public void obrisiSveKolacice() {
        for (int i = 0; i < this.stranice.size(); i++) {
            this.stranice.get(i).obrisiKolacice();
        }
    }
//    metoda obrisiSveKolaciceZaSadnjihSatVremena-
//    brise kolacice za strnaice koje su ucitane u zadnjih sat vremena.
//    Metoda kao parametar prima trenutno vreme (sat i minut)

    public void obrisiSveKolaciceZaSadnjihSatVremena(int trenutniSati, int trenutniMinuti) {
        int trenutnoVremeMinuti = (trenutniSati * 60) + trenutniMinuti;
        for (int i = 0; i < this.stranice.size(); i++) {
            int vremeUcitavanjaMinuti = (this.stranice.get(i).getVremeOtvranjaSati() * 60)
                    + this.stranice.get(i).getVremeOtvaranjaMinuti();
            if (vremeUcitavanjaMinuti > trenutnoVremeMinuti - 60 &&
                    vremeUcitavanjaMinuti < trenutnoVremeMinuti) {
                this.stranice.get(i).obrisiKolacice();
            }
        }


    }


}








