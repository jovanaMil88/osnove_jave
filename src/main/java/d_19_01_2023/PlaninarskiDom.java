package d_19_01_2023;

import java.util.ArrayList;

public class PlaninarskiDom {
//    naziv doma
//    godinu kada je osnovan.
//    članove doma koji su planinari (klasa vodi računa o nizu)
        private String nazivDoma;
        private String godOsnivanja;
        private ArrayList<Planinar> planinari;
//    default-ni konstuktor i konstuktor koji postavlja sve parametre
//    gettere i settere koji su potrebni

    public PlaninarskiDom() {
        this.planinari = new ArrayList<>();
    }

    public PlaninarskiDom(String nazivDoma, String godOsnivanja) {
        this.nazivDoma = nazivDoma;
        this.godOsnivanja = godOsnivanja;
        this.planinari = new ArrayList<>();
    }

    public String getNazivDoma() {
        return nazivDoma;
    }

    public String getGodOsnivanja() {
        return godOsnivanja;
    }

    public ArrayList<Planinar> getPlaninari() {
        return planinari;
    }

    public void setNazivDoma(String nazivDoma) {
        this.nazivDoma = nazivDoma;
    }

    public void setGodOsnivanja(String godOsnivanja) {
        this.godOsnivanja = godOsnivanja;
    }
    //    metodu učlani planinara, koja dodaje planinara u niz
    public void uclaniPlaninara(Planinar planinar){
        this.planinari.add(planinar);
    }
//    metodu koja vraća broj planinara koji će se uspešno popeti na planinu
//            (metoda za parametar prima Planinu za koju se proverava informacija)
    public int brUspesnih(Planina planina){
        int count = 0;
        for (int i = 0; i < this.planinari.size(); i++) {
            if (this.planinari.get(i).uspesanUspon(planina)){
                count ++;
            }
        }
        return count;
    }
//    metodu koja izbacuje planinara iz planinarskog doma prema identifikacionom broju
    public void izbaciPlaninara(int id){
        for (int i = 0; i < this.planinari.size(); i++) {
            if (this.planinari.get(i).getId() == id){
                this.planinari.remove(i);
            }
        }
    }
//    metodu koja štampa podatke o domu i o svim članovima doma
    public void stampaj(){
        for (int i = 0; i < this.planinari.size(); i++) {
            this.planinari.get(i).stampaj();
        }

    }
//    metodu koja racuna i vraca mesecni prihod od clanarina svih planinara
    public double prihod() {
        double prihod = 0;
        for (int i = 0; i < this.planinari.size(); i++) {
            prihod = prihod + this.planinari.get(i).vratiClanarinu();
        }
        return prihod;
    }



}
