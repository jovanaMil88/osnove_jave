package mojeVezbeOd10_01_2023;
//Za klasu Tacka, koja ima privatne atribute:
//        x - x koordinata
//        y - y koordinata
//        Javne metode:
//        metodu stampaj
//        imamo difoltni konstruktor
//        imamo konstuktor koji prima obe koordinate za kreiranje objekta
//        geter za x
//        geter za y
//        seter za x
//        seter za y
//
//        U glavnom programu kreirati dva objekta:
//        Jedan preko difoltnog konstuktora i postavite koordinate na 10 i 20
//        Drugi objekat preko konsuktora sa parametrima i postavite kooridnate na 30 i 40

public class Tacka {
    private int x;
    private int y;

    public void stampaj() {
        System.out.println("X koordinata je " + this.x);
        System.out.println("Y koordinata je " + this.y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Tacka() {
    }

    public void pomeriPoX(int v) {
        this.x = this.x + v;
    }

    public Tacka(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
