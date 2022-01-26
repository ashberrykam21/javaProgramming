package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Maximus","Husky",'M',2,"Large","White");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Vasya","British",'M',2,"Medium","brown");
        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        cat.meow();
        cat.scratch();
        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'M',5,"Large","Orange");
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();
        tiger.hunt();
        tiger.roar();
        System.out.println(tiger);
    }
}
