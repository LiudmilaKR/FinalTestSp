package pets.presenter;

import pets.model.Animal;
import pets.model.Service;
import pets.view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view, String path) {
        this.view = view;
        service = new Service(path);
    }
    public void exit() {
        view.exit();
    }
    public void printAnimList() {
        service.takeFromFile();
        view.printAnimList(service.currentPetList());
    }
    public void addAnimal() {
        String name = view.getNameAnimal();
        
        Animal newAnim = new Animal(name, view.getYearBirthAnimal(), view.getTypeAnim());
        service.currentPetList().add(newAnim);
        service.putToFile(newAnim);
        view.addAnimal(name);
    }
}
