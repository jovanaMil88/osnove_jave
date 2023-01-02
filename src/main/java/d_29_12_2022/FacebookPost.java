package d_29_12_2022;

public class FacebookPost {
    private String imeIPrezimeKoJeObjavio;
    private String ImeIPrezimeGdeJeObjava;
    private String objava;
    private int brojLajkova;
    private int brojDeljenja;

    public String getImeIPrezimeKoJeObjavio() {
        return this.imeIPrezimeKoJeObjavio;
    }
    public String getImeIPrezimeGdeJeObjava() {
        return this.ImeIPrezimeGdeJeObjava;
    }

    public int getBrojDeljenja() {
        return this.brojDeljenja;
    }
    public int getBrojLajkova(){
        return this.brojLajkova;
    }

    public String getObjava(){
        return this.objava;
    }

    public void setImeIPrezimeKoJeObjavio(String imeIPrezimeKoJeObjavio) {
        this.imeIPrezimeKoJeObjavio = imeIPrezimeKoJeObjavio;
    }
    public void setImeIPrezimeGdeJeObjava(String imeIPrezimeGdeJeObjava){
        this.ImeIPrezimeGdeJeObjava = imeIPrezimeGdeJeObjava;
    }
    public void setObjava(String objava){
        this.objava = objava;
    }

    public void like(){
        this.brojLajkova = this.brojLajkova + 1;
    }
    public void dislike(){
        this.brojLajkova = this.brojLajkova - 1;
        if(this.brojLajkova < 0){
            this.brojLajkova = 0;
        }
    }
    public void share(){
        this.brojDeljenja = this.brojDeljenja + 1;
    }
    public void print(){
        System.out.println(this.getImeIPrezimeKoJeObjavio() + " >>> " + this.getImeIPrezimeGdeJeObjava());
        System.out.println(this.getObjava());
        System.out.println("Likes (" + this.brojLajkova +
                ") | Shares (" + this.brojDeljenja + ")");
        System.out.println();
    }
}
