package AnimalRescue;

public class DogFood {
    private String name;
    private int cost;
    private int amount;
    private int availability;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getCost(){
        return cost;
    }
    public void setCost(int cost){
        this.cost=cost;
    }
    public int getAmount(){
        return amount;
    }
    public void setAmount(int amount){
        this.amount=amount;
    }
    public int getAvailability(){
        return availability;
    }
    public void setAvailability(int availability){
        this.availability=availability;
    }
}
