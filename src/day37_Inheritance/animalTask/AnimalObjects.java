package day37_Inheritance.animalTask;

public class AnimalObjects {
    public static void main(String[] args) {


    Dog dog1 = new Dog("Alex","Huskey",'M',3,"Large","White");
        System.out.println(dog1);
        dog1.bark();

        Cat cat1 = new Cat("Vasya","Siamese",'M',2,"Medium","brown");
        System.out.println(cat1);
        cat1.scratch();

        Parrot parrot1 = new Parrot("Love","Macaw",'F',3,"Small","multicolour");
        System.out.println(parrot1);
        parrot1.sing();
}
}