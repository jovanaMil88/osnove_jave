package d_29_12_2022;

public class zadatak3 {
    public static void main(String[] args) {
        SmartAirConditioning uređaj1 = new SmartAirConditioning();
        uređaj1.marka = "Samsung";
        uređaj1.potrosnjaDokGreje = 2.0;
        uređaj1.potrosnjaDokHladi = 1.0;
        uređaj1.izabranaTemp = 21;
        uređaj1.mod = "greje";

        SmartAirConditioning uređaj2 = new SmartAirConditioning();
        uređaj2.marka = "LG";
        uređaj2.potrosnjaDokGreje = 2;
        uređaj2.potrosnjaDokHladi = 1;
        uređaj2.izabranaTemp = 26;
        uređaj2.mod = "hladi";

        uređaj1.print();
        uređaj2.print();
        System.out.println();

        uređaj1.izracunajMesecnuPotrosnju();
        uređaj2.izracunajMesecnuPotrosnju();

        double cena1 = uređaj1.cenaZaMesec(900);
        double cena2 = uređaj2.cenaZaMesec(450);

        System.out.println("Cena potrosnje uređaja "
                + uređaj1.marka + " za mesec dana je " + cena1 + "din.");
        System.out.println("Cena potrosnje uređaja "
                + uređaj2.marka + " za mesec dana je " + cena2 + "din.");



    }
}
