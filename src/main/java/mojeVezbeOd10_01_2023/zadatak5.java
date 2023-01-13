package mojeVezbeOd10_01_2023;

public class zadatak5 {
    public static void main(String[] args) {
        Korisnik k = new Korisnik("Marko", "Markovic");
        FacebookPost fp = new FacebookPost("Hello!", k);
        fp.print();
    }
}
