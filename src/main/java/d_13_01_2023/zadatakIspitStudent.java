package d_13_01_2023;

public class zadatakIspitStudent {
    public static void main(String[] args) {
        Student brucos = new Student("071409", "Jovana Milojevic", "osnovne studije");
brucos.dodajIspit(new Ispit
        ("Savremeni grcki jezik I", 9, "Milena Jovanovic"));
brucos.dodajIspit(new Ispit
        ("Balkanologija I", 10, "Predrag Mutavdzic"));
brucos.dodajIspit(new Ispit
        ("Sintaksa I", 10, "Jelena Atlagic"));
brucos.dodajIspit(new Ispit
        ("Politicka istorija Balkana", 10, "Predrag Mutavdzic"));
brucos.dodajIspit(new Ispit
        ("Istorijska gramatika I", 8, "Darko Todorovic"));

brucos.stampaj();
    }



}
