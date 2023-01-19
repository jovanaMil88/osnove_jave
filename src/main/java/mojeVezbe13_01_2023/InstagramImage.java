package mojeVezbe13_01_2023;

import java.util.ArrayList;
//        niz tagova
//        dimenziju slike
//        putanju do slike (npr: instagram.com/korsnik-pera/profilna.jpg)
//        metodu dodajTag

public class InstagramImage {
    protected ArrayList<InstagramTag> tagovi;
    protected String dimenzija;
    protected String link;

    public InstagramImage(String dimenzija, String link) {
        this.tagovi = tagovi;
        this.dimenzija = dimenzija;
        this.link = link;
        this.tagovi = new ArrayList<>();
    }

    public ArrayList<InstagramTag> getTagovi() {
        return tagovi;
    }

    public String getDimenzija() {
        return dimenzija;
    }

    public String getLink() {
        return link;
    }


    public void setDimenzija(String dimenzija) {
        this.dimenzija = dimenzija;
    }

    public void setLink(String link) {
        this.link = link;
    }
    public void dodajTag(InstagramTag tag){
        this.tagovi.add(tag);
    }
    public void stampajSliku(){
        System.out.println("Dimenzija slike: " + this.dimenzija);
        System.out.println("Link: " + this.link );
        for (int i = 0; i < this.tagovi.size(); i++) {
            this.tagovi.get(i).stampajTag();
        }
    }

}
