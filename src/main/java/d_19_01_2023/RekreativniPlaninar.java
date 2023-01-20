package d_19_01_2023;

public class RekreativniPlaninar extends Planinar {
//    težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg)
//    naziv okruga odakle je rekreativni planinar.
//    maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)

    private int tezinaOpreme;
    private String okrug;
    private double maxUsponBezOpreme;

    public RekreativniPlaninar(int id, String imeIPrezime, int tezinaOpreme,
                               String okrug, double maxUsponBezOpreme) {
        super(id, imeIPrezime);
        this.tezinaOpreme = tezinaOpreme;
        this.okrug = okrug;
        this.maxUsponBezOpreme = maxUsponBezOpreme;
    }

    public double getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getOkrug() {
        return okrug;
    }

    public double getMaxUsponBezOpreme() {
        return maxUsponBezOpreme;
    }

    @Override
    public void stampaj() {
//        metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
//        Rekreativac, id: (id) ime: (imei prezime) Okrug: (okrug)
        System.out.println("Rekreativac: ID: " + this.id + " ime i prezime: " + this.imeIPrezime
        + " Okrug: " + this.okrug);
        System.out.println("Tezina opreme: " + this.tezinaOpreme);
        System.out.println("Clanarina: " + this.vratiClanarinu());

    }

    @Override
    public double vratiClanarinu() {
        return 1000;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
//        da li će rekreativni planinar uspešno popeti na planinu
//        zavisi da li je njegov najveći uspon manji od visine planine,
//                s tim da oprema dodatno otežava penjanje
//        i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
        for (int i = 0; i < tezinaOpreme; i++) {
            this.maxUsponBezOpreme = this.maxUsponBezOpreme - 50;
        }
            if (this.maxUsponBezOpreme >= planina.getVisina()) {
                return true;
            }return false;
        }

    }
