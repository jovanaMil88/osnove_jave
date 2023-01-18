package d_17_01_2023;
//Kreirati klasu TimeControl koja nasledjuje klasu Control i
//        konstruktore
//        ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean)

public class TimeControl extends Contol {
    private boolean uNapred;

    public TimeControl(boolean uNapred) {
        this.uNapred = uNapred;
    }

    // unapred true - unazad - false
    @Override
    public void izvrsiAkciju(VideoPlayer plejer) {
        //        implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa
//        za 15s unapred ili unazad u zavisnosti od atributa.
//        Veoma je bitno da se ne izadje van granica videa.
        if (this.uNapred) {
            plejer.trenutnoVreme = plejer.trenutnoVreme + 15.0;
        }else {
            plejer.trenutnoVreme = plejer.trenutnoVreme - 15.0;
        }
        if (plejer.duzinaVidea < plejer.trenutnoVreme){
            plejer.trenutnoVreme = plejer.duzinaVidea;
        }
        }



    }

