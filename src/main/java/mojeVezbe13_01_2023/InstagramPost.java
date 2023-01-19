package mojeVezbe13_01_2023;

import java.util.ArrayList;
//        niz slika
//        Opis koji moze da se postavi za post
//        metodu dodajSliku

public class InstagramPost {
    protected ArrayList<InstagramImage> slike;
    protected String opis;

    public InstagramPost(String opis) {
        this.opis = opis;
        this.slike = new ArrayList<>();
    }

    public ArrayList<InstagramImage> getSlike() {
        return slike;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void dodajSliku(InstagramImage slika){
        this.slike.add(slika);
    }

    public void stampaj(){
        System.out.println(this.opis);
        for (int i = 0; i < this.slike.size(); i++) {
            this.slike.get(i).stampajSliku();
        }
    }

}
