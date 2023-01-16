package p_13_1_2022;

import java.util.ArrayList;

public class Pasta {
    private ArrayList <Sastojak> sastojci;
    public void dodajSastojke(Sastojak sastojci){
        this.sastojci.add(sastojci);
    }
    public Pasta(){
        this.sastojci = new ArrayList<>();
    }

    public void cenaPaste(){
        double cena = 0;
        for (int i = 0; i < sastojci.size(); i++) {
            cena = cena + sastojci.get(i).getCena();
        }
        System.out.println("Cena paste je " + cena + "din.");

    }

    public void stampaj(){
        System.out.println("Pasta je sa sastojcima: ");
        for (int i = 0; i < sastojci.size(); i++) {
            sastojci.get(i).stampaj();
        }
    }
    public void brisiSastojak(String naziv){
        for (int i = 0; i < sastojci.size(); i++) {
            if(naziv.equals(this.sastojci.get(i).getNaziv())){
                sastojci.remove(i);
            }
        }


    }
}

