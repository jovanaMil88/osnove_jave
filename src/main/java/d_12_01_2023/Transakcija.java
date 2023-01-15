package d_12_01_2023;

public class Transakcija {
    private String id;
    private Racun posiljalac;
    private Racun primalac;

    public String getId() {
        return id;
    }

    public Racun getPosiljalac() {
        return posiljalac;
    }

    public Racun getPrimalac() {
        return primalac;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPosiljalac(Racun posiljalac) {
        this.posiljalac = posiljalac;
    }

    public void setPrimalac(Racun primalac) {
        this.primalac = primalac;
    }

    public Transakcija(String id, Racun posiljalac, Racun primalac) {
        this.id = id;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
    }

//    privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije
    private double vratiProviziju (double visinaTransakcije){
        if (visinaTransakcije < 4500){
            return 45;
        } else if (visinaTransakcije > 4500) {
//            ako je prenos sredstava veci od 4500, provizija je 1%
            return visinaTransakcije * 1 / 100;
        } return 0;
    }
    public void izvrsiTransakciju(double visinaTransakcije){
        if (this.posiljalac.getTrenutnoStanje() >= visinaTransakcije) {
            this.posiljalac.promeniStanje(this.posiljalac.getTrenutnoStanje()
                    - visinaTransakcije - vratiProviziju(visinaTransakcije));
            this.primalac.promeniStanje(this.primalac.getTrenutnoStanje() + visinaTransakcije);
        }else {
            System.out.println("Nemate dovoljno sredstava na racunu. ");
        }
    }

//    metodu koja stampa podatke o transakciji u formatu:
//id transkacije
//Racun sa: Ime i prezime  -  broj racuna
//Racun na: Ime i prezime  -  broj racuna
public void stampaj(){
    System.out.println(this.id);
    System.out.println("Racun sa: " + this.posiljalac.getImeIprezime()
            + " - " + this.posiljalac.getBrRacuna());
    System.out.println("Novo stanje: " + this.posiljalac.getTrenutnoStanje() + "rsd.");
    System.out.println("Racun na: " + this.primalac.getImeIprezime()
            + " - " + this.primalac.getBrRacuna());
    System.out.println("Novo stanje: " + this.primalac.getTrenutnoStanje() + "rsd.");
}

}

