package day44_Abstraction.animalTask;

public interface Playable {

    boolean isFriendly = true;// it is final by default
    /*                          // it is static by default
    public static void method(){
        System.out.println(isFriendly);//by calling in static method isFriendly method, proves that isFriendly is static variable
    }

     */

    void play();// we don't need to put PUBLIC cuz its given by default
                // we don't need to give ABSTRACT keyword, cuz it is given by default
    //public abstract void play();
}
