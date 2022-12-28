package d_27_12_2022;

public class Proizvod {

    public String naziv;
    public double cena;
    public double tezinaGrami;
    public void stampaj(){
        System.out.println(this.naziv + ", " + this.cena + ", " + this.tezinaGrami);
    }
    public double konvertuj (String jedinica){
        if (jedinica.equals("kg")){
            return tezinaGrami / 1000;
        } else if (jedinica.equals("t")) {
            return tezinaGrami / 1000000;
        }else{
            return 0;
        }

    }


}
