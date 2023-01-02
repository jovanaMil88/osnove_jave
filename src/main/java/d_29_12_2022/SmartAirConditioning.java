package d_29_12_2022;

public class SmartAirConditioning {
    public String marka;
    public double potrosnjaDokHladi;
    public double potrosnjaDokGreje;
    public double izabranaTemp;
    public String mod;

    public void print(){
        System.out.println( marka + " - " + mod + " - " + izabranaTemp);
    }

    public void izracunajMesecnuPotrosnju(){
        double mesPotrosnja = 0;
        if (this.mod.equals("hladi")){
            mesPotrosnja = 30 * 15 * potrosnjaDokHladi;
        } else if (this.mod.equals("greje")) {
            mesPotrosnja = 30 * 15 * potrosnjaDokGreje;
        }else {
            mesPotrosnja = 0;
        }
        System.out.println("Mesecna potrosnja je " + mesPotrosnja + "KWh");

    }

        public double cenaZaMesec(double mesPotrosnja){
            double zelenaZona = 350 * 6;
            double plavaZona = (mesPotrosnja - 350) * 9;
            return zelenaZona + plavaZona;
        }


        }








