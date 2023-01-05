package MiniProjekatXO;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        XOTabla igra = new XOTabla();
        igra.setTabela(new ArrayList<String>());
        System.out.print("Unesite ime i przime X igraca: ");
        String imeX = s.next();
        igra.setImeXigraca(imeX);
        System.out.print("Unesite ime i przime O igraca: ");
        String imeO = s.next();
        igra.setImeOigraca(imeO);

        igra.pokreniIgru();

        while (!igra.popunjenaTabla() &&
                !igra.pobednikO() && !igra.pobednikX()){
            igra.stampaj();

            System.out.println("Na potezu je igrac " + igra.getNaPotezu());
            System.out.println("Odigrajte potez:");
            int polje = s.nextInt();

            if (igra.praznoPolje(polje)) {
                igra.odigrajPotez(polje);
                igra.zamenaIgraca();
            } else {
                System.out.println("Potez nije validan.");
            }
        }
        if (igra.popunjenaTabla()){
            System.out.println("Igra je nerešena.");
        }
        if (igra.pobednikX()){
            System.out.println("Cestitamo! Pobednik je igrac X!");
            System.out.println("Bravo, " + imeX + "!");
        } else if (igra.pobednikO()) {
            System.out.println("Cestitamo! Pobednik je igrac O!");
            System.out.println("Bravo, " + imeO + "!");
        }


    }}









