package p12_01_2023;

public class ViberReakcija {
    private String emoji;
    private ViberKorisnik reagovao;

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public ViberKorisnik getReagovao() {
        return reagovao;
    }

    public void setReagovao(ViberKorisnik reagovao) {
        this.reagovao = reagovao;
    }

    public ViberReakcija(ViberKorisnik reagovao) {
        this.reagovao = reagovao;
    }
}
