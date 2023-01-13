package mojeVezbeOd10_01_2023;

public class FilmI {
    private String naziv;
    private int godina;
    private ReziserI reziraoGa;

    public FilmI(String naziv, int godina) {
        this.naziv = naziv;
        this.godina = godina;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public ReziserI getReziraoGa() {
        return reziraoGa;
    }

    public void setReziraoGa(ReziserI reziraoGa) {
        this.reziraoGa = reziraoGa;
    }

    public void print(){
        System.out.println(this.naziv + ", " + this.godina);
        System.out.print("Rezirao ga: ");
        this.reziraoGa.print();
    }
}
