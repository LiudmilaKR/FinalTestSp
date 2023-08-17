package pets.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Service {
    private Pets curPetList;
    private String path;
    private int currInd;

    public Service(String path) {
        this.path = path;
        currInd = 0;
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
            // for (int i = 0; i < currentBook.count(); i++) {
            //     Contact contact = currentBook.getCotact(i);
            //     writer.append(String.format("%s\n", contact.firstName));
            //     writer.append(String.format("%s\n", contact.lastName));
            //     writer.append(String.format("%s\n", contact.description));
            // }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
