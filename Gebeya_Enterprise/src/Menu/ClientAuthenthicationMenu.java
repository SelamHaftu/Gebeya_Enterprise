package Menu;

public class ClientAuthenthicationMenu extends Menu {

    public ClientAuthenthicationMenu() {
    }

    public ClientAuthenthicationMenu(String menuTitle) {
        super(menuTitle);
    }

    @Override
    protected void processinput() {
        ClientSignUpMenu client = new ClientSignUpMenu();
        switch (userInput){
            case 1:
                client.waitForInput();
                client.processinput();
                break;

            case 2:
                System.out.println("sign up first");
                client.waitForInput();
                client.processinput();
                break;


        }
    }
}

