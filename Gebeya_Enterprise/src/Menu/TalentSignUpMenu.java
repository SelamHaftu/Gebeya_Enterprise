package Menu;

import Model.Talent;

import java.util.ArrayList;
import java.util.Scanner;

public class TalentSignUpMenu extends Talent {

    ArrayList<Talent> talents = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String nameInput;
    String emailInput;
    String menuTitle;
    String passwordInput;
    String phoneInput;

    public TalentSignUpMenu() {

    }

    public TalentSignUpMenu(String name, String email, String password, String phoneNumber, ArrayList<Talent> talents) {
        super(name, email, password, phoneNumber);
        this.talents = talents;
    }

    public TalentSignUpMenu(ArrayList<Talent> talents) {
        this.talents = talents;
    }

    public ArrayList<Talent> getTalents() {
        return talents;
    }

    public void setTalents(ArrayList<Talent> talents) {
        this.talents = talents;
    }

    public String getNameInput() {
        return nameInput;
    }

    public void setNameInput(String nameInput) {
        this.nameInput = nameInput;
    }

    public String getEmailInput() {
        return emailInput;
    }

    public void setEmailInput(String emailInput) {
        this.emailInput = emailInput;
    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public String getPasswordInput() {
        return passwordInput;
    }

    public void setPasswordInput(String passwordInput) {
        this.passwordInput = passwordInput;
    }

    public String getPhoneInput() {
        return phoneInput;
    }

    public void setPhoneInput(String phoneInput) {
        this.phoneInput = phoneInput;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    protected void waitForInput() {
        System.out.println("fill this form to sign up");
        System.out.println("Enter your name");
        nameInput = scanner.next();

        System.out.println("Enter your Email");
        emailInput = scanner.next();

        System.out.println("Enter your Phone number");
        phoneInput = scanner.next();

        System.out.println("Enter your Password");
        passwordInput = scanner.next();

        Talent talent= new Talent(nameInput, emailInput,passwordInput,phoneInput);
        talents.add(talent);
        System.out.println("You have signed in successfully");
    }

    protected void processinput() {
            System.out.println("Login");
            TalentLoginController talentLoginController = new TalentLoginController();
            talentLoginController.waitForInput(talents);


    }

}


