package pets.view;

import java.util.Scanner;

public class ConsoleView implements View {
    private Scanner scan;
    private Menu menu;
    private boolean work;
    /**
     * конструктор ConsoleView
     */
    public ConsoleView() {
        scan = new Scanner(System.in);
        menu = new Menu();
        work = false;
    }
    /**
     * метод оповещения начала работы программы
     */
    public void startConsole() {
        System.out.println();
        System.out.println("Начало работы программы.");
    }
    /**
     * метод оповещения завершения работы программы
     */
    public void endtConsole() {
        System.out.println();
        System.out.println("Завершение работы программы.");
    }
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
    private void exit(){
        System.out.println("Выходим...");
        // scan.close();
        // work = false;
    }
    @Override
    public void printAnimList() {

    }
}
