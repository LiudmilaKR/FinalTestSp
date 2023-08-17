package pets.presenter;

import pets.model.Service;
import pets.view.Menu;
import pets.view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
    }

    // public void start(){
    //     view.startConsole();
    //     // service.loadFromFile();
    //     view.launchMenu();
    //     view.endtConsole();
    // }
    public void exit() {
        view.exit();
    }

    public void perfom (Menu menu, int point) {
        System.out.println(menu);
    }
    
}
