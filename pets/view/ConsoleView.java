package pets.view;

import java.util.Scanner;

import pets.model.TypeAnim;

// import animals.model.HumanFriends;
// import animals.model.pets.Dogs;

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
        System.out.println("Печатаем лист животных");
        System.out.println();
    }
    @Override
    public void addAnimal(String name) {
        System.out.printf("Животное по кличке %s добавлено.", name);
        System.out.println();
    }
    @Override
    public String getNameAnimal() {
        System.out.println("Введите имя нового животного => ");
        return scan.nextLine();
    }
    @Override
    public int getYearBirthAnimal() {
        System.out.println("Введите год рождения нового животного => ");
        return scan.nextInt();
    }
    @Override
    public TypeAnim getTypeAnim() {
        System.out.println("Введите 1, если новое животное - собака, 2 - кошка, 3 - хомячок => ");
        int flag = scan.nextInt();
        if (flag == 1) return TypeAnim.Dogs;
        else if (flag == 2) return TypeAnim.Cats;
            else if (flag == 3) return TypeAnim.Hamsters;
                else return null;
    }
}
