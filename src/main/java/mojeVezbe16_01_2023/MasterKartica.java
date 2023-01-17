package mojeVezbe16_01_2023;

public class MasterKartica extends PlatnaKartica{
    public MasterKartica(int suma, String brKartice, int godinaVazenja, int mesecVazenja) {
        super(suma, brKartice, godinaVazenja, mesecVazenja);
        }

    /*implementira metodu koja vrsi transakciju,
    tako da na prosledjenu sumu dodaje proviziju od 1.5 posto na sumu.*/

    @Override
    public void izvrsiTransakciju(double iznos) {
        super.izvrsiTransakciju(iznos);
        this.suma = this.suma - ((1.5  / 100) * iznos);
    }

   /* metoda naplatiOdrzavanje, koja sa racuna skida $2.*/

    public void naplatiOdrzavanje(){
        this.suma = this.suma - 2;
    }

    /*implementira metodu koja stampa podatke o kartici u formatu:
    Master Card: 12/2019, 4012-1239-1221-3381, $232*/

    @Override
    public void stampaj() {
        System.out.print("MAster Card: ");
        super.stampaj();
        System.out.println();
    }
}
