package pets.model;

import java.util.ArrayList;
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

    @Override
    public String toString() {
        return "Pets\n" + petList;
    }
}
