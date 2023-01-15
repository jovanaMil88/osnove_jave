package d_12_01_2023;

public class ZeleniKarton {
    private String imeIPrezimeStudenta;
    private String brIndexa;
    private String nazivPredmeta;
    private String ImeIPrezimeProfesora;
    private int ocena;

    public String getImeIPrezimeStudenta() {
        return imeIPrezimeStudenta;
    }

    public String getBrIndexa() {
        return brIndexa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public String getImeIPrezimeProfesora() {
        return ImeIPrezimeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
        ImeIPrezimeProfesora = imeIPrezimeProfesora;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public ZeleniKarton(String nazivPredmeta, String imeIPrezimeProfesora, int ocena) {
        // navela sam za jednog studenta i njegov broj indeksa, npr.skor u ovom ispitnom roku
        this.imeIPrezimeStudenta = "Pavle Pavlovic";
        this.brIndexa = "071409";
        this.nazivPredmeta = nazivPredmeta;
        ImeIPrezimeProfesora = imeIPrezimeProfesora;
        this.ocena = ocena;
    }

    public boolean jePolozen() {
        return this.ocena > 5
                ? true : false;
    }

    //    metodu stampaj koja stampa podatke u formatu:
//            (naziv predmeta) - (ocena)
//    Student: ime i prezime, broj indeksa
//    Profesor: ime i prezime
    public void stampaj() {
        System.out.println(this.nazivPredmeta + " - " + this.ocena);
        System.out.println("Student: " + this.imeIPrezimeStudenta + ", " + this.brIndexa);
        System.out.println("Profesor: " + this.ImeIPrezimeProfesora);
    }

}
