package p17_01_2023;

public class StudentOsnovnih extends Student{
    public StudentOsnovnih(String imeIPrezime, String brIndexa, int brStudija) {
        super(imeIPrezime, brIndexa, brStudija);
    }

    @Override
    public double vratiSkolarinu() {
//        koja za cenu skolarine vraca 90000
        int cenaSkolarine = 90000;
        return cenaSkolarine;
    }

    @Override
    public boolean jeNaBudzetu() {
//        za metodu da li je na budzetu vraca true ako je student ispod 5 godine studija
        return this.brStudija < 5;
    }
}
