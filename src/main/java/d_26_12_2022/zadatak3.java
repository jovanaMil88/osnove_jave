package d_26_12_2022;

public class zadatak3 {
    public static void main(String[] args) {
        /*Napisati funkciju koja za dva jednocifrena broja
        koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru.
        METODA NISTA NE STAMPA.
        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

         */
        int rezultat = spojiBrojeve(3,4);
        System.out.println("Novi bro je "+ rezultat);



    }
    public static int spojiBrojeve(int a, int b){
        int noviBroj = a * 10 + b;
        return noviBroj;
    }
}
