package AnimalRescue;
public class Dog extends Animal {
    private String name;
    private int age;
    private int health;
    private int hunger;
    private int mood;
    private String favouriteFood;
    private String favouriteActivity;

    @Override
    public void eat() {
        System.out.println("eating pedigree");
    }

    @Override
    public void run() {
        System.out.println("running with 10 km/h");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping 5 hours per day");
    }
}

