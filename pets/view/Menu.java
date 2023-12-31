package pets.view;

import java.util.ArrayList;
import java.util.List;

import pets.presenter.Presenter;
import pets.view.menuPoints.AddAnimal;
import pets.view.menuPoints.MenuPoint;
import pets.view.menuPoints.PrintAnimList;

public class Menu {
    private List<MenuPoint> menuList;

    public Menu() {
        menuList = new ArrayList<>();
        menuList.add(new PrintAnimList());
        menuList.add(new AddAnimal());
    }
    public int getMenuSize() {
        return menuList.size();
    }
    public void perform(int num, Presenter presenter) {
        MenuPoint menu = menuList.get(num - 1);
        menu.execute(presenter);
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
