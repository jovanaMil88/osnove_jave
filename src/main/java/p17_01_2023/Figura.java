package p17_01_2023;
//Kreirati abstraktnu klasu Figura koja ima
//        abstraktnu metodu povrsina
//        abstraktnu metodu obim
//        metodu koja stampa podatke u formatu:
//        Povrsina je (povrsina)
//        Obim je (obim)

public abstract class Figura {
    public abstract double povrsina();
    public abstract double obim();
    public void stampaj(){
        System.out.println("Povrsina je ");
        System.out.println("Obim je ");
    }

}
