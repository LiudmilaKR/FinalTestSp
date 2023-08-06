package animals.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class FileHandler {
    public void putToFile(Serializable ser, String Path) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Path));
            oos.writeObject(ser);
            oos.close();
        } catch (Exception e) {
            e.getMessage();
        }
        
    }

    public ArrayList<HumanFriends> loadFromFile(String Path) {
        try {
            ArrayList<HumanFriends> obj = new ArrayList<>();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Path));
            obj = (ArrayList<HumanFriends>)ois.readObject();
            ois.close();
            return obj;
        } catch (Exception e) {
            System.out.println("путь некорректен");
            return null;
        }
    }
}
