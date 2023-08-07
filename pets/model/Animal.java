package pets.model;

public class Animal {
    // конкретное животное
    private int idAnim;
    private String nameAnim;
    private int yearBirthdayAnim;
    private int ageAnim;
    private TypeAnim typeAnim;

    public Animal(int idAnim, String nameAnim, int yearBirthdayAnim, TypeAnim typeAnim) {
        this.idAnim = idAnim;
        this.nameAnim = nameAnim;
        this.yearBirthdayAnim = yearBirthdayAnim;
        this.typeAnim = typeAnim;
        ageAnim = 2023 - yearBirthdayAnim;
    }

    @Override
    public String toString() {
        if (typeAnim == TypeAnim.Dogs) 
        return "Домашнее животное собака по кличке " + nameAnim + " [id=" + idAnim + ", yearBirthdayAnim=" + yearBirthdayAnim
                + ", ageAnim=" + ageAnim + "]";
        else return null;
    }

}
