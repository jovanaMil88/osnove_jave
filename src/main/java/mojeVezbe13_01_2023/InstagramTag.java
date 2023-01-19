package mojeVezbe13_01_2023;

public class InstagramTag {
//    x koordinatu na slici
//    y koordinatu na slici
//    usera koji je tagovan
    protected double x;
    protected double y;
    protected InstagramUser tagovan;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public InstagramUser getTagovan() {
        return tagovan;
    }

    public void setTagovan(InstagramUser tagovan) {
        this.tagovan = tagovan;
    }

    public InstagramTag(double x, double y, InstagramUser tagovan) {
        this.x = x;
        this.y = y;
        this.tagovan = tagovan;
    }
    public void stampajTag(){
        System.out.println(this.x + "x" + this.y);
        System.out.println("tagovani korisnik: ");
        tagovan.stampaj();
    }


}
