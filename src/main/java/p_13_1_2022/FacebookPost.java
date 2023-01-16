package p_13_1_2022;

import java.util.ArrayList;

public class FacebookPost {
    private String imeIPrezime;
    private String tekstObjave;
    private ArrayList<Reakcija> reakcije;

    public FacebookPost(String imeIPrezime, String tekstObjave) {
        this.imeIPrezime = imeIPrezime;
        this.tekstObjave = tekstObjave;
        this.reakcije = new ArrayList<>();
    }

    public void reaguj(Reakcija reakcija) {
        for (int i = 0; i < this.reakcije.size(); i++) {
            if (this.reakcije.get(i).getImeIPrezimeKorisnika().equals(reakcija.getImeIPrezimeKorisnika())){
                this.reakcije.remove(i);
            }
        }
        this.reakcije.add(reakcija);
    }

    public int vratiBrReakcija(String tipReakcije) {
        int counter = 0;
        for (int i = 0; i < this.reakcije.size(); i++) {
            if (tipReakcije.equals(this.reakcije.get(i).getTipReakcije())) {
                counter++;
            }
        }
        return counter;
    }
    public void stampaj(){
        System.out.println(this.imeIPrezime);
        System.out.println(this.tekstObjave);
        System.out.print("Lajk " + this.vratiBrReakcija("like") + " | " );
        System.out.print("Srce " + this.vratiBrReakcija("srce") + " | " );
        System.out.print("Dislajk " + this.vratiBrReakcija("dislike"));



    }


}

