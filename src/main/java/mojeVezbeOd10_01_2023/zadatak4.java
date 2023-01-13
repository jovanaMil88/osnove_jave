package mojeVezbeOd10_01_2023;

public class zadatak4 {
    public static void main(String[] args) {
        FilmI f = new FilmI("Lepa sela lepo gore", 1996);
        ReziserI r = new ReziserI("Srdjan Dragojevic", 60);
        f.setReziraoGa(r);
        f.print();
    }
}
