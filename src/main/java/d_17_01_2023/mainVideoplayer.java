package d_17_01_2023;

public class mainVideoplayer {
    public static void main(String[] args) {
       VideoPlayer plejer = new VideoPlayer();
       plejer.setTrenutnoVreme(3);
       plejer.setJacinaZvuka(75);
       plejer.setDuzinaVidea(12);
       plejer.setKvalitetVidea(53);
       plejer.stampaj();
       TimeControl vreme = new TimeControl(false);
       vreme.izvrsiAkciju(plejer);
       AudioControl audio = new AudioControl(false);
       audio.izvrsiAkciju(plejer);
       QualityOptimizerContol kvalitet = new QualityOptimizerContol(20);
       kvalitet.izvrsiAkciju(plejer);
       plejer.stampaj();
       }
           }


