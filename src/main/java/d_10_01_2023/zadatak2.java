package d_10_01_2023;

public class zadatak2 {
    public static void main(String[] args) {
        ClanskaKarta ck = new ClanskaKarta(25, "2525");
        Kupac k = new Kupac("Mirko Mirkovic", ck);
        Proizvod p = new Proizvod("Orman", k, 68000);

        p.stampaj();
        k.stampaj();


    }
}
