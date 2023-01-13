package p12_01_2023;

public class ViberPoruka {
    private String tekstPoruke;
    private String vreme;
    private ViberKorisnik poslao;
    private ViberKorisnik primio;
    private ViberReakcija reakcija;

    public void setReakcija(ViberReakcija reakcija) {
        this.reakcija = reakcija;
    }

    public String getTekstPoruke() {
        return tekstPoruke;
    }

    public void setTekstPoruke(String tekstPoruke) {
        this.tekstPoruke = tekstPoruke;
    }

    public String getVreme() {
        return vreme;
    }

    public void setVreme(String vreme) {
        this.vreme = vreme;
    }

    public ViberKorisnik getPoslao() {
        return poslao;
    }

    public void setPoslao(ViberKorisnik poslao) {
        this.poslao = poslao;
    }

    public ViberKorisnik getPrimio() {
        return primio;
    }

    public void setPrimio(ViberKorisnik primio) {
        this.primio = primio;
    }

    public ViberPoruka(String tekstPoruke, String vreme, ViberKorisnik poslao, ViberKorisnik primio) {
        this.tekstPoruke = tekstPoruke;
        this.vreme = vreme;
        this.poslao = poslao;
        this.primio = primio;
    }

    public void stampaj(){
        System.out.println("From: " + poslao.imeIPrezime );
        if (poslao.jeAktivan){
            System.out.print("* Active Now");
        }else {
            System.out.print("* Not Active");
        }
        System.out.println(" at " + this.vreme);
        System.out.println("To " + primio.imeIPrezime );
        System.out.print(this.tekstPoruke);
        if (this.reakcija != null){
            System.out.print(":" + this.reakcija.getEmoji());
        }
    }

}
