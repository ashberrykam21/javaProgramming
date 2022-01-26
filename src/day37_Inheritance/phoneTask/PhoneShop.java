package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {


        Iphone iphone1 = new Iphone("Iphone 12","6.7 inches",925,"golden");

        Samsung samsung1 = new Samsung("Galaxy S19","6 inches",900,"White");

        Nokia nokia1 = new Nokia("Brick", "4 inches",50,"Black");


        System.out.println(iphone1);
        System.out.println(samsung1);
        System.out.println(nokia1);

        iphone1.call(911);
        iphone1.text(122345689);
        iphone1.faceTime("yshoo@mail.com");
        iphone1.faceTime(122335589);


        System.out.println("--------------------------------");

        samsung1.call(911);
        samsung1.text(122345689);
        samsung1.freeze();

        System.out.println("--------------------------------");


        nokia1.call(1223455670);
        nokia1.text(987876554);
        nokia1.selfDefense();
    }
}
