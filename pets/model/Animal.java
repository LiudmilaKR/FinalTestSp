package pets.model;

import java.time.Year;

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
        ageAnim = Year.now().getValue() - yearBirthdayAnim;
    }
    public String commands() {
        ComAnim comanda = new ComAnim();
        if (typeAnim == TypeAnim.Dogs) {
            comanda.addAnimalCommand("Сидеть!");
            comanda.addAnimalCommand("Лежать!");
            comanda.addAnimalCommand("Голос!");
        } else if (typeAnim == TypeAnim.Cats) {
            comanda.addAnimalCommand("Кис-кис!");
            comanda.addAnimalCommand("Иди сюда!");
            } else if (typeAnim == TypeAnim.Hamsters) {
                comanda.addAnimalCommand("Прыгать!");
                comanda.addAnimalCommand("Бежать!");
            }
        return comanda.toString();
    }
    @Override
    public String toString() {
        if (typeAnim == TypeAnim.Dogs) return "Домашнее животное собака по кличке " + nameAnim + " [id=" + 
            idAnim + ", yearBirthdayAnim=" + yearBirthdayAnim + ", ageAnim=" + ageAnim + "] выполняет команды: " + commands();
        else if (typeAnim == TypeAnim.Cats) return "Домашнее животное кошка по кличке " + nameAnim + " [id=" + 
            idAnim + ", yearBirthdayAnim=" + yearBirthdayAnim + ", ageAnim=" + ageAnim + "] выполняет команды: " + commands();
            else if (typeAnim == TypeAnim.Hamsters) return "Домашнее животное хомячок по кличке " + nameAnim + " [id=" + 
                idAnim + ", yearBirthdayAnim=" + yearBirthdayAnim + ", ageAnim=" + ageAnim + "] выполняет команды: " + commands();
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
