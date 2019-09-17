package Menu;

import Model.Client;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientSignUpMenu extends Client {

    ArrayList<Client> clients = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String nameInput;
    String emailInput;
    String menuTitle;
    String passwordInput;
    String phoneInput;


    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
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

        Client client= new Client(nameInput, emailInput,passwordInput,phoneInput);
        clients.add(client);
        System.out.println("You have signed in successfully");
    }
    protected void processinput() {
        System.out.println("Login");
        ClientLogin clientLogin = new ClientLogin();
        clientLogin.Login();
        clientLogin.waitForInput(clients);



    }

}
