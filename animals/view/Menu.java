package animals.view;

import java.util.ArrayList;
import java.util.List;

import animals.view.menuPoints.MenuPoint;
import animals.view.menuPoints.PrintAll;

public class Menu {
    private List<MenuPoint> menuList;
    // private MenuPoin menu;

    public Menu() {
        menuList = new ArrayList<>();
        menuList.add(new PrintAll());
        // comandList.add(new ShowTree());
        // comandList.add(new AddToTree());
        // comandList.add(new DelFromTree());
    }
    public int getMenuSize() {
        return menuList.size();
    }
    public void perform(int num, View console) {
        MenuPoint menu = menuList.get(num - 1);
        System.out.println(menu);
        menu.execute(console);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Выберите действие:\n");
        int i = 1;
        for (MenuPoint item : menuList) {
            sb.append(i++);
            sb.append(".");
            sb.append(item);
            sb.append("\n");
        }
        sb.append(i + ".Выход");
        return sb.toString();
    }
}
