package p10_01_2023;

public class zadatak7 {
    public static void main(String[] args) {
Film f = new Film("Inception", 2009);
Reziser r = new Reziser("Pera Peric", 29);
r.setReziraoJe(f);
        r.stampaj();
    }
}
