package d14_12_2022;

import java.util.Scanner;

public class zadatak_Slack_Vibergrupa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite ime: ");
        String ime = s.next();
        System.out.println("Unesite prezime: ");
        String prezime = s.next();
        System.out.println("Jeste li bili na okupljanju? ");
        boolean okupljanje = s.nextBoolean();
        System.out.println("Polaznik/Predavač: ");
        String status = s.next();
        if((status.equals("Polaznik") && okupljanje == true)) {
            System.out.println("Dobrodošla/-o " + ime + " " + prezime);
        }else {
            System.out.println("Da se ne pita Nikoleta, " + ime + " "
                            + prezime + " bila/o bio u grupi.");
        }



    }
}
