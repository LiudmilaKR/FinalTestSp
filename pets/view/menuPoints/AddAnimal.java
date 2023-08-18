package pets.view.menuPoints;

import pets.presenter.Presenter;

public class AddAnimal implements MenuPoint {

    @Override
    public void execute(Presenter presenter) {
        presenter.addAnimal();   
    }
    @Override
    public String toString() {
        return "Добавить животное";
    }
}
