package p_27_12_2022;

public class Student {
    private String ime;
    private String prezime;
    private int brojIndexa;
    private boolean daLiJeNaBudzetu;

private void setime(String ime){
    this.ime = ime;
    }
    private String getime(){
    return this.ime;
    }
    private void setprezime(String prezime){
        this.prezime = prezime;
}
    private String getprezime() {
        return this.prezime;
    }
private void setBrojIndexa(int index){
    this.brojIndexa = index;
}
    private int getBrojIndexa() {
        return this.brojIndexa;
}
private void setDaLiJeNaBudzetu(boolean jeste){
    this.daLiJeNaBudzetu = jeste;
}
private boolean getDaLiJeNaBudzetu(){
    return this.daLiJeNaBudzetu;
}}


