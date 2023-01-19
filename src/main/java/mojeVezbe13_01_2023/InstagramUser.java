package mojeVezbe13_01_2023;

public class InstagramUser {
    protected String username;
    protected String imeIprezime;
    protected String email;

    public InstagramUser(String username, String imeIprezime, String email) {
        this.username = username;
        this.imeIprezime = imeIprezime;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void stampaj(){
        System.out.println(this.imeIprezime + " " + this.email);
        System.out.println(this.username);
    }


}
