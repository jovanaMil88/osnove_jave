package mojeVezbeOd_14_12_2022;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji sa tastature ucitava
//        ime, prezime, broj telefona, email  i jmbg korisnika prikazuje u formatu:
//[Ime] [Prezime] - [JMBG]
//        Broj Tel: [Broj telefona],
//        Email: [Email],
//
//        Unesite ime: Milan
//        Unesite prezime: Jovanvoci
//        Unesite broj: +209329832
//        Unesite email: milan@gmail.com
//        Unesite jmbg: 329032938923
//
//        Milan Jovanovic - 329032938923
//        Broj tel:  +209329832
//        Email: milan@gmail.com
        System.out.println("Unesite ime: ");
        String ime = s.next();
        System.out.println("Unesite prezime: ");
        String prezime = s.next();
        System.out.println("Unesite broj telefona: ");
        String broj = s.next();
        System.out.println("Unesite email: ");
        String email = s.next();
        System.out.println("Unesite jmbg: ");
        String jmbg = s.next();
        System.out.println(ime + " " + prezime +  " - " + jmbg);
        System.out.println("Broj telefona: " + broj);
        System.out.println("Email: " + email);

    }
}
