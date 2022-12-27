package p_27_12_2022;

public class SlackMessage {
    public String tekst;
    public String imeIPrezime;
    public String dateTime;

    public void stampaj(){
        System.out.println( this.imeIPrezime + " - " + this.dateTime);
        System.out.println(this.tekst);

    }

}
