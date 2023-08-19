package pets.model;

public class Counter implements AutoCloseable {
    
    private int number;
    private boolean resourseClosed = false;

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void addCount() throws IllegalStateException {
        if (resourseClosed) {
            throw new IllegalStateException("The counter was closed or used outside of a resourse try.");
        } else number++;
    }
    @Override
    public void close() throws Exception {
        resourseClosed = true;
    }
}
