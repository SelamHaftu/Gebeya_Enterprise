package Menu;

public class TalentAuthenticationMenu extends Menu{

    public TalentAuthenticationMenu() {
    }

    public TalentAuthenticationMenu(String menuTitle) {
        super(menuTitle);
    }

    @Override
    protected void processinput() {
        TalentSignUpMenu talent = new TalentSignUpMenu();
        switch (userInput){

            case 1:

                talent.waitForInput();
                talent.processinput();
                break;

            case 2:

                System.out.println("sign up first");
                TalentSignUpMenu talent1 = new TalentSignUpMenu();
                talent1.waitForInput();
                talent1.processinput();
                break;

        }
    }


}
