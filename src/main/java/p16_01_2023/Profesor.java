package p16_01_2023;

public class Profesor extends Osoba {
//    naziv predmeta koji predaje
//    iznos plate
//    konstuktor sa parametrima
//    metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//    Napisati metodu stampajProfu da stampa sve podatke o profesoru

    private String predmet;
    private double plata;

    public Profesor(String imeIPrezime, String jmbg, String predmet, double plata) {
        super(imeIPrezime, jmbg);
        this.predmet = predmet;
        this.plata = plata;
    }
//    metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//    Napisati metodu stampajProfu da stampa sve podatke o profesoru

public void povecajPlatu(int procenat){
        this.plata = this.plata + ((procenat / 100) + 1);

}
@Override
public void stampaj(){
        super.stampaj();
    System.out.println("PLata: " + this.plata);
    System.out.println("Predmet : " + this.predmet);
}
}
