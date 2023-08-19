package pets.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Service {
    private Pets curPetList;
    private String path;

    public Service(String path) {
        this.path = path;
        curPetList = new Pets();
    }
    public Pets currentPetList() {
        return this.curPetList;
    }
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
                reader.readLine();
                if (typeAnim.equals("DOGS")) this.curPetList.add(new Animal(Integer.parseInt(idAnim), nameAmin, 
                    Integer.parseInt(yearBirthAmin), TypeAnim.Dogs));
                    else if (typeAnim.equals("CATS")) this.curPetList.add(new Animal(Integer.parseInt(idAnim), nameAmin, 
                        Integer.parseInt(yearBirthAmin), TypeAnim.Cats));
                        else this.curPetList.add(new Animal(Integer.parseInt(idAnim), nameAmin, Integer.parseInt(yearBirthAmin), 
                            TypeAnim.Hamsters));
                idAnim = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
