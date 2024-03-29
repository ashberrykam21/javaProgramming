package day44_Abstraction.animalTask;

public class Eagle extends Animal implements WildAnimal,Flyable{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats snake");
    }
    public void hunt(){
        System.out.println(getName()+" hunts snake");
    }
    public void fly(){
        System.out.println(getName()+" can fly 50 km/hour");
    }
}
