package d_10_01_2023;

public class zadatak1 {
    public static void main(String[] args) {
        Autor a = new Autor("Ivo", "Andric");
        Knjiga k = new Knjiga("ISBN 978-86-7346-581-42",
                "Na Drini Cuprija", 1969, a );
        k.stampaj();
        System.out.println();
        Autor a1 = new Autor("Mesa", "Selimovic");
        Knjiga k1 = new Knjiga("ISBN 948-86-7346-121-42",
                "Tvrđava", 1970, a1);
        k1.stampaj();
        System.out.println();
        Knjiga k2 = new Knjiga("ISBN 358-86-7942-581-04",
                "Prokleta Avlija",1954, a);
        k2.stampaj();
    }
}
