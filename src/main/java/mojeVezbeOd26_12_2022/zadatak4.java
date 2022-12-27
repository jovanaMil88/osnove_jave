package mojeVezbeOd26_12_2022;

public class zadatak4 {
    public static void main(String[] args) {
        /*Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik
        za dva prosledjena broja. Brojevi su ulazni parametri funkcije.
                U gravnom programu pozvati nekoliko puta funkciju
        sa razlicitim prosledjenim vrednostima.*/
        operacije(8,4);
        operacije(12,4);

    }
    public static void operacije(int a,int b) {
        System.out.println("Zbir je " + (a + b));
        System.out.println("Razlika je " + (a - b));
        System.out.println("Proizvod je " + (a * b));
        System.out.println("Količnik je " + (a / b));
    }



    }


