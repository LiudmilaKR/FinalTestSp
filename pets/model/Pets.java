package pets.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pets {
    // реестр животных
    private List<Animal> petList;

    public Pets() {
        petList = new ArrayList<>();
    }
    public void add(Animal animal) {
        if (!petList.contains(animal)) petList.add(animal);
    }
    // public int maxId() {
    //     int maxId = 0;
    //     for (Animal animal : petList) {
    //         if (animal.getIdAnim() > maxId) maxId = animal.getIdAnim();
    //     }
    //     return maxId;
    // }
    @Override
    public String toString() {
        return "Pets" + petList;
    }
    // @Override
    // public Iterator<Animal> iterator() {
    //     return null;
    // }
}
