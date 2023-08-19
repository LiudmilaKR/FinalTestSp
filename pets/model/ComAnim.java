package pets.model;

import java.util.ArrayList;
import java.util.List;

public class ComAnim {
    List<String> commandList;

    public ComAnim() {
        commandList = new ArrayList<>();
    }
    public void addAnimalCommand(String com) {
        commandList.add(com);
    
    }
    @Override
    public String toString() {
        return "" + commandList;
    }
}
