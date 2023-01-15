package d_12_01_2023;

public class zadatakSporet {
    public static void main(String[] args) {

        ElektricniSporet bosch = new ElektricniSporet("Bosch",
                5, 3);
//        gore levo
//        gore desno
//        dole levo
//        dole desno
        Ringla goreLevo = new Ringla("obicna", 2);
        Ringla goreDesno = new Ringla("obicna", 3);
        Ringla doleLevo = new Ringla("ekspres", 9);
        Ringla doleDesno = new Ringla("ekspres", 12);
        bosch.ringle(goreLevo);
        bosch.ringle(goreDesno);
        bosch.ringle(doleLevo);
        bosch.ringle(doleDesno);
        bosch.pojacaj(3);
        bosch.pojacaj(3);
        bosch.pojacaj(2);
        bosch.pojacaj(1);
        bosch.iskljuciRingluSporeta(1);
        bosch.stampaj();
        bosch.stampajUkupnupotrosnju(2);
    }


}
