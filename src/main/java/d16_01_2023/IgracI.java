package d16_01_2023;

import java.util.ArrayList;

public class IgracI extends OsobaI {

    private int brojDresa;
    private String pozicija;
    private ArrayList<Karton> kartoni;
    private boolean jeKapiten;

    public IgracI() {
        super();
    }


    public IgracI(String imeIPrezime, String jmbg, int godRodjenja, int brojDresa,
                  String pozicija, boolean jeKapiten) {
        super(imeIPrezime, jmbg, godRodjenja);
        this.brojDresa = brojDresa;
        this.pozicija = pozicija;
        this.jeKapiten = jeKapiten;
        this.kartoni = new ArrayList<>();
    }

    public int getBrojDresa() {
        return brojDresa;
    }

    public void setBrojDresa(int brojDresa) {
        this.brojDresa = brojDresa;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isJeKapiten() {
        return jeKapiten;
    }

    public void setJeKapiten(boolean jeKapiten) {
        this.jeKapiten = jeKapiten;
    }


    /*metodu dodaj karton, gde se dodaje karton u niz*/

    public void dodajKarton(Karton karton) {
        this.kartoni.add(karton);
    }

    /*metodu koja vraca broj zutih kartona*/

    public int vratiZuteKartone() {
        int counter = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if (this.kartoni.get(i).getKarton().equals("zuti")) {
                counter++;
            }
        }
        return counter;
    }
    public int vratiCrveneKartone() {
        int counter = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if (this.kartoni.get(i).getKarton().equals("crveni")) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Broj dresa: " + this.brojDresa);
        System.out.println("Na poziciji: " + this.pozicija);
        if (this.jeKapiten){
            System.out.println("Kapiten.");
        } else{
            System.out.println("Nije kapiten.");
        }

        System.out.println("Igrac ima " + this.vratiZuteKartone() + " zutih kartona." );
        System.out.println("Igrac ima " + this.vratiCrveneKartone() + "crvene kartone");

            /* uvesti opciju ako nema crvene da pise dai ih nema.
            ako nema zute da pise da ih nema.
            nemam vremena!!
             */
        }
    }



