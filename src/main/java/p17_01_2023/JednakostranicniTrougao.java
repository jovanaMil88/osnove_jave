package p17_01_2023;
//Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
//        stranicu a
//        gettere/settere/konstruktore


public class JednakostranicniTrougao extends Figura{

    private double stranicaA;

    public double getStranicaA() {
        return stranicaA;
    }

    public JednakostranicniTrougao(double stranicaA) {
        this.stranicaA = stranicaA;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;

    }

    @Override
    public double povrsina() {
//        implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
        return (stranicaA * stranicaA) * 1.73205 / 4;
    }

    @Override
    public double obim() {
        //        implementira metodu obim
        return stranicaA + stranicaA + stranicaA;
    }
    @Override
    public void stampaj(){
        System.out.println("Trougao: ");
        System.out.println("Povrsina je " + this.povrsina());
        System.out.println("Obim je " + this.obim());
    }

}
