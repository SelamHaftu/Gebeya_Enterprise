package Menu;

public class MenuItem extends Menu{
    int choice;
    String menuitemDescription;

    public MenuItem() {
        this(1,"continue as a talent");
    }




    public MenuItem(int choice, String menuitemDescription) {
        this.choice = choice;
        this.menuitemDescription = menuitemDescription;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public String getMenuitemDescription() {
        return menuitemDescription;
    }

    public void setMenuitemDescription(String menuitemDescription) {
        this.menuitemDescription = menuitemDescription;
    }

    public void show(){

    }

    @Override
    protected void processinput() {

    }

    @Override
    public String toString() {
        String result = choice + "-" + menuitemDescription;
        return result;
    }
}
