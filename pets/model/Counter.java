package pets.model;

public class Counter {
    private int number;

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    // public Counter() {
    //     number = 4;
    // }
    public void addCount() {
        number++;
    }
}
