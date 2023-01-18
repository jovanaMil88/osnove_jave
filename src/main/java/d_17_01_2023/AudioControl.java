package d_17_01_2023;

public class AudioControl extends Contol {

    private boolean pojacavaSe;
    // pojacava se - true, ne pojacava se - false;

    public boolean isPojacavaSe() {
        return pojacavaSe;
    }

    public void setPojacavaSe(boolean pojacavaSe) {
        this.pojacavaSe = pojacavaSe;
    }

    public AudioControl(boolean pojacavaSe) {
        this.pojacavaSe = pojacavaSe;
    }
//    implementira metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1.
//    U opsegu od 0 do 100

    @Override
    public void izvrsiAkciju(VideoPlayer plejer) {
        if (this.pojacavaSe) {
            plejer.jacinaZvuka = plejer.jacinaZvuka + 1;
        }
        else {
            plejer.jacinaZvuka = plejer.jacinaZvuka - 1;
        }
        if(plejer.jacinaZvuka > 100){
            plejer.jacinaZvuka = 100;
        }
    }
}
