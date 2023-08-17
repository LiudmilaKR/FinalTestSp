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
    public String toDo() {
        if (typeAnim == TypeAnim.Dogs) return "сидеть, лежать, голос!";
        else if (typeAnim == TypeAnim.Cats) return "кис-кис, иди сюда, голос!";
            else if (typeAnim == TypeAnim.Hamsters) return "прыгать, бежать, голос!";
                else return null;
    }
    @Override
    public String toString() {
        if (typeAnim == TypeAnim.Dogs) return "Домашнее животное собака по кличке " + nameAnim + " [id=" + 
            idAnim + ", yearBirthdayAnim=" + yearBirthdayAnim + ", ageAnim=" + ageAnim + "]\n\tвыполняет команды: " + toDo();
        else if (typeAnim == TypeAnim.Cats) return "Домашнее животное кошка по кличке " + nameAnim + " [id=" + 
            idAnim + ", yearBirthdayAnim=" + yearBirthdayAnim + ", ageAnim=" + ageAnim + "]\n\tвыполняет команды: " + toDo();
            else if (typeAnim == TypeAnim.Hamsters) return "Домашнее животное хомячок по кличке " + nameAnim + " [id=" + 
                idAnim + ", yearBirthdayAnim=" + yearBirthdayAnim + ", ageAnim=" + ageAnim + "]\n\tвыполняет команды: " + toDo();
                else return null;
    }
    public int getIdAnim() {
        return idAnim;
    }
    public String getNameAnim() {
        return nameAnim;
    }
    public int getYearBirthdayAnim() {
        return yearBirthdayAnim;
    }
    public int getAgeAnim() {
        return ageAnim;
    }
    public TypeAnim getTypeAnim() {
        return typeAnim;
    }
}
