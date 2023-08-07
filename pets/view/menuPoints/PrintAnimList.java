package pets.view.menuPoints;

import pets.view.View;

public class PrintAnimList implements MenuPoint {

    @Override
    public void execute(View console) {
        console.printAnimList();
    }
    @Override
    public String toString() {
        return "PrintAnimList";
    }
}
