package pets.view;

import pets.model.Pets;
import pets.model.TypeAnim;

public interface View {
    public void start();
    public void end();
    public void exit();
    void printAnimList(Pets pets);
    public void addAnimal(String name);
    public String getNameAnimal();
    public int getYearBirthAnimal();
    public TypeAnim getTypeAnim();
}
