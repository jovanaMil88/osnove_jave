package p12_01_2023;

public class ViberKorisnik {
    public String imeIPrezime;
    public String brTelefona;
    public boolean jeAktivan;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrTelefona() {
        return brTelefona;
    }

    public void setBrTelefona(String brTelefona) {
        this.brTelefona = brTelefona;
    }

    public boolean isJeAktivan() {
        return jeAktivan;
    }

    public void setJeAktivan(boolean jeAktivan) {
        this.jeAktivan = jeAktivan;
    }

    public ViberKorisnik(String imeIPrezime, String brTelefona, boolean jeAktivan) {
        this.imeIPrezime = imeIPrezime;
        this.brTelefona = brTelefona;
        this.jeAktivan = jeAktivan;
    }

}
