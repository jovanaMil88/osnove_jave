package p_27_12_2022;

public class zadatak4 {
    public static void main(String[] args) {
//        Kreirati klasu Auto koja ima:
//        ime i prezime vozaca
//        marku automobila
//        broj vrata
//        potrosnju na 100km (npr: 10)
//        trenutnu brzinu kojom se auto krece
//        metodu za stampu koja stampa podatke u formatu:
//             [Vozac]
//	           [Marka] - [br vrata]-ro vrata
//        Sa potrosnjom od [potrosnja] l na 100km
//                [Trenutna brzina auta] km/h je trenutna brzina.
//
//                Primer:
//        Milan Jovanovic
//        BMW - 5-ro vrata
//        Sa potrosnjom od 10 l na 100km
//        200 km/h je trenutna brzina
        Auto fordEcosport = new Auto();
        fordEcosport.imeIprezimeVozaca = "Veljko Milojevic";
        fordEcosport.marka = "Ford Ecosport";
        fordEcosport.brojVrata = 5;
        fordEcosport.potrosnja = 6;
        fordEcosport.trenutnaBrzina = 130;
        fordEcosport.godinaProizvodnje = 2021;
        fordEcosport.kubikaza = 1800;
        fordEcosport.brojRegistracije ="KV 166 JJ";
        fordEcosport.ukljucenaKlima = true;
        fordEcosport.maksimalnaBrzina = 200;
        fordEcosport.kapacitetRezervoara = 35;
        fordEcosport.trenutnoGoriva = 8;

        fordEcosport.podaciOAutu();

//        U okviru klase Auto, implementirati jos 2 metode:
//        metoda koja vraca informaciju da li je vozac prekoracio brzinu.
//        Kao parametar metode se prima ogranicenje (kao broj) a metoda vraca true ili false
//        ako je trenutna brzina veca od ogranicenja.
//                2.metoda koja vraca visinu novcane kazne za prekoracenje,
//        za svaku jedinicu prekoracenja placa se 1000din.
//            Metoda od parametara prima ogranicenje brzine
//        U glavnom programu pozvati ove metode i odstmpajte neke poruke na osnovu informacija
//        koje dobijete od njih.

        boolean z = fordEcosport.jePrekoracio(80);
        if (z == true) {
            System.out.println("Prekoracio.");
        } else {
            System.out.println("Nije prekoracio.");
        }


        double visina = fordEcosport.kazna(80);
        System.out.println("Visina kazne je " + visina);


        boolean olditemr = fordEcosport.jeOldtimer();
        if (olditemr == true) {
            System.out.println("Jeste oldtimer.");
        } else {
            System.out.println("Nije oldtimer.");
        }
        boolean isteklaReg = fordEcosport.istekla(12);
        if (isteklaReg == true) {
            System.out.println("Istekla registracija.");
        }else{
            System.out.println("Nije istekla registracija.");
        }

double cena = fordEcosport.cenaRegistracije();
        System.out.println("Cena registracije je: " + cena);


        fordEcosport.dodajGas();

        fordEcosport.koci();
        fordEcosport.stampajTablu();







    }
}
