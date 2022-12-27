package p_27_12_2022;

public class zadatak3 {
    public static void main(String[] args) {
        SlackMessage poruka1 = new SlackMessage();
        poruka1.tekst = "Jeste.";
        poruka1.imeIPrezime = "Desanka Maksimovic";
        poruka1.dateTime = "12.08.2022.";

        SlackMessage poruka2 = new SlackMessage();
        poruka2.tekst ="Nije.";
        poruka2.imeIPrezime = "Jovan Jovanovic Zmaj";
        poruka2.dateTime = "12.04.2002.";

        System.out.println(poruka1.imeIPrezime + " - " + poruka1.dateTime);
        System.out.println(poruka1.tekst);
        System.out.println(" ");
        System.out.println(poruka2.imeIPrezime + " - " + poruka2.dateTime);
        System.out.println(poruka2.tekst);

        poruka1.stampaj();
        poruka2.stampaj();


    }
}
