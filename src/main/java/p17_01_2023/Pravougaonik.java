package p17_01_2023;
//stranice a i b
//        gettere/settere/konstruktore
//        implementira metodu povrsina
//        implementira metodu obim

public class Pravougaonik extends Figura{

    private double stranicaA;
    private double stranicaB;
    @Override
    public double povrsina() {
        return stranicaB * stranicaA;
    }
    @Override
    public double obim() {
        return 2 * stranicaA + 2 * stranicaB;
    }

    public double getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
    }

    public Pravougaonik(double stranicaA, double stranicaB) {
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
    }
    @Override
    public void stampaj(){
        System.out.println("Trougao: ");
        System.out.println("Povrsina je " + this.povrsina());
        System.out.println("Obim je " + this.obim());
    }
}
