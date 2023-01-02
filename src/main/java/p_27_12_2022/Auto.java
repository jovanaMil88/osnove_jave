package p_27_12_2022;

public class Auto {
    public String imeIprezimeVozaca;
    public String marka;
    public int brojVrata;
    public int potrosnja;
    public int trenutnaBrzina;
    public int godinaProizvodnje;
    public int mesecDoKrajaReg;
    public int kubikaza;
    public String brojRegistracije;
    public boolean ukljucenaKlima;
    public int maksimalnaBrzina;
    public int kapacitetRezervoara;
    public int trenutnoGoriva;


    public void podaciOAutu() {
        System.out.println(this.imeIprezimeVozaca);
        System.out.println(this.marka + " - " + this.brojVrata + "-oro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnja + "l na 100km.");
        System.out.println(this.trenutnaBrzina + "km/h je trenutna brzina");
    }

    public boolean jePrekoracio(int ogranicenje) {
        if (this.trenutnaBrzina > ogranicenje) {
            return true;
        }
        return false;
    }

    public double kazna(int ogranicenje) {
        if (trenutnaBrzina >= ogranicenje) {
            double visinaKazne = (this.trenutnaBrzina - ogranicenje) * 1000;
            return visinaKazne;
        }

        return 0;
    }

    public boolean jeOldtimer() {

        if (this.godinaProizvodnje >= 1959) {
            return false;
        } else {
            return true;
        }
    }

    public boolean istekla(int trenuniMesec) {

        if (trenuniMesec <= mesecDoKrajaReg) {
            return false;
        } else {
            return true;
        }
    }

    public double cenaRegistracije() {
        double cena = 0;
        if (kubikaza <= 2000) {
            cena = kubikaza * 100;
        } else {
            cena = cena * 1.3;
        }
        return cena;
    }

    public void dodajGas() {
        trenutnaBrzina = trenutnaBrzina + 10;
        if (this.trenutnaBrzina > maksimalnaBrzina) {
            this.trenutnaBrzina = maksimalnaBrzina;
        }
    }

    public void koci() {
        trenutnaBrzina = trenutnaBrzina - 10;
        if (trenutnaBrzina < 0) {
            trenutnaBrzina = 0;
        }
    }

    public double trenutnaPotrosnja() {
        double faktorKlime = 0;
        if (ukljucenaKlima = true) {
            faktorKlime = 1.2;
        } else {
            faktorKlime = 1.0;
        }
        return (trenutnaBrzina / 100.0 * this.potrosnja) * faktorKlime;

    }

    public void stampajTablu() {

        int procenat = (trenutnaBrzina * 100) / maksimalnaBrzina;
        for (int i = 0; i < procenat; i++) {
            System.out.print("|");
        }
        for (int i = procenat; i < 100; i++) {
            System.out.print(".");

        }
        System.out.println(trenutnaBrzina + " / " + maksimalnaBrzina);

    }

    public int natociGorivo(int kolikoGoriva ) {
        int cenaLitra = 210;
        int ukupnaCena = kolikoGoriva * cenaLitra;
        if (trenutnoGoriva < kapacitetRezervoara) {
            kolikoGoriva = kapacitetRezervoara - trenutnoGoriva;
        }
        if (trenutnoGoriva > kapacitetRezervoara) {
            trenutnoGoriva = kapacitetRezervoara;
        }
        return ukupnaCena;


    }}







