package animals.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Service {
    private ArrayList<HumanFriends> currFriendsList;
    public ArrayList<HumanFriends> getCurrFriendsList() {
        return currFriendsList;
    }

    private String path; 
    // private FileHandler handler;
    private int currId;

    public Service(String path) {
        // currFriendsList = takeFromFile();
        currFriendsList = new ArrayList<>();
        this.path = path;
        // handler = new FileHandler();
        currId = 0;
        // currFrie
    }

    // пока не знаю, нужно ли то
    public HumanFriends currFriend() {
        if (currId > 0) return null;
        return null;
    }

    public void loadFromFile() {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String group = reader.readLine();
            while (group != null) {
                // int id = Integer.parseInt(reader.readLine());
                // String name = reader.readLine();
                // int ybirth = Integer.parseInt(reader.readLine());
                // int age = Integer.parseInt(reader.readLine());
                // this.currFriendsList.add(new HumanFriends(id, name, ybirth));      

                // this.currentBook.add(new Contact(group, lname, description));
                group = reader.readLine();
            }
            reader.close();
            fr.close();
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // private ArrayList<HumanFriends> takeFromFile() {
    //     friendsList = handler.loadFromFile(path);
    //     if (friendsList == null) return new ArrayList<>(); 
    //     return friendsList;
    // }

    // Cкопировала из Файлхендлера
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
            // obj = (ArrayList<HumanFriends>)ois.readObject();
            ois.close();
            return obj;
        } catch (Exception e) {
            System.out.println("путь некорректен");
            return null;
        }
    }
}
