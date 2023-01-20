package d_19_01_2023;

public class Alpinista extends Planinar {
    private int poeni;
//    Kreirati klasu Alpinista koja nasleđuje klasu Planinar.
//    Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario
//            (celobrojna vrednost) i poeni se mogu menjati.
//    Alpinista može da savlada sve uspone do 4000 metara,
//    placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50,
//    a informacije o alpinisti se ispisuju u formatu:
//    Alpinista, id: (id) ime: (ime i rezime) Broj poena: (poeni)

    public Alpinista(int id, String imeIPrezime, int poeni) {
        super(id, imeIPrezime);
        this.poeni = poeni;
    }

    public int getPoeni() {
        return poeni;
    }

    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

    @Override
    public void stampaj() {
//        Alpinista, id: (id) ime: (ime i rezime) Broj poena: (poeni)
        System.out.print("Alpinista, ");
        System.out.print("ID: " + this.id + " ime i prezime: " + this.imeIPrezime);
        System.out.println(" Broj poena: " + this.poeni);
        System.out.println("Clanarina: " + this.vratiClanarinu());


    }

    @Override
    public double vratiClanarinu() {
        int suma = 0;
        for (int i = 0; i < poeni; i++) {
            suma = suma + 50;
        }
        return 1500 - suma;
//        placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        if (planina.getVisina() <= 4000) {
            return true;
        }
        return false;
    }

}
