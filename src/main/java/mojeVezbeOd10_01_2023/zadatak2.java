package mojeVezbeOd10_01_2023;

public class zadatak2 {
    public static void main(String[] args) {
        Radnik prvi = new Radnik("25647826");
        prvi.setImeIPrezime("Marko Markovic");
        prvi.setBrojDece(3);
        prvi.setRadniStaz(13);
        prvi.setStepStrucSpreme(6);
        double minuli = prvi.minuliRad();
        System.out.println("Minuli rad: " + minuli);
        double slozenost = prvi.koeficijentSlozenosti();
        System.out.println("Koeficijent slozenosti: " + slozenost);
        double plata = prvi.plata();
        System.out.println("plata: " + prvi.plata());
        if (prvi.jeSposoban()) {
            System.out.println(prvi.getImeIPrezime() + " je kreditno sposoban.");
        } else {
            System.out.println(prvi.getImeIPrezime() + " nije kreditno sposoban.");
        }
        System.out.println();
        Radnik drugi = new Radnik("54654646", "Petar Petrovic",
                2, 7, 10);

        double minuliRad = drugi.minuliRad();
        System.out.println("Minuli rad: " + minuliRad);
        double slozenostDrugi = drugi.koeficijentSlozenosti();
        System.out.println("Koeficijent slozenosti: " + slozenostDrugi);
        double plataDrugi = drugi.plata();
        System.out.println("plata: " + drugi.plata());
        if (drugi.jeSposoban()) {
            System.out.println(drugi.getImeIPrezime() + " je kreditno sposoban.");
        } else {
            System.out.println(drugi.getImeIPrezime() + " nije kreditno sposoban.");
        }
    }
}
