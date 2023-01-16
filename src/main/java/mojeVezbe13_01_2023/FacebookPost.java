package mojeVezbe13_01_2023;

import java.util.ArrayList;

public class FacebookPost {
    private String postavio;
    private String tekst;
    private ArrayList<Reakcija> reakcije;

    public String getPostavio() {
        return postavio;
    }

    public String getTekst() {
        return tekst;
    }

    public ArrayList<Reakcija> getReakcije() {
        return reakcije;
    }

    public FacebookPost(String postavio, String tekst) {
        this.postavio = postavio;
        this.tekst = tekst;
        this.reakcije = new ArrayList<>();
    }

    //    metodu reaguj, koja dodaje reakciju u niz
    public void reaguj(Reakcija reakcija){
        for (int i = 0; i < this.reakcije.size(); i++) {
            if(this.reakcije.get(i).getReagovao().equals(reakcija.getReagovao())){
                this.reakcije.remove(i);
            }
        }
        this.reakcije.add(reakcija);
        //    Ukoliko se desi situacija da jedan isti korisnik reaguje na post
//            (tj. postoji rekacija korisnika sa istim imenom i prezimenom)
//    izbaciti prethodnu reakciju i uracunati novu.

    }
//    privatnu metodu koja vraca broj reakcija odredjenog tipa
//            (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)

    private int vratiBrReakcija(String tipReakcije){
        int counter = 0;
        for (int i = 0; i < this.reakcije.size(); i++) {
            if (this.reakcije.get(i).getTipReakcije().equals(tipReakcije)){
                counter ++;
            }
        }
        return counter;
    }
//    metodu stampaj koja stampa podatke u formatu:
//    ime i prezime
//    tekst objave
//    Smajli 10 | Like 15 | Srce 2
    public void stampaj(){
        System.out.println(this.postavio);
        System.out.println(this.tekst);
        System.out.print("Smajli " + this.vratiBrReakcija("smile") + " | " +
                "Lajk " + this.vratiBrReakcija("like") + " | " +
                "Srce " + this.vratiBrReakcija("heart" + " | "));
    }









}
