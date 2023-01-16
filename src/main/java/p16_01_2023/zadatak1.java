package p16_01_2023;

public class zadatak1 {
    public static void main(String[] args) {
        Profesor p = new Profesor("Ivan Ivanovic",
                "545443434", "Nacionalna istorija", 70000);
        Profesor p1 = new Profesor("Petar Petrovic", "4545464", "Balkanologija",
                54000);
        Student stud = new Student("Jovana Jovanovci", "54654654",
                "5454545",12000);
        Student stud1 = new Student("Pavle Pavlovic",
                "55444", "454545", 1000 );

        p.povecajPlatu(30);
        p.stampaj();
        System.out.println();
        stud1.uplatiSkolarinu(1000);
        stud1.stampaj();
    }
}
