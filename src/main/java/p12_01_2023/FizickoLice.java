package p12_01_2023;

public class FizickoLice {
    private String imeIPrezime;
    private String brLK;
    private String jmbg;
    private boolean jeKupovao;

    public FizickoLice(String imeIPrezime, String brLK, String jmbg, boolean jeKupovao) {
        this.imeIPrezime = imeIPrezime;
        this.brLK = brLK;
        this.jmbg = jmbg;
        this.jeKupovao = jeKupovao;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public String getBrLK() {
        return brLK;
    }

    public String getJmbg() {
        return jmbg;
    }

    public boolean isJeKupovao() {
        return jeKupovao;
    }


    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void setBrLK(String brLK) {
        this.brLK = brLK;
    }

    public void setJeKupovao(boolean jeKupovao) {
        this.jeKupovao = jeKupovao;
    }
    public void stampaj(){
        System.out.print(this.imeIPrezime + " " + this.brLK);
    }
}
