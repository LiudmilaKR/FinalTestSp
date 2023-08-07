package animals.model;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Service {
    private ArrayList<HumanFriends> friendsList;
    private String path; 
    // private FileHandler handler;
    private int id;

    public Service(String path) {
        friendsList = takeFromFile();
        this.path = path;
        // handler = new FileHandler();
        this.id = 1;
    }

    private ArrayList<HumanFriends> takeFromFile() {
        try {
            ArrayList<HumanFriends> obj = new ArrayList<>();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            obj = (ArrayList<HumanFriends>)ois.readObject();
            ois.close();
            return obj;
        } catch (Exception e) {
            System.out.println("путь некорректен");
            return null;
        }
    }
}
