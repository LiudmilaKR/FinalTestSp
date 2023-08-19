package pets.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pets implements Iterable<Animal>{
    // реестр животных
    private List<Animal> petList;

    public Pets() {
        petList = new ArrayList<>();
    }
    public void add(Animal animal) {
        if (!petList.contains(animal)) petList.add(animal);
    }
    public int lastId() {
        if (petList.isEmpty()) return 0;
        return petList.get(petList.size() - 1).getIdAnim();
    }
    public boolean isEmpty() {
        if (petList.isEmpty()) return true;
        else return false;
    }
    @Override
    public Iterator<Animal> iterator() {
        Iterator<Animal> it = new Iterator<>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < petList.size();
            }
            @Override
            public Animal next() {
                return petList.get(index++);
            }
        };
        return it;
    }
}
