package zaVezbanjeSaCasa_i_Slack_10i11_01_2023;

public class Video {
    private String idVideo;
    private String naziv;
    private int duzinaSec;
    private int brLike;
    private int brDislike;
    private int brPregleda;

    public void lajkuj() {
        this.brLike = this.brLike + 1;
    }

    //    metodu dislajkuj - koja povecava broj dislajkova za jedan
    public void dislajkuj() {
        this.brDislike = this.brDislike + 1;
    }

    public void pogledaj() {
        this.brPregleda = this.brPregleda + 1;
    }

    public String getIdVideo() {
        return idVideo;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getDuzinaSec() {
        return duzinaSec;
    }

    public int getBrLike() {
        return brLike;
    }

    public int getBrDislike() {
        return brDislike;
    }

    public int getBrPregleda() {
        return brPregleda;
    }

    public Video(String idVideo, String naziv, int duzinaSec) {
        this.idVideo = idVideo;
        this.naziv = naziv;
        this.duzinaSec = duzinaSec;
    }
}
