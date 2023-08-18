package pets.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Service {
    private Pets curPetList;
    private String path;
    // private int currInd;

    public Service(String path) {
        this.path = path;
        // currInd = 0;
        curPetList = new Pets();
    }
    public Pets currentPetList() {
        return this.curPetList;
    }
    // public int maxId() {
    //     int maxId = 0;
    //     for (Animal animal : curPetList) {
    //         if (animal.getIdAnim() > maxId) maxId = animal.getIdAnim();
    //     }
    //     return maxId;
    // }
    public void putToFile(Animal anim) {
        curPetList.add(anim);
        try (FileWriter writer = new FileWriter(path, true)) {
            writer.append(String.format("%d\n", anim.getIdAnim()));
            writer.append(String.format("%S\n", anim.getTypeAnim()));
            writer.append(String.format("%s\n", anim.getNameAnim()));
            writer.append(String.format("%d\n", anim.getYearBirthdayAnim()));
            writer.append(String.format("%d\n", anim.getAgeAnim()));
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void takeFromFile() {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String idAnim = reader.readLine();
            while (idAnim != null) {
                String typeAnim = reader.readLine();
                String nameAmin = reader.readLine();
                String yearBirthAmin = reader.readLine();
                String ageAnim = reader.readLine();
                if (typeAnim.equals("DOGS")) this.curPetList.add(new Animal(Integer.parseInt(idAnim), nameAmin, 
                    Integer.parseInt(yearBirthAmin), Integer.parseInt(ageAnim), TypeAnim.Dogs));
                    else if (typeAnim.equals("CATS")) this.curPetList.add(new Animal(Integer.parseInt(idAnim), nameAmin, 
                        Integer.parseInt(yearBirthAmin), Integer.parseInt(ageAnim), TypeAnim.Cats));
                        else this.curPetList.add(new Animal(Integer.parseInt(idAnim), nameAmin, Integer.parseInt(yearBirthAmin), 
                            Integer.parseInt(ageAnim), TypeAnim.Hamsters));
                idAnim = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
