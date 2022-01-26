package day33_Statics;

public class Iphone {

    public static String brand = "Apple";
    public String model;
    public double price;
    public static String OS = "iOS";
    public String color;
    public String size;
    public static String madeIn = "China";
    public static boolean hasBattery= true;
    public static boolean isTouchScreen = true;
    public static boolean hasFaceTime = true;

    public static void printModelAndPrice(){
        //System.out.println(model+" : "+price); static methods in java do not accept instances
        System.out.println(brand);// static methods only accepting static variables
    }
    public void method1(){
        System.out.println(model+" : "+price);// instance method accepts instances
        System.out.println(OS);//and accepts static variables
    }

}
