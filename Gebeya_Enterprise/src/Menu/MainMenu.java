package Menu;

public class MainMenu extends Menu {

    public MainMenu() {
    }

    public MainMenu(String menuTitle) {
        super(menuTitle);
    }

    @Override
    protected void processinput() {

        switch (userInput){

            case 1:
                Menu menu3 = new ClientAuthenthicationMenu(" Client Authentication menu");

                menu3.addMenuItem(1,"SignUp");
                menu3.addMenuItem(2,"LogIn");
                menu3.addMenuItem(0,"Exit");

                menu3.Start();
                break;
            case 2:
                Menu menu4 = new TalentAuthenticationMenu("Talent Authentication menu");

                menu4.addMenuItem(1,"SignUp");
                menu4.addMenuItem(2,"Login");
                menu4.addMenuItem(0,"Exit");

                menu4.Start();
                break;

            case 0:
                System.exit(1);
        }

    }
}
