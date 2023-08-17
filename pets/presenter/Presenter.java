package pets.presenter;

import pets.model.Animal;
import pets.model.Service;
import pets.view.Menu;
import pets.view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view, String path) {
        this.view = view;
        service = new Service(path);
    }

    // public void start(){
    //     view.startConsole();
    //     // service.loadFromFile();
    //     view.launchMenu();
    //     view.endtConsole();
    // }
    public void exit() {
        view.exit();
    }

    public void printAnimList() {
        view.printAnimList();
    }

    public void addAnimal() {
        String name = view.getNameAnimal();
        Animal newAnim = new Animal(10, name, view.getYearBirthAnimal(), view.getTypeAnim());
        service.currentPetList().add(newAnim);
        service.putToFile(newAnim);
        view.addAnimal(name);
    }
    
}
