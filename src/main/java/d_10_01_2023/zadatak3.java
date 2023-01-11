package d_10_01_2023;

public class zadatak3 {
    public static void main(String[] args) {
        ProizvodI p = new ProizvodI("213454", "Sunoko secer", 115);
        Vaga v = new Vaga();
        v.setMernaJedinica("kg");
        v.setP(p);
        v.sracunajCenu(16);
        v.stampaj(16);
    }
}
