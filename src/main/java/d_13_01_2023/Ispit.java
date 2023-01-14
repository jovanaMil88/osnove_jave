package d_13_01_2023;

public class Ispit {
//    naziv predmeta
//    ocenu (u rasponu od 5 do 10)
//    Ime i prezime profesora koji predaje predmet

    private String predmet;
    private int ocena;
    private String profesor;

    public Ispit(String predmet, int ocena, String profesor) {
        this.predmet = predmet;
        this.ocena = ocena;
        this.profesor = profesor;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public boolean jePolozio(){
        return this.ocena >= 6 && this.ocena <= 10;
    }
//    metodu koja stampa ispit u formatu:
//            (naziv predmeta) - (profesor) - (ocena)
    public void stampaj(){
        System.out.println(this.predmet + " - " + this.profesor + " - " + this.ocena);
    }

}
