package AnimalRescue;

public class Main {
    public static void main(String[] args) {
        Dog myAnimal= new Dog();
        myAnimal.setName("oli");
        myAnimal.setAge(4);
        myAnimal.setHealth(100);
        myAnimal.setHunger(50);
        myAnimal.setMood(100);
        myAnimal.setFavouriteFood("pedigree");
        myAnimal.setFavouriteActivity("running");

        System.out.println(myAnimal.getName());
        System.out.println(myAnimal.getAge());
        System.out.println(myAnimal.getHealth());
        System.out.println(myAnimal.getHunger());
        System.out.println(myAnimal.getMood());
        System.out.println(myAnimal.getFavouriteFood());
        System.out.println(myAnimal.getFavouriteActivity());

        Girl Human= new Girl();
        Human.setName("Rebeca");
        Human.setMoney(1000);
        System.out.println(Human.getname());
        System.out.println(Human.getMoney());

        DogFood Yummy= new DogFood();
        Yummy.setName("Pedigree");
        Yummy.setCost(50);
        Yummy.setAmount(1000);
        Yummy.setAvailability(50);
        System.out.println(Yummy.getName());
        System.out.println(Yummy.getCost());
        System.out.println(Yummy.getAmount());
        System.out.println(Yummy.getAvailability());

        Activity play= new Activity();
        play.setName("running");
        System.out.println(play.getName());

        Vet v=new Vet();
        v.setName("John");
        v.setWork("healing");
        System.out.println(v.getName());
        System.out.println(v.getWork());

        Cat cleo= new Cat();
        cleo.setName("cleo");
        
        Dog oli=new Dog();
        oli.setMood(3);
    }
}
