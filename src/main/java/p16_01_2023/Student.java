package p16_01_2023;

public class Student extends Osoba {
//    broj indeksa
//    dug za skolarinu
//    konstuktor sa parametrima
//    metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost.
//    Metoda prima iznos uplate kao parametar metode.
//    Napisati metod stampajStudenta da stampa sve podatke o studentu
    public Student(String imeIPrezime, String jmbg) {
        super(imeIPrezime, jmbg);
    }
    private String brIndexa;
    private double dug;

    public Student(String imeIPrezime, String jmbg, String brIndexa, double dug) {
        super(imeIPrezime, jmbg);
        this.brIndexa = brIndexa;
        this.dug = dug;
    }

    public void uplatiSkolarinu(double uplata){
        this.dug = this.dug - uplata;
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Nr indexa: " + this.brIndexa);
        System.out.println("Dug: " + this.dug);
    }


}
