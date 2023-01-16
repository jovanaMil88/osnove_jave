package p_13_1_2022;

public class zadatak1 {
    public static void main(String[] args) {
        Sastojak sir = new Sastojak("Trapist", 500);
        Sastojak testenina = new Sastojak("Spaghetti", 200);
        Pasta carbonara = new Pasta();
        carbonara.dodajSastojke(sir);
        carbonara.dodajSastojke(testenina);
        carbonara.stampaj();
        carbonara.brisiSastojak("Trapist");
        carbonara.stampaj();
    }
}
