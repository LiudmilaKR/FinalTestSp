package animals.presenter;

import animals.model.Service;
// import animals.view.ConsoleView;
import animals.view.View;

public class Presenter {
    View view;
    Service service;
    /**
     * контруктор Presenter
     */
    public Presenter(View view, String path) {
        this.view = view;
        service = new Service(path);
    }
    /**
     * запуск программы
     */
    public void start(){
        view.startConsole();
        service.loadFromFile();
        // view.launchMenu();
        view.endtConsole();
    }
}
