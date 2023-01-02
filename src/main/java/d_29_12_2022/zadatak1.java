package d_29_12_2022;

public class zadatak1 {
    public static void main(String[] args) {
//        Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//                cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//                i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        povecajCenu - koja kao parametar funkcije prima vrednost povećanje
//        za koju treba povećati cenu. Ova funkcija treba da menja atribut cena
//        i ova funkcija nema povratnu vrednost.
//                vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust,
//        a povratnu vrednost je cena proizvoda kada se uračuna popust.
//        Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//        racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod
//        šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara,
//                a cena postarine se računa u zavisnosti od tezine:
//        za tezinu do 100g, postarina iznosi 200din
//        za tezinu od 101g do 500g, postarina iznosi 400din
//        za tezinu preko 500g, postarina iznosi 1000din
//
//        U glavnom programu kreirati minimum 2 proizvoda
//        i za svaki od njih pozvati svaku od definisanih funkcija.

                Proizvod prasak = new Proizvod();
        prasak.naziv = "Ariel";
        prasak.cena = 1280;
        prasak.tezinaGrami = 8000;

        Proizvod neskafa = new Proizvod();
        neskafa.naziv = "Nescafe gold";
        neskafa.cena = 615.0;
        neskafa.tezinaGrami = 0.25;

        Proizvod maslac = new Proizvod();
        maslac.naziv = "Prezident";
        maslac.cena = 420.90;
        maslac.tezinaGrami = 0.25;

        prasak.stampaj();
        neskafa.stampaj();
        maslac.stampaj();

        System.out.println();
        System.out.println("Nakon povecanja cena: ");
        prasak.povecajCenu(170);
        System.out.println(prasak.naziv + " - " + prasak.cena);
        maslac.povecajCenu(20);
        System.out.println(maslac.naziv + " - " + maslac.cena);
        neskafa.povecajCenu(30);
        System.out.println(neskafa.naziv + " - " + neskafa.cena);
        System.out.println();

        System.out.println("Cene sa popustom: ");
        double novaCenaPraska = prasak.vratiCenuSaPopustom(15);
        System.out.println("Nova cena proizvoda:  " + prasak.naziv +
                " je " + novaCenaPraska + "din." );
        double novaCenaMaslaca = maslac.vratiCenuSaPopustom(20);
        System.out.println("Nova cena proizvoda:  " + maslac.naziv +
                " je " + novaCenaMaslaca + "din." );
        double novaCenaNeskafe = neskafa.vratiCenuSaPopustom(20);
        System.out.println("Nova cena proizvoda:  " + neskafa.naziv +
                " je " + novaCenaNeskafe + "din." );

        System.out.println();

        System.out.println("Poštarina za " + prasak.naziv + " je " + prasak.racunajPostarinu());
        System.out.println("Poštarina za " + maslac.naziv + " je " + maslac.racunajPostarinu());
        System.out.println("Poštarina za " + neskafa.naziv + " je " + neskafa.racunajPostarinu());












    }
}
