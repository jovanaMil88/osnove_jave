package d_27_12_2022;

public class SmartAirConditioning {
    public String marka;
    public double izabranaTemp;
    public String mod;

    public void stampaj(){
        System.out.println("Uređaj marke " + this.marka +
                           " podešen je na " + this.izabranaTemp + " stepeni da " + mod + ".");
    }
    public boolean napoljuJeVecaTemp (double spoljnaTemperatura){
        if (spoljnaTemperatura > izabranaTemp){
            return true;
        }else {
            return false;
        }
    }
}
