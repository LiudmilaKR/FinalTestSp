package pets.view.menuPoints;

import pets.presenter.Presenter;
import pets.view.View;

public interface MenuPoint {
    // void execute(View console);
    void execute (Presenter presenter);
}
