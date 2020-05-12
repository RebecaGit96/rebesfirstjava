package AnimalRescue;
public class Dog extends Animal {
    private String name;
    private int age;
    private int health;
    private int hunger;
    private int mood;
    private String favouriteFood;
    private String favouriteActivity;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health=health;
    }
    public int getHunger(){
        return hunger;
    }
    public void setHunger(int hunger){
        this.hunger=hunger;
    }
    public String getFavouriteActivity(){
        return favouriteActivity;
    }
    public void setFavouriteActivity(String favouriteActivity){
        this.favouriteActivity=favouriteActivity;
    }
    }

