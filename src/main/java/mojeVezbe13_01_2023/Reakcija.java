package mojeVezbe13_01_2023;

public class Reakcija {
    private String tipReakcije;
    private String reagovao;

    public String getTipReakcije() {
        return tipReakcije;
    }

    public void setTipReakcije(String tipReakcije) {
        this.tipReakcije = tipReakcije;
    }

    public String getReagovao() {
        return reagovao;
    }

    public void setReagovao(String reagovao) {
        this.reagovao = reagovao;
    }

    public Reakcija(String tipReakcije, String reagovao) {
        this.tipReakcije = tipReakcije;
        this.reagovao = reagovao;
    }


}
