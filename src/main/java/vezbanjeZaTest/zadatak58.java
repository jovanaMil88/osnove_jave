package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak58 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//        Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
//             / / / / /
//        Napomena: Metoda nista ne vraca.
        crtice(4, "?");

    }
    public static void crtice(int n, String karakter){
        for (int i = 0; i < n; i++) {
            System.out.print(karakter);

        }
    }

}
