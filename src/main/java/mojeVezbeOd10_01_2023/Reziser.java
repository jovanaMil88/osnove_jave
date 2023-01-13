package mojeVezbeOd10_01_2023;

public class Reziser {
    private String imeIPrezime;
    private int starost;
    private Film reziraoJe;

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

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void setReziraoJe(Film reziraoJe) {
        this.reziraoJe = reziraoJe;
    }

    public void stamapaj(){
        System.out.println("IME I PREZIME " + this.imeIPrezime);
        System.out.println("STAROST " + this.starost);
        System.out.println("REZIRAO JE " + this.reziraoJe.getNaziv());
        System.out.println("GODINE " + this.reziraoJe.getGodina());


    }
}

