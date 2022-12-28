package d_27_12_2022;

public class zadatak1 {
    public static void main(String[] args) {
//        Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String) cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//                i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        konvertuj - metoda konvertuje tezinu u kilograme i tone.
//        Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo,
//        a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//        Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//        Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
//
//        U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode
        Proizvod sir = new Proizvod();
        sir.naziv = "Trapist";
        sir.cena = 1085.75;
        sir.tezinaGrami = 1115;

        Proizvod brasno = new Proizvod();
        brasno.naziv = "Fidelinka T400";
        brasno.cena = 82.50;
        brasno.tezinaGrami = 1000.0;

        Proizvod plazma = new Proizvod();
        plazma.naziv = "Plazma keks";
        plazma.cena = 420.0;
        plazma.tezinaGrami = 3000.0;

        sir.stampaj();
        brasno.stampaj();
        plazma.stampaj();

        System.out.println("Tezina proizvoda " + sir.naziv +
                " u kilogramima je " + sir.konvertuj("kg") + "kg.");
        System.out.println("Tezina proizvoda " + brasno.naziv +
                " u tonama je " + brasno.konvertuj("t") + "t.");
        System.out.println("Tezina proizvoda "+ plazma.naziv +
                " u kilogramima je " + plazma.konvertuj("kg") + "kg.");





    }
    }

