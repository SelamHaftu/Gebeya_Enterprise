package Menu;

import Model.Client;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientLogin {
    Scanner scanner = new Scanner(System.in);
    String NameInput;
    String PasswordInput;
    Menu client = new ClientMenu("Client Menu");

    public ClientLogin() {
    }

    protected void Login(){

        System.out.println("Enter your name");
        NameInput = scanner.next();

        System.out.println("Enter your Password");
        PasswordInput = scanner.next();
    }

    protected void waitForInput(ArrayList<Client> clients) {



        for (Client clientItem :
                clients) {
            if (clientItem.getName().equalsIgnoreCase(NameInput) && clientItem.getPassword().equalsIgnoreCase(PasswordInput)) {


                client.addMenuItem(1, "Create project");
                client.addMenuItem(2, "My project");
                client.addMenuItem(3,"Submission");
                client.addMenuItem(0, "LogOut");
                client.Start();
                client.processinput();
                break;

            } else {
                System.out.println("incorrect password or username");
                Login();
                break;
            }
        }

    }
}