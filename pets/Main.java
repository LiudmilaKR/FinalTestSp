package pets;

import pets.model.Animal;
import pets.model.Pets;
import pets.model.TypeAnim;
import pets.view.App;

public class Main {
    public static void main(String[] args) {
        Animal an1 = new Animal(1, "Шарик", 2020, TypeAnim.Dogs);
        System.out.println(an1);

        Pets pets1 = new Pets();
        pets1.add(an1);
        System.out.println(pets1);

        new App().buttonClick();
    }
}
