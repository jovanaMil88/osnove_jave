package vezbanjeZaTest;

import java.util.Scanner;

public class zadatakDom5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//         Napisati program koji iscrtava timeline na youtube videu.
//        Korisnik unosi duzinu videa u sekundama i trenutno vreme u videu,
//                a program iscrtava timeline tako sto deo koji je pogledan iscrtava zvezdicama
//        a ostatak crticama. Timeline je kontrola koja ima tacno 100 karaktera.
//                Primer izvrsenja:
//        Unesite duzinu videa (s): 203
//        Unesite trenutno vreme videa (s): 20
//                *********-------------------------------------------------------------------------------------------
//        (Objasnjenje:Ako video ima 203s a mi smo na 20s,
//            to znaci da je pogledano 9.85% videa, zaokruzicemo to na 9zvezdica
//    ostatak do 100 su crtice)

        System.out.println("Unesite duzinu videa: ");
        int ukupnoVreme = s.nextInt();
        System.out.println("Unesite trenutno vreme videa: ");
        int trenutnoVreme = s.nextInt();

        for (int i = 1; i <= 100; i++) {
            int procenat = (trenutnoVreme * 100) / ukupnoVreme;
            if (i <= procenat) {
                System.out.print("*");
            } else {
                System.out.print("-");
                System.out.println(" ");


//                Pretvorite vremena u minute i sekune i stavite ih ispod prikaza:
//                Primer izvrsenja:
//                Unesite duzinu videa (s): 203
//                Unesite trenutno vreme videa (s): 20
//                        *********-------------------------------------------------------------------------------------------
//                        0:20 / 3:23


            }


        }
        int trenutnoVremeMin = trenutnoVreme / 60;
        int ostatakTrenVrem = trenutnoVreme % 60;

        int ukupnoVremeMin = ukupnoVreme / 60;
        int ostatakUkupVrem = ukupnoVreme % 60;
        System.out.print(trenutnoVremeMin + ":" + ostatakTrenVrem + " / " +
                ukupnoVremeMin + ":" + ostatakUkupVrem);


    }
}
