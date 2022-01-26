package day38_Inheritance.carClass;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry",2020,20000,"Grey",123000);

        Tesla tesla = new Tesla("Model S",2021,94900,"White",12000);

        BMW bmw = new BMW("X5",2022,35000,"Blue",1005);


        toyota.start();
        tesla.start();
        bmw.start();
    }
}
