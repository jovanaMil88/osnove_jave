package mojeVezbe16_01_2023;

public class zadatakEon {
    public static void main(String[] args) {
        EONPaket eonPaket = new EONPaket("Dejan Pavlovic",
                3000, 24);
        eonPaket.stampaj();
        eonPaket.produziUgovor();
        eonPaket.stampaj();
      DUOPaket duoPaket = new DUOPaket("Marko Markovic",
              4500,24, "laptop");
      duoPaket.stampaj();
      duoPaket.povecajBrzinu(20);
      duoPaket.stampaj();
      duoPaket.produziUgovor();
      duoPaket.stampaj();



    }


}
