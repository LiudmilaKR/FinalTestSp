package pets.presenter;

import pets.model.Animal;
import pets.model.Counter;
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
        if (service.currentPetList().isEmpty()) service.takeFromFile();
        view.printAnimList(service.currentPetList());
    }
    public void addAnimal() {
        if (service.currentPetList().isEmpty()) service.takeFromFile();
        String name = view.getNameAnimal();
        Counter count = new Counter();
        count.setNumber(service.currentPetList().lastId());
        count.getNumber();
        count.addCount();
        Animal newAnim = new Animal(count.getNumber(), name, view.getYearBirthAnimal(), view.getTypeAnim());
        service.currentPetList().add(newAnim);
        service.putToFile(newAnim);
        view.addAnimal(newAnim);
    }
}
