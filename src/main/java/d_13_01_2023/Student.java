package d_13_01_2023;

import java.util.ArrayList;

public class Student {
    //    broj indeksa
//    ime i prezime
//    tip studija (osnovne, master, doktorske)
//    niz ispita
    private String brIndexa;
    private String imeIPrezime;
    private String tipStudija;
    private ArrayList<Ispit> ispiti;

    public Student(String brIndexa, String imeIPrezime, String tipStudija) {
        this.brIndexa = brIndexa;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<>();
    }

    public String getBrIndexa() {
        return brIndexa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public void setBrIndexa(String brIndexa) {
        this.brIndexa = brIndexa;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public void dodajIspit(Ispit ispit) {
        this.ispiti.add(ispit);
    }
//    metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)

    public double vratiProsek() {
        int suma = 0;
        int counter = 0;
        for (int i = 0; i < this.ispiti.size(); i++) {
            if (this.ispiti.get(i).jePolozio()) {
                counter++;
                suma = suma + this.ispiti.get(i).getOcena();
            }
        }
        return suma / counter;
    }

    //    metodu stampaj koja stampa u formatu:
    public void stampaj() {
        System.out.println(this.brIndexa + " - " + this.imeIPrezime + " - " + this.tipStudija);
        System.out.println("Predmeti:");
        for (int i = 0; i < this.ispiti.size(); i++) {
            System.out.println(this.ispiti.get(i).getPredmet()
                    + " - " + this.ispiti.get(i).getProfesor()
                    + " - " + this.ispiti.get(i).getOcena());
        }
        System.out.println("Prosecna ocena: " + this.vratiProsek());
    }

}




