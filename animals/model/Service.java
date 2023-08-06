package animals.model;

import java.util.ArrayList;

public class Service {
    private ArrayList<HumanFriends> friendsList;
    private String path; 
    private FileHandler handler;
    private int id;

    public Service(String path) {
        friendsList = takeFromFile();
        this.path = path;
        handler = new FileHandler();
        this.id = 1;
    }

    private ArrayList<HumanFriends> takeFromFile() {
        friendsList = handler.loadFromFile(path);
        if (friendsList == null) return new ArrayList<>(); 
        return friendsList;
    }
}
