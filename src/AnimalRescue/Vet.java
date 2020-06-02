package AnimalRescue;

public class Vet extends Rescuer {
    private String name;
    private long money;
    private String work;

    public String getWork(){
        return work;
    }
    public void setWork(String work){
        this.work=work;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
