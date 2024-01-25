package src;


public class NationalForest {
    public String name;
    public String location;
    public int acres;

    public NationalForest(){
        this("Unknown", "Unknown", -1);
    }

    public NationalForest(String name) {
        this(name, "Unknown", -1);
    }

    public NationalForest(String name, int acres) {
        this(name, "Unknown", acres);
    }
    public NationalForest(String name, String location, int acres){
        this.name = name;
        this.location = location;
        this.acres = acres;
    }
}
