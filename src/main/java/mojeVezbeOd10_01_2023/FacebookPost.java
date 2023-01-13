package mojeVezbeOd10_01_2023;

public class FacebookPost {
    private String opis;
    private Korisnik uneoGa;

    public FacebookPost(String opis, Korisnik uneoGa) {
        this.opis = opis;
        this.uneoGa = uneoGa;
    }

    public String getOpis() {
        return opis;
    }

    public Korisnik getUneoGa() {
        return uneoGa;
    }
    public void print(){
        this.uneoGa.print();
        System.out.println(this.opis);
    }
}
