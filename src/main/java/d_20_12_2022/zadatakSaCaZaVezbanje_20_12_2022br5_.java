package d_20_12_2022;

import java.util.Scanner;

public class zadatakSaCaZaVezbanje_20_12_2022br5_ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        (za vezbanje) Napisati pogram koji vrsi korkeciju zvuka.
//        Korisnik unosi akcije “pojacaj” ili “smanji” ili “play”.
//        Program radi dok korisnik ne unese play. Inicijalna jacina zvuka je 75.
//        Pojacaj - akcije koja povecava jacinu zvuka za 10
//        smanji - akcija koja smajnjuje jacinu zvuka za 10.
//        Zvuk nakon nijedne akcije ne sme da spadne ispod nule ili da ode preko 100.
//        Na kraju programa odstampati jacinu zvuka.
//
//        Primer izvrsenja:
//        Unesite akciju: pojacaj (iz 75 u 85)
//        Unesite akciju: pojacaj ( iz 85 u 95)
//        Unesite akciju: pojacaj (iz 95 u 100)
//        Unesite akciju: smanji (iz 100 u 90)
//        Unesite akciju: smanji (iz 90 u 80)
//        Unesite akciju: play
//        Jacina zvuka je 80.
        int jacina = 75;
        String akcija = "prvo";
        while (!akcija.equals("play")) {
            System.out.println("Unesite akciju: ");
            akcija = s.next();
            if (akcija.equals("pojacaj")) {
                jacina = jacina + 10;
            } else if (akcija.equals("smanji")) {
                jacina = jacina - 10;
            }
            if (jacina < 0) {
                jacina = 0;
            } else if (jacina > 100) {
                jacina = 100;
            }
        }
        System.out.println("Jacina je: " + jacina);
    }

}




