package p12_01_2023;

public class zadatak1 {
    public static void main(String[] args) {
        Korisnik host = new Korisnik();
        host.setImeIPrezime("Marko Markovic");
        Korisnik guest = new Korisnik();
        guest.setImeIPrezime("Jovan Jovanovic");
        ZoomCall poziv = new ZoomCall("44546","2sdwpo",host,guest );
        host.pretplatiSe(150);
        poziv.pokreniPoziv();

    }
}
