package d_27_12_2022;

public class zadatak2 {
    public static void main(String[] args) {
//        Kreirati klasu SmartAirConditioning koja ima:
//        atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//        atribut za izabranu temperaturu
//        atribut za mod (hladi/greje) - string
//        metodu za stampu (proizvoljno)
//        metodu koja vraca informaciju da li je napolju veca temperatura
//        od one na koju je klima postavljena.
//                Metoda kao parametar prima temperaturu koja je napolju.
//
//
//        U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning
//        i za svaki od njih pozvati metode
        SmartAirConditioning samsung = new SmartAirConditioning();
        samsung.marka = "Samsung 12d18l";
        samsung.izabranaTemp = 21.5;
        samsung.mod = "greje";

        SmartAirConditioning lg = new SmartAirConditioning();
        lg.marka = "LG queen d150";
        lg.izabranaTemp = 26;
        lg.mod = "hladi";

        SmartAirConditioning whirlpool = new SmartAirConditioning();
        whirlpool.marka = "Whirlpool SPIW 318L";
        whirlpool.izabranaTemp = 22.0;
        whirlpool.mod = "greje";

        samsung.stampaj();
        lg.stampaj();
        whirlpool.stampaj();

        if(samsung.napoljuJeVecaTemp(30)) {
            System.out.println("Napolju je viša temperatura.");
        } else{
            System.out.println("Napolju je niža temšeratura.");
        }

        if(lg.napoljuJeVecaTemp(18)) {
            System.out.println("Napolju je viša temperatura.");
        } else{
            System.out.println("Napolju je niža temšeratura.");
        }

        if(whirlpool.napoljuJeVecaTemp(23)) {
            System.out.println("Napolju je viša temperatura.");
        } else{
            System.out.println("Napolju je niža temšeratura.");
        }




    }
}
