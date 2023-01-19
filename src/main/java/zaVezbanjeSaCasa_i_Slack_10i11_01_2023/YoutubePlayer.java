package zaVezbanjeSaCasa_i_Slack_10i11_01_2023;



public class YoutubePlayer {
    private Video pustenJe;
    private int kvalitet;
    private String rezim;
    private int jacinaZvuka;
    private int trenutnoVreme;
    public YoutubePlayer(){
        this.kvalitet = 144;
        this.jacinaZvuka = 75;
        this.rezim = "mini player";
    }
    public Video getPustenJe() {
        return pustenJe;
    }

    public int getKvalitet() {
        return kvalitet;
    }

    public String getRezim() {
        return rezim;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void ucitajVideo(Video pustenJe) {
        this.pustenJe = pustenJe;
        this.trenutnoVreme = 0;
        pustenJe.pogledaj();
    }

    public void pojacaj() {
        this.jacinaZvuka = this.jacinaZvuka + 10;
        if (this.jacinaZvuka > 100) {
            this.jacinaZvuka = 100;
        }
    }

    public void smanji() {
        this.jacinaZvuka = this.jacinaZvuka - 10;
        if (this.jacinaZvuka < 0) {
            this.jacinaZvuka = 0;
        }
    }

    public void postaviKvalitet(int brzinaNeta) {
        if (brzinaNeta < 2) {
            this.kvalitet = 144;
        } else if (brzinaNeta <= 4) {
            this.kvalitet = 240;
        } else if (brzinaNeta <= 6) {
            this.kvalitet = 360;
        } else if (brzinaNeta <= 8) {
            this.kvalitet = 720;
        } else {
            this.kvalitet = 1080;
        }
    }
    public void aktivirajMiniPlayerMod() {
        this.rezim = "mini player";
    }

    public void aktivirajBioskopskiMod() {
        this.rezim = "bioskopski rezim";
    }

    public void aktivirajPrekoCelogEkranaMod() {
        this.rezim = "preko celog ekrana";
    }

    public void premotajUnapred() {
        this.trenutnoVreme = this.trenutnoVreme + 10;
        if (this.trenutnoVreme > getPustenJe().getDuzinaSec()) {
            this.trenutnoVreme = getPustenJe().getDuzinaSec();
        }
    }

    public void premotajUnazad() {
        this.trenutnoVreme = this.trenutnoVreme - 10;
        if (this.trenutnoVreme < 0) {
            this.trenutnoVreme = 0;
        }
    }

    public void iscrtajZvuk() {
        int jacina = this.jacinaZvuka / 10;
        System.out.print("<:");
        for (int i = 0; i < jacina; i++) {
            System.out.print("|");
        }
        if (this.jacinaZvuka == 0) {
            System.out.println("</");
        }
        System.out.println();
    }

    public void iscrtajRezim(){
        if (this.rezim.equals("mini player")){
            System.out.println("[ ]");
        } else if (this.rezim.equals("bioskopski rezim")) {
            System.out.println("[..]");
        } else if (this.rezim.equals("preko celog ekrana")) {
            System.out.println("[||||]");
        }
    }
    public void iscrtajTrenutnoVreme(){
        int minTren = this.trenutnoVreme / 60;
        int secTren = this.trenutnoVreme % 60;
        int minUkup = getPustenJe().getDuzinaSec() / 60;
        int secUkup = getPustenJe().getDuzinaSec() % 60;
//        minut:sekund / minutUkupnogVideo:sekundUkupnogVidea
        System.out.println(minTren + ":" + secTren + " / " + minUkup + ":" + secUkup);
    }
    public void iscrtajTimeline(){
        int procenat = (this.trenutnoVreme * 100) / getPustenJe().getDuzinaSec();
        for (int i = 0; i < procenat; i++) {
            System.out.print("*");
        }
        for (int i = procenat; i < 100; i++) {
            System.out.print(".");
        }
        }
        public void iscitaj(){
        this.iscrtajTrenutnoVreme();
            System.out.print("Zvuk ");
            this.iscrtajZvuk();

            System.out.print("Timeline: ");
            this.iscrtajTimeline();
            System.out.println();
            System.out.println("Kvalitet: " + this.kvalitet + "p");
            System.out.print("Rezim: ");
            this.iscrtajRezim();
            System.out.println(getPustenJe().getNaziv());
            System.out.println("Likes: " + getPustenJe().getBrLike()
                    + " Dislikes: " + getPustenJe().getBrDislike());
            System.out.println(getPustenJe().getBrPregleda() + " Pregleda.");
        }

        public void share(){
            System.out.println("https://youtu.be/" + getPustenJe().getIdVideo());
        }

    }




