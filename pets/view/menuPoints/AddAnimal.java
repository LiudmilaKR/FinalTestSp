package pets.view.menuPoints;

import pets.presenter.Presenter;
import pets.view.View;

public class AddAnimal implements MenuPoint {

    @Override
    public void execute(Presenter presenter) {
        presenter.addAnimal();
        
    }

    @Override
    public String toString() {
        return "AddAnimal []";
    }
    
}
