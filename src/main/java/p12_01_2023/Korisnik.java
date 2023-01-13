package p12_01_2023;

public class Korisnik {
    private String imeIPrezime;
    private String tipLicence;
    public Korisnik() {
        this.tipLicence = "basic";
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void pretplatiSe(int uplata){
        if (uplata == 100){
            this.tipLicence = "pro";
        }if (uplata == 150){
            this.tipLicence = "premium";
        }
    }
    public void ponistiPretplatu(){
        this.tipLicence = "basics";
    }

    public int maxDuzina(){
        int maximalnaDuzina = 0;
        if (this.tipLicence.equals("basic")){
            maximalnaDuzina = 40;
        }
        if (this.tipLicence.equals("pro")){
            maximalnaDuzina = 240;
        }
        if(this.tipLicence.equals("premium")){
            maximalnaDuzina = 1440;
        }
        else {
            maximalnaDuzina = 0;
        }
        return maximalnaDuzina;
    }

    public void stampaj(){
        System.out.println(this.imeIPrezime);
    }

}
