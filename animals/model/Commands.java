package animals.model;

public class Commands {
    String command;

    public Commands(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return command;
    }
}
