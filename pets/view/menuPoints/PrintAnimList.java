package pets.view.menuPoints;

import pets.presenter.Presenter;

public class PrintAnimList implements MenuPoint {

    @Override
    public void execute(Presenter presenter) {
        presenter.printAnimList();
    }
    @Override
    public String toString() {
        return "Печать реестра животных";
    }
}
