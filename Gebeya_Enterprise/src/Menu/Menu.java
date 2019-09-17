package Menu;


import java.util.ArrayList;
import java.util.Scanner;

public  abstract class Menu {
    String menuTitle;
    ArrayList<MenuItem> menuItems = new ArrayList<>();
    int userInput ;
    Scanner scanner = new Scanner (System.in);

    public Menu() {
        this("navigation");

    }

    public Menu(String menuTitle) {
        this.menuTitle = menuTitle;

    }

    public String getMenuTitle() {
        return menuTitle;
    }



    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void addMenuItem(int choice,String menuitemDescription){
        MenuItem menuItem = new MenuItem(choice,menuitemDescription);
        menuItems.add(menuItem);
    }

    protected void ShowMenu(){
        System.out.println(getMenuTitle());
        for (MenuItem menuItem:
            menuItems ) {
            System.out.println(menuItem);

        }
        System.out.println("please enter 1 if you are talent, 2 for client and 0 to quit");
    }

    protected void waitForInput() {

        userInput = scanner.nextInt();
        if (userInput >= menuItems.size()) {
            System.out.println("the number you entered is not in the menu");
            System.out.println("please enter 1 if you are talent, 2 for client and 0 to quit");
            waitForInput();

        }
        else {
            processinput();
        }


    }
    protected abstract void processinput();

    protected  void Start(){

        ShowMenu();
        waitForInput();


    }

}
