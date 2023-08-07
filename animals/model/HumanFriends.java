package animals.model;

public abstract class HumanFriends {
    private int id;
    private String name;
    private int yearBirthday;
    private int age;

    public HumanFriends(int id, String name, int yearBirthday) {
        this.id = id;
        this.name = name;
        this.yearBirthday = yearBirthday;
        age = 2023 - yearBirthday;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYearBirthday() {
        return yearBirthday;
    }

    public int getAge() {
        return age;
    }

    public abstract String commands();
    
    // public String toString() {
    //     return "HumanFriends [id=" + id + ", name=" + name + ", yearBirthday=" + yearBirthday + ", age=" + age + "]";
    // }
    
}
