package Menu;

import Model.Talent;

import java.util.ArrayList;
import java.util.Scanner;

public class TalentLoginController  {

    Scanner scanner = new Scanner(System.in);
    String NameInput;
    String PasswordInput;

    public TalentLoginController() {
    }


    protected void waitForInput(ArrayList<Talent> talents) {
        System.out.println("Enter your name");
         NameInput = scanner.next();

        System.out.println("Enter your Password");
        PasswordInput = scanner.next();


        for (Talent talentItem:
                talents ){
            if (talentItem.getName().equalsIgnoreCase(NameInput) && talentItem.getPassword().equalsIgnoreCase(PasswordInput)){

                Menu talent = new TalentMenu("Talent Menu");
                talent.addMenuItem(1,"All project");
                talent.addMenuItem(2,"My project");
                talent.addMenuItem(0,"Exit");
                talent.Start();
                break;

            }
            else {
                System.out.println("incorrect password or username");
                waitForInput(talents);
            }
        }

    }


}
