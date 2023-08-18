package animals;

import animals.model.HumanFriends;
import animals.model.pets.Dogs;
// import animals.presenter.Presenter;
// import animals.view.App;

public class Main {
    public static void main(String[] args) {

        HumanFriends pet1 = new Dogs(1, "Шарик", 2020);
        
        System.out.println(pet1);
        System.out.println(pet1.commands());
        
        // Presenter presenter = new Presenter("Buffer.out");
        // presenter.start();
        // App.buttonClick();
    }
}
