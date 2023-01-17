package d16_01_2023;

public class Igrac extends Osoba {
    /*broj (broj koji igrac nosi)
    poziciju koju igra (odbrambeni, napadac, … )
    kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)*/

    private int broj;
    private String pozicija;
    private boolean jeKapiten;

    /*default-ni konstuktor
    konstuktor sa parametrima*/

    public Igrac() {
        super();
    }

    public Igrac(String imeIPrezime, String jmbg, int godRodjenja, int broj, String pozicija, boolean jeKapiten) {
        super(imeIPrezime, godRodjenja, jmbg);
        this.broj = broj;
        this.pozicija = pozicija;
        this.jeKapiten = jeKapiten;
    }

    public int getBroj() {
        return broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public boolean getJeKapiten() {
        return jeKapiten;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public void setJeKapiten(boolean jeKapiten) {
        this.jeKapiten = jeKapiten;
    }

    @Override
    public void stampaj() {
        System.out.print("Igrac: ");
        super.stampaj();
        System.out.print("Na broju " + this.broj + " je na poziciji " + this.pozicija);
        if (this.jeKapiten == true) {
            System.out.println(" je kapiten.");
        } else {
            System.out.println(" nije kapiten.");
        }
        System.out.println();
    }

    }


