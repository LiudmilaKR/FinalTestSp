package pets.model;

public class Service {
    private Pets curPetList;
    private String path;
    private int currInd;

    public Service(String path) {
        this.path = path;
        currInd = 0;
        curPetList = new Pets();
    }
    
}
