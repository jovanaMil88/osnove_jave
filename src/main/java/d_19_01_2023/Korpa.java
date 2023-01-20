package d_19_01_2023;

import java.util.ArrayList;

public class Korpa {
//    Kreirati klasu Korpa koja ima:
//    niz ambalaza
//    metoda kao parametar prima popust.
//    metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze),
//    kao parametar funkcije se prima Super karticu iz koje se cita popust.
private ArrayList <Ambalaza> ambalaze;

    public Korpa() {
        this.ambalaze = new ArrayList<>();
    }

    public ArrayList<Ambalaza> getAmbalaze() {
        return ambalaze;
    }
    //    metodu dodaj ambalazu
    public void dodajAmbalazu(Ambalaza ambalaza){
        this.ambalaze.add(ambalaza);
    }
//    metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String)
//    koju treba izbaciti
    public void izbaciAmbalazu(String barkod){
        for (int i = 0; i < this.ambalaze.size(); i++) {
            if (this.ambalaze.get(i).getBarkod().equals(barkod)){
                this.ambalaze.remove(i);
            }

        }
    }
//    privatnu metodu koja vraca cenu svih ambalaza sa popustom,
//    metoda kao parametar prima popust.

    private double vratiCenuSaPopustom(int popust) {
        double novaCena = 0;
        for (int i = 0; i < this.ambalaze.size(); i++) {
            novaCena = this.ambalaze.get(i).cenaArtikla() * (1- popust / 100);
        }
        return novaCena;
    }
//        metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze),
//        kao parametar funkcije se prima Super karticu iz koje se cita popust.

        public double UkupnaCenaKorpe(SuperKartica superKartica){
        double ukupnaCena = 0;
            for (int i = 0; i < this.ambalaze.size(); i++) {
                    ukupnaCena = ukupnaCena + vratiCenuSaPopustom(superKartica.getPopust());
                }
            return ukupnaCena;
            }

            public void stampaj(){
                for (int i = 0; i < this.ambalaze.size(); i++) {
                    this.ambalaze.get(i).stampaj();
                    System.out.println();

                }

            }


    }

