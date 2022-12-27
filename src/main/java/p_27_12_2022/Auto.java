package p_27_12_2022;

public class Auto {
    public String imeIprezimeVozaca;
    public String marka;
    public int brojVrata;
    public int potrosnja;
    public double trenutnaBrzina;
    public int godinaProizvodnje;
    public int mesecDoKrajaReg;
    public int kubikaza;


    public void podaciOAutu (){
        System.out.println(this.imeIprezimeVozaca);
        System.out.println(this.marka + " - " + this.brojVrata + "-oro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnja + "l na 100km.");
        System.out.println(this.trenutnaBrzina + "km/h je trenutna brzina");
    }
    public boolean jePrekoracio (int ogranicenje){
        if (this.trenutnaBrzina > ogranicenje) {
            return true;
        }
            return false;
        }
    public double kazna(int ogranicenje){
        if (trenutnaBrzina >= ogranicenje) {
            double visinaKazne = (this.trenutnaBrzina - ogranicenje) * 1000;
            return visinaKazne;
        }

        return 0;
    }
    public boolean jeOldtimer(){

        if (this.godinaProizvodnje >= 1959){
            return false;
        }
        else {
            return true;
        }
    }
    public boolean istekla (int trenuniMesec){

        if (trenuniMesec <= mesecDoKrajaReg){
            return false;
        }else {
            return true;
        }
    }
    public double cenaRegistracije (){
        double cena = 0;
        if (kubikaza <= 2000){
            cena = kubikaza * 100;
        }else {
            cena = cena * 1.3;
        }
        return cena;
    }


    }


