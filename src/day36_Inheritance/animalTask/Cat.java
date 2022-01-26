package day36_Inheritance.animalTask;

public class Cat extends Animal{

    public void meow(){
        System.out.println(name+" is meowing");
    }
    public void scratch(){
        System.out.println(name+" is scratching");
    }

}
/*
Cat:
      6 variables inherited from animal
      6 methods  inherited from animal
 */