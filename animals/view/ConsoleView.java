package animals.view;

import java.util.ArrayList;
import java.util.Scanner;

import animals.model.HumanFriends;
import animals.model.pets.Dogs;

public class ConsoleView implements View {
    Scanner scan;
    Menu menu;
    private boolean work;
    /**
     * конструктор ConsoleView
     */
    public ConsoleView() {
        scan = new Scanner(System.in, "Cp866");
        menu = new Menu();
        work = false;
    }
    /**
     * метод оповещения начала работы программы
     */
    @Override
    public void startConsole() {
        System.out.println();
        System.out.println("Начало работы программы.");
    }
    /**
     * метод оповещения завершения работы программы
     */
    @Override
    public void endtConsole() {
        System.out.println();
        System.out.println("Завершение работы программы.");
    }
    @Override
    public void launchMenu() {
        work = true;
        int point = 0;
        while (work) {
            System.out.println(menu);
            point = scan.nextInt();
            if (point < 1 || point > (menu.getMenuSize() + 1)) {
                System.out.println("Выбор некорректен. Попробуйте ещё раз!");
            } else {    
            
                if (point == (menu.getMenuSize() + 1)) {
                    exit();
                    work = false;
                } 
                else menu.perform(point, this);
            }
        }
    }
    // public void test() {
    //     System.out.println("test");
    // }
    @Override
    public void printAllFriends() {
        HumanFriends pet2 = new Dogs(2, "Турмалин", 2018);
        System.out.println(pet2);
        System.out.println(pet2.commands());
    }
    @Override
    public void addHumFriend() {
        System.out.println("Введите имя нового друга человека => ");
        String name = scan.nextLine();
        HumanFriends pet = new Dogs(1, name, 2020);
    }
    private void exit(){
        System.out.println("Завершение работы.");
        // scan.close();
        // work = false;
    }
}
