package pets.view;

import java.util.Scanner;

import pets.model.Pets;
import pets.model.TypeAnim;

public class ConsoleView implements View {
    private Scanner scan;
    
    /**
     * конструктор ConsoleView
     */
    public ConsoleView() {
        scan = new Scanner(System.in, "Cp866");
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
    public void exit() {
        System.out.println("Выходим...");
    }
    @Override
    public void printAnimList(Pets pets) {
        System.out.println("Печатаем лист животных");
        System.out.println(pets);
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
