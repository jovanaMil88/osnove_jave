package d_17_01_2023;

public class VideoPlayer {
    public double duzinaVidea;
    public double trenutnoVreme;
    public int jacinaZvuka;
    public double kvalitetVidea;
//    gettere, settere i konstruktore

    public double getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(double duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public double getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setKvalitetVidea(double kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }

    public double getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(double trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public VideoPlayer(){
    }

    //    metodu stampaj koja stampa podatke u formatu:
//    trenutno vreme videa
//    jacina zvuka
//    kavlitet videa
    public void stampaj(){
        System.out.println("Trenutno vreme: " + this.trenutnoVreme);
        System.out.println("Duzina videa: " + this.duzinaVidea);
        System.out.println("Jacina zvuka: " + this.jacinaZvuka);
        System.out.println("Kvalitet: " + this.kvalitetVidea);
        System.out.println();
    }



}
