package d_12_01_2023;

public class Ringla {
    private String tipRingle;
    private int jacinaRingle;
    private double jacinaGrejaca;

//    konstruktor sa parametrima,
//    postavljaju ce tip ringle i jacina grejaca (jacina atribut je po defaultu 0)


    public Ringla(String tipRingle, double jacinaGrejaca) {
        this.tipRingle = tipRingle;
        this.jacinaGrejaca = jacinaGrejaca;
        this.jacinaRingle = 0;
    }

    public String getTipRingle() {
        return tipRingle;
    }

    public int getJacinaRingle() {
        return jacinaRingle;
    }

    public double getJacinaGrejaca() {
        return jacinaGrejaca;
    }
//    privatnu metodu koja vraca maksimalan broj pojacavanja
//    za obicnu je 3, za ekspres je 12
    private int maxBrPojacavanja(){
        if (this.tipRingle.equals("obicna")){
            return 3;
        } else if (this.tipRingle.equals("ekspres")) {
            return 12;
        }
        return 0;
        }
//    metodu pojacaj ringlu - metoda povecava jacinu za 1 (pazite na opseg)
    public void pojacajRinglu(){
        this.jacinaRingle ++;
        if (maxBrPojacavanja() == 3){
            if (this.jacinaRingle > 3){
                this.jacinaRingle = 0;
            }
        } else if (maxBrPojacavanja() == 12){
            if (this.jacinaRingle > 12) {
                this.jacinaRingle = 0;
            }
        }
    }
//    metodu iskljuci ringlu - metoda postavlja jacinu na 0
    public void iskljuciRinglu(){
        this.jacinaRingle = 0;
    }
//    metodu koja vraca informaciju da li je ringla ukljucena ili iskljucena
    public boolean jeUkljucena(){
        return this.jacinaRingle > 0;
    }
//   metodu koja vraca potrosnju elektricne energije prema formuli
//100 / maksimalan broj pojacavanja * jacina * jacina grejaca *
// vremenski period koliko vec ringla radi
//    metoda prima broj sati kao parametar tj. vremenski period koliko ringla vec radi

    public double potrosnja(double brojSati){
       return 100 / this.maxBrPojacavanja()
               * this.jacinaRingle * this.jacinaGrejaca * brojSati;
    }

//    metodu koja stampa podatke u formatu:
    public void stampaj(){
        if (this.jeUkljucena()){
            System.out.println("Ringla je ukljucena.");
        }else {
            System.out.println("Ringla je iskljucena.");
        }
        System.out.println("Tip ringle: " + this.tipRingle);
        System.out.println("Jacina: " + this.jacinaRingle);
        System.out.println("Grejac: " + this.jacinaGrejaca + "kW");
        System.out.println();
    }






}


