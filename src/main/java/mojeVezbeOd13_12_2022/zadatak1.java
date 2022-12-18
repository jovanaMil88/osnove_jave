package mojeVezbeOd13_12_2022;

public class zadatak1 {
    public static void main(String[] args) {
//        Napisati program koji na ekranu stampa podatke u formatu:
//[IME I PREZIME]
//[BROJ TELEFONA], [ULICA I BROJ], [GRAD]
//[EMAIL]

        String imeIprezime = "Jovana Milojevic";
        String brojTelefona = "062557231";
        String ulicaIBroj = "Vojvode Putnika 29/36";
        String grad = "Kraljevo";
        String email = "jovanastevanovic22@gmail.com";

        System.out.println(imeIprezime);
        System.out.println(brojTelefona + ", " + ulicaIBroj + ", " + grad);
        System.out.println(email);

    }
}
