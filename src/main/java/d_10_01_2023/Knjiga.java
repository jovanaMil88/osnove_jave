package d_10_01_2023;

public class Knjiga {
    private String isbn;
    private String naziv;
    private int godina;
    private Autor a;

    public Knjiga(String isbn, String naziv, int godina, Autor a) {
        this.isbn = isbn;
        this.naziv = naziv;
        this.godina = godina;
        this.a = a;
    }
    public void stampaj(){
        System.out.println(this.isbn);
        System.out.println(this.naziv + " - " + this.godina);
        this.a.stampaj();
    }
}
