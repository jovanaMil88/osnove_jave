package d_26_12_2022;



public class zadatak5 {
    public static void main(String[] args) {

       /* Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
        Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
                                           / / / / /
        Napomena: Metoda nista ne vraca.

        */
        nIKarakteri(7,"*");

    }
    public static void nIKarakteri (int n, String karakter){
        for (int i = 1; i < n; i++) {
            System.out.print(karakter);

        }
    }
}

