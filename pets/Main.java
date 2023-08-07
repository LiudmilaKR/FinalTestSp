package pets;

import pets.model.Animal;
import pets.model.TypeAnim;
import pets.view.App;

public class Main {
    public static void main(String[] args) {
        Animal an1 = new Animal(1, "Шарик", 2020, TypeAnim.Dogs);
        System.out.println(an1);

        App.buttonClick();
    }
}
