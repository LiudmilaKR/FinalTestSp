package pets.view;

import java.util.Scanner;

import pets.model.Service;
import pets.presenter.Presenter;

public class App {
    View veiw;
    Service service;
    Presenter presenter;

    public App() {
        veiw = new ConsoleView();
        service = new Service("data.db");
        presenter = new Presenter(veiw, service);
    }

    public void buttonClick() {
        System.out.print("\033[H\033[J");
        // this.presenter.start();
        // presenter.loadList
        Menu menu = new Menu();
        veiw.start();

        try (Scanner scan = new Scanner(System.in, "Cp866")) {
            boolean work = true;
            int point = 0;
            while (work) {
                System.out.println(menu);
                point = scan.nextInt();
                if (point < 1 || point > (menu.getMenuSize() + 1)) {
                    System.out.println("Выбор некорректен. Попробуйте ещё раз!");
                } else {    
                
                    if (point == (menu.getMenuSize() + 1)) {
                        presenter.exit();
                        work = false;
                    }
                    // else presenter.perfom(menu, point); 
                    else menu.perform(point, veiw);
                }
            }
        }
        veiw.end();
    }
}
