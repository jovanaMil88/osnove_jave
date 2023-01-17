package mojeVezbe16_01_2023;

public class zadatakCard {
    public static void main(String[] args) {
        MasterKartica prviMaster = new MasterKartica(500, "6278-3527-2826-9208",
                2023,12);
        MasterKartica drugiMaster = new MasterKartica(200,"7668-4654-9870-6540",
                2023,4);
        prviMaster.stampaj();
        drugiMaster.stampaj();
        prviMaster.izvrsiTransakciju(10);
        prviMaster.stampaj();

        VisaKartica prvaVisa = new VisaKartica(300, "8927-7722-2777-1010",
                2023,10);
        prvaVisa.setOvlascenoLice("Jovan Jovanovic");
        prvaVisa.stampaj();
        prvaVisa.izvrsiTransakciju(10);
        prvaVisa.stampaj();
    }
}
