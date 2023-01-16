package p_13_1_2022;

public class zadatak2 {
    public static void main(String[] args) {
        FacebookPost prvi = new FacebookPost("Dejan Pantelic", "Poyy!");
        prvi.reaguj(new Reakcija("like", "Marko Markovic"));
        prvi.reaguj(new Reakcija("srce", "Jelena Jeftic"));
        prvi.reaguj(new Reakcija("srce", "Stevan Stevanovic"));
        prvi.reaguj(new Reakcija("like", "Jovan Jovanovic"));
        prvi.reaguj(new Reakcija("srce", "Jovan Jovanovic"));

        prvi.stampaj();

    }

}
