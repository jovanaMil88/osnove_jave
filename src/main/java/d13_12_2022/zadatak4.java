package d13_12_2022;

public class zadatak4 {
    public static void main(String[] args) {
//  Napisati program koji racuna i ispisuje povrsinu i obim trougla.
//  KOREN BROJA 3 neka bude konstanta 1.73.
//  Za stranicu trougla postavite proizvoljnu vrednost.
//      Primer izvrsenja programa:
//        a: 10
//        Povrsina je 43.25
//        Obim je 30

        int a = 17;
        double površ = ((a * a) * 1.73) / 4;
        int obim = a + a + a;
        System.out.println("a: " + a);
        System.out.println("Površina je " + površ);
        System.out.println("Obim je " + obim);


    }
}
