package d13_12_2022;

public class zadatak2 {
    public static void main(String[] args) {
//   Napisati program koji stampa podatke o kreditnoj kartici u formatu kao na slici.
//   Od informacija se pamti broj kartice (16 cifara sa razmacima),
//   mesec i godina do kada vazi kartica, kao i ime i prezime vlasnika kartice.
//   Kartica se stampa sa zvezdicama i ne brinite ukoliko neka zvezdica mrdne
//   i nije u liniji to ce zavisiti od duzine imena.
//   Napomena: svaka informacija mora da bude u okviru posebne promenljive.

 String brKartice = "1236 6588 6987 6522";
 int mesec = 10, god = 23;
 String imeIPrezime = "Jovana Milojevic";

        System.out.println("**********************************");
        System.out.println("* Credit Card                    *");
        System.out.println("*   ****                         *");
        System.out.println("*   ****                         *");
        System.out.println("*      " + brKartice + "       *");
        System.out.println("*                 valid > " + mesec + "/" + god + "  *");
        System.out.println("*                                *");
        System.out.println("*    " + imeIPrezime + "            *");
        System.out.println("**********************************");



    }
}
