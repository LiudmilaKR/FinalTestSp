package pets.view;

import pets.model.TypeAnim;

public interface View {
    public void start();
    public void end();
    public void exit();
    // public void launchMenu();
    void printAnimList();
    public void addAnimal(String name);
    public String getNameAnimal();
    public int getYearBirthAnimal();
    public TypeAnim getTypeAnim();
}
