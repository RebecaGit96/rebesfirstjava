package AnimalRescue;

public class Main {
    public static void main(String[] args) {
        Dog myAnimal= new Dog();
        System.out.println(myAnimal.name);

        Girl Human= new Girl();
        System.out.println(Human.money);

        DogFood Yummy= new DogFood();
        System.out.println(Yummy.cost);

        Activity play= new Activity();
        System.out.println(play.name);

        Vet v=new Vet();
        System.out.println(v.work);
    }
}
