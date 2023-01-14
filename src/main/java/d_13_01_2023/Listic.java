package d_13_01_2023;

import java.util.ArrayList;

public class Listic {
    private ArrayList<Kombinacija> kombinacije;
public Listic(){
    this.kombinacije = new ArrayList<>();
}
    //    metodu dodaj kombinaciju, koja dodaje kombinaciju u niz
    public void dodajKombinaciju(Kombinacija k) {
        this.kombinacije.add(k);
    }
//    metodu koja vraca da li je kombinacija dobitna.
//    Kao parametar se prosledjuje kombinacija za proveru.
//    Metoda prolazi kroz sve elemente niza i proverava da li
//    u nizu postoji prosledjena kombinacija.
//    Za proveru jednakosti kombinacja koristi se metoda daLiJeIstaKombinacija

    public boolean jeDobitna(Kombinacija dobitnaKombinacija) {
        for (int i = 0; i < this.kombinacije.size(); i++) {
            if (this.kombinacije.get(i).daLiJeIstaKombinacija(dobitnaKombinacija)) {
                return true;
            }
        }
        return false;
    }
//    metodu koja stampa listic u formatu
//    ID: id kombinacije
//    brojevi: 1, 3, 5, 14, 15, 21, 23
//
//    ID: id kombinacije
//    brojevi: 1, 3, 5, 14, 15, 21, 23

    public void print() {
        for (int i = 0; i < this.kombinacije.size(); i++) {
            this.kombinacije.get(i).stampaj();
            System.out.println();

        }
    }
}


