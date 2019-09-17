package Menu;

import Controller.ProjectController;

public class ClientMenu extends Menu {


    public ClientMenu(String menuTitle) {
        super(menuTitle);
    }

    ProjectController projectController =new ProjectController();

    @Override
    protected void processinput() {
        switch (userInput) {

            case 1:

                projectController.addProject();
                Start();
                break;

            case 2:

                System.out.println("***this are the projects you have added***");
                projectController.getProjects();
                Start();
                break;
        }
    }
}