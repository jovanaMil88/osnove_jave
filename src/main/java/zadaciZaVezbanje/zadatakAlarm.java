package zadaciZaVezbanje;

import java.util.Scanner;

public class zadatakAlarm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite sat: ");
        int sat = s.nextInt();
        System.out.println("Unesite minut: ");
        int UnetiMinut = s.nextInt();
        int UkupniMinuti = UnetiMinut + 30;
        int MinutiModuo = UkupniMinuti % 60;

        System.out.println("Aktiviraće se u: ");
        for (int i = UnetiMinut; i < ((UnetiMinut + MinutiModuo) - 5); i = i + 5) {
            System.out.println(sat + ":" + i);
            }
        for (int i = UnetiMinut + MinutiModuo; i <= UkupniMinuti ; i = i + 5) {
            if (i == 60) {
                i = 0;
                sat = sat + 1;
            }
            System.out.println(sat + ":" + i);
            }


        }


        }

