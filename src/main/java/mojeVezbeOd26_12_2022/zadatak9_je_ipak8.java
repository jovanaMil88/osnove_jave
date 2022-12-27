package mojeVezbeOd26_12_2022;

public class zadatak9_je_ipak8 {
    public static void main(String[] args) {
            /* Napisati metodu koja proverava da li je trougao pravougli.
                    Metoda prima stranice trougla i hipotenuzu trougla.
            Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
                    Trougao je pravougli ukoliko je a*a+b*b=c*c

         */
        boolean trougao = jePravougli(8, 13, 11);
        if (trougao == true) {
            System.out.println("Pravougli.");
        } else {
            System.out.println("Nije pravougli. ");
        }

    }

    public static boolean jePravougli(int a, int b, int c) {
        if (a * a + b * b == c * c) {
            return true;
        }
        return false;
    }
}

