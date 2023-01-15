package d_12_01_2023;

public class zadatakTransakcija {
    public static void main(String[] args) {
        Racun posiljalac = new Racun("170-289328923-23", "Pavle Pavlovic");
        posiljalac.promeniStanje(52000);
        Racun primalac = new Racun("410-289345812-12", "Marko Markovic");
        primalac.promeniStanje(31000);
        Transakcija prva = new Transakcija("120-12",posiljalac,primalac);
        posiljalac.stampaj();
        System.out.println();
        primalac.stampaj();
        System.out.println();

        prva.izvrsiTransakciju(5000);
        prva.stampaj();
    }


}
