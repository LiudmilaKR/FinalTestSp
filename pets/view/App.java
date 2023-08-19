package pets.view;

import java.util.Scanner;

import pets.presenter.Presenter;

public class App {
    View veiw;
    Presenter presenter;

    public App() {
        veiw = new ConsoleView();
        presenter = new Presenter(veiw, "data.db");
    }
    public void buttonClick() {
        System.out.print("\033[H\033[J");
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
                    else menu.perform(point, presenter);
                }
            }
        }
        veiw.end();
    }
}
