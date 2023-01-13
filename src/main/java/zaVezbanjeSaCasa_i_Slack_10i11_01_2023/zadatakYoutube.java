package zaVezbanjeSaCasa_i_Slack_10i11_01_2023;

public class zadatakYoutube {
    public static void main(String[] args) {
        Video senidah = new Video("VMj1viq9KmA", "Senidah - Slađana (Official Video)",
                180);
        YoutubePlayer y = new YoutubePlayer();
        y.ucitajVideo(senidah);
        for (int i = 0; i < 859; i++) {
            senidah.lajkuj();
        }
        for (int i = 0; i < 12; i++) {
            senidah.dislajkuj();
        }
        for (int i = 0; i < 156999999; i++) {
            senidah.pogledaj();
        }

        y.pojacaj();
        y.pojacaj();
        y.smanji();
        y.postaviKvalitet(5);
        y.aktivirajBioskopskiMod();
        y.premotajUnapred();
        y.premotajUnapred();
        y.premotajUnazad();
        y.iscitaj();
        y.share();


    }
}
