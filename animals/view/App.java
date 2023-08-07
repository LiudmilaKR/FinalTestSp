package animals.view;

import animals.presenter.Presenter;

public class App {
    public static void buttonClick() {
        System.out.print("\033[H\033[J");
        View view = new ConsoleView();
        Presenter presenter = new Presenter(view, "Data.db");
        presenter.start();
    }
}
