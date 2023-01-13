package p10_01_2023;

public class Reziser {
    private String imeIPrezime;
    private int starost;

    private Film reziraoJe;

    public void setReziraoJe(Film reziraoJe) {
        this.reziraoJe = reziraoJe;
    }

    public Reziser(String imeIPrezime, int starost) {
        this.imeIPrezime = imeIPrezime;
        this.starost = starost;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public int getStarost() {
        return starost;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

public void print(){
    System.out.println(imeIPrezime + ", " + starost);
}

public void stampaj(){
    System.out.println("Ime i prezime: " + this.imeIPrezime);
    System.out.println("Starost" + this.starost);
    System.out.println("Rezirao je: " + this.reziraoJe.getNaziv());
    System.out.println("Godine " + this.reziraoJe.getGodina());
}
    {

    }
}
