package pets.view;

import java.util.Scanner;

import animals.model.HumanFriends;
import animals.model.pets.Dogs;

public class ConsoleView implements View {
    private Scanner scan;
    // private Menu menu;
    // private boolean work;
    /**
     * конструктор ConsoleView
     */
    public ConsoleView() {
        scan = new Scanner(System.in, "Cp866");
        // menu = new Menu();
        // this.menu = menu;
        // work = false;
    }
    /**
     * метод оповещения начала работы программы
     */
    @Override
    public void start() {
        System.out.println();
        System.out.println("Начало работы программы.");
    }
    /**
     * метод оповещения завершения работы программы
     */
    @Override
    public void end() {
        System.out.println();
        System.out.println("Завершение работы программы.");
    }
    // @Override
    // public void launchMenu() {
    //     work = true;
    //     int point = 0;
    //     while (work) {
    //         System.out.println(menu);
    //         point = scan.nextInt();
    //         if (point < 1 || point > (menu.getMenuSize() + 1)) {
    //             System.out.println("Выбор некорректен. Попробуйте ещё раз!");
    //         } else {    
            
    //             if (point == (menu.getMenuSize() + 1)) {
    //                 exit();
    //                 work = false;
    //             } 
    //             else menu.perform(point, this);
    //         }
    //     }
    // }
    public void exit() {
        System.out.println("Выходим...");
        // scan.close();
        // work = false;
    }
    @Override
    public void printAnimList() {
        HumanFriends pet2 = new Dogs(2, "Турмалин", 2018);
        System.out.println(pet2);
        System.out.println(pet2.commands());
    }
}
