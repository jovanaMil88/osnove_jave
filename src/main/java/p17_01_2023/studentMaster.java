package p17_01_2023;

public class studentMaster extends Student{
    public studentMaster(String imeIPrezime, String brIndexa, int brStudija) {
        super(imeIPrezime, brIndexa, brStudija);
    }

    @Override
    public double vratiSkolarinu() {
        return 100000;
    }

    @Override
    public boolean jeNaBudzetu() {
        return this.brStudija < 2;    }
//    koja za cenu skolarine vraca 100000
//    za metodu da li je na budzetu vraca true ako je student ispod 2 godine studija
//    U glavnoj klasi kreirati studente i testirati funkciolanosti



}
