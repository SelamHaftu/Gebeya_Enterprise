package Model;

public class Talent {

    String name;
    String email;
    String password;
    String phoneNumber;

    public Talent() {

        this("","","","");
    }

    public Talent(String name, String email,String password,String phoneNumber) {
        this.name = name;
        this.email = email;
        this.password=password;
        this.phoneNumber=phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
