package Menu;

public class Main {
    public static void main(String[] args) {

       Menu menu = new MainMenu("Welcome to Gebeya Navigation");

       menu.addMenuItem(1,"continue as a client");
       menu.addMenuItem(2,"continue as talent");
       menu.addMenuItem(0,"Quit");


       menu.Start();



    }
}

