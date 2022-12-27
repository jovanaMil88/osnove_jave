package mojeVezbeOd26_12_2022;

public class zadatak8_9jeIpak {
    public static void main(String[] args) {
        /*Napisati metodu koja vraca suprotno negativni broj od prosledjenog.
                Metoda prima broj N i vraca ga sa negativnom vrednoscu.
        Primer: Ako se metoda pozove za N=10, vraca -10
        Ako se metoda pozove za N=-11, vraca 11 */

int x = suprotni(-6);
        System.out.println("Suprotni broj je " + x);

    }

    public static int suprotni (int n) {
        if (n < 0) {
            return n = -n;
        } else if (n > 0) {
            return n;
        }else {
            return 0;
        }
    }}

