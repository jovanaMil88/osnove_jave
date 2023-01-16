package mojeVezbe13_01_2023;

public class ZadatakFbPost {
    public static void main(String[] args) {
        FacebookPost post = new FacebookPost("Marko Markovic", "zdravo!");
        post.reaguj(new Reakcija("like", "Nikola Nikolic"));
        post.reaguj(new Reakcija("smile", "Jovan Jovanovic"));
        post.reaguj(new Reakcija("heart", "Ana Pantic"));
        post.reaguj(new Reakcija("like", "Ana Pantovic"));

post.stampaj();
    }
}
