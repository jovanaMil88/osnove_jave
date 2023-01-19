package p17_01_2023;


    public class VisaKartica extends PlatnaKartica {
        private String ovlascenoLice;

        public String getOvlascenoLice() {
            return ovlascenoLice;
        }

        public void setOvlascenoLice(String ovlascenoLice) {
            this.ovlascenoLice = ovlascenoLice;
        }

        public VisaKartica(int stanje, String brojKartice, int godina, int mesec, String ovlascenoLice) {
            super(stanje, brojKartice, godina, mesec);
            this.ovlascenoLice = ovlascenoLice;
        }

        private double racunajProviziju(double iznos) {
//        double provizija = iznos * 0.018;
//        if (provizija < 4) {
//            return  4;
//        }
//        return  provizija;
            double provizija = iznos * 0.018;

//        uslov ? vrednostZaTrue : vrednostZaFalse;
            return provizija < 4 ? 4 : provizija;
        }


        @Override
        public void izvrsiTransakciju(double iznos) {
            this.suma = this.suma - iznos - this.racunajProviziju(iznos);
        }
        @Override
        public  void stampaj() {
            System.out.println("Visa Card");
            System.out.println(this.brojKartice + " " + this.mesec + "/ " + this.godina);
        }
    }

