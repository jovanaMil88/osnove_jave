package zadaciZaVezbanje;

import java.util.Scanner;

public class od14_12DomZaVezb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*Za vezbanje)Napisati program koji ucitava 4 broja (a,b,c,d)
        i formira string p (p ima startni deo #)
        tako sto negativne brojeve lepi sa leve strane a pozitivne i nulu sa desne.
        Primer izvrsenja 1:
        Unesite a: 10  -> # 10
        Unesite b: -2   -> -2 # 10
        Unesite c: -1   -> -1 -2 # 10
        Unesite d: 9    -> -1 -2 # 10 9
        String p ime vrednost = -1 -2 # 10*/
        System.out.println("Unesite a: ");
        int a = s.nextInt();
        System.out.println("Unesite b: ");
        int b = s.nextInt();
        System.out.println("Unesite c: ");
        int c = s.nextInt();
        System.out.println("Unesite d: ");
        int d = s.nextInt();
String prvi = "ja";
String drugi = "ti";
String treci = "on";
String cetvrti = "mi";

        if(a < 0) {
            prvi = a + "#";
        }else if (a > 0) {
             prvi = "#" + a;
        }
        if(b < 0) {
            drugi = b + prvi;
        } else if (b > 0) {
             drugi = prvi + b;
        }
        if (c < 0) {
            treci = c + drugi;
        } else if (c > 0) {
            treci = drugi + c;
        }
        if (d < 0) {
            cetvrti = d + treci;
        } else if (d > 0){
            cetvrti = treci + d;
        }
        {
            System.out.print(cetvrti);
        }



        }
    }

