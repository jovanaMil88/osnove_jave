package d_17_01_2023;

public class QualityOptimizerContol extends Contol{
//    ima brzinu interneta u megabajtima, npr 10mb/s, 20mb/s, 7.9mb/s
    private double brzinaInterneta;
//    gettere, settere i konstruktore


    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(int brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public QualityOptimizerContol(int brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }
//    implementira metodu izvrsi akciju tako sto postavlja kvalitet videa
//    u zavisnosti od brzine interneta. Kvalitet se racuna na osnovu formule:
//    brzina interneta * 10.1, gde se uzima prvi veci kvalitet
//    npr: ako je brizna interneta 20 * 10.1 = 204 => postavlja 240
//    npr: ako je brzina interneta 5 * 10.1 = 50.5 => postavlja 144
//    npr: ako je brzina interneta 50 * 10.1 = 505 => postavlja 720

    @Override
    public void izvrsiAkciju(VideoPlayer plejer) {
        plejer.kvalitetVidea = this.brzinaInterneta * 10.1;
        if (plejer.kvalitetVidea < 144){
            plejer.kvalitetVidea = 144;
        }if (plejer.kvalitetVidea < 240){
            plejer.kvalitetVidea = 240;
        }if (plejer.kvalitetVidea < 720){
            plejer.kvalitetVidea = 720;
        }if (plejer.kvalitetVidea > 720){
            plejer.kvalitetVidea = 1080;
        }
    }
}
