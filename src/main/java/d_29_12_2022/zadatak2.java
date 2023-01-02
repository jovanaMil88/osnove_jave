package d_29_12_2022;

public class zadatak2 {
    public static void main(String[] args) {

        FacebookPost objava1 = new FacebookPost();

        objava1.setObjava("Zdravo, kako si?");
        objava1.setImeIPrezimeKoJeObjavio("Marko Markovic");
        objava1.setImeIPrezimeGdeJeObjava("Milos Milovanovic");

        FacebookPost objava2 = new FacebookPost();

        objava2.setObjava("Evo, nije loše. Ti?");
        objava2.setImeIPrezimeKoJeObjavio("Milos Milovanovic");
        objava2.setImeIPrezimeGdeJeObjava("Marko Markovic");

        objava1.like();
        objava1.like();
        objava1.like();
        objava1.like();
        objava2.like();
        objava2.like();
        objava1.dislike();
        objava2.share();
        objava2.share();
        objava2.share();
        objava1.share();

        objava1.print();
        objava2.print();










    }
}
