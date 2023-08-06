package animals.presenter;

import animals.model.Service;
import animals.view.ConsoleView;
import animals.view.View;

public class Presenter {
    View view;
    Service service;
    /**
     * контруктор Presenter
     */
    public Presenter(String path) {
        view = new ConsoleView();
        service = new Service(path);
    }
    /**
     * запуск программы
     */
    public void start(){
        view.startConsole();
        view.launchMenu();
        view.endtConsole();
    }
}
