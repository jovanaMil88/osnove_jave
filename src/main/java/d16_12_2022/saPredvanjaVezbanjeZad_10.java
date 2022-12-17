package d16_12_2022;

import java.util.Scanner;

public class saPredvanjaVezbanjeZad_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite duzinu videa: ");
        int duzinaVideo = s.nextInt();
        System.out.println("Unesite trenutnu duzinu: ");
        int trenDuzina = s.nextInt();
        int procenat = (trenDuzina * 100) / duzinaVideo;
        for (int i = 0; i < duzinaVideo; i++) {
            if(i <= procenat) {
                System.out.print("*");
            }else {
                System.out.print("-");
            }
        }
        System.out.println();
        int minutiVidea = duzinaVideo / 60;
        int moduoMinuti = duzinaVideo % 60;
        System.out.println("0:" + trenDuzina + "/" + minutiVidea + ":" + moduoMinuti);
//        (DOPUNA TAKODJE ZA VEZBANJE)
//        Pretvorite vremena u minute i sekune i stavite ih
//        ispod prikaza:
//        Primer izvrsenja:
//        Unesite duzinu videa (s): 203
//        Unesite trenutno vreme videa (s): 20
//                0:20 / 3:23






    }}


