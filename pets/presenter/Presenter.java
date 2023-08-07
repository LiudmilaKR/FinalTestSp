package pets.presenter;

import pets.model.Service;
import pets.view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view, String path) {
        this.view = view;
        service = new Service(path);
    }
    
}
