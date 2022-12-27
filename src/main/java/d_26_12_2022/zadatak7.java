package d_26_12_2022;

public class zadatak7 {
    public static void main(String[] args) {
        /*Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.

        Primer izvrsenja:
        izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
        izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1

        Napomena: Resiti bez koriscenja petlji.

         */
        int rezultat = count(-3,6);
        System.out.println("Ima " + rezultat + " celih brojeva.");


    }
    public static int count (int a, int b){
        int brojCelih = b - a - 1;
        return brojCelih;
    }






    }

