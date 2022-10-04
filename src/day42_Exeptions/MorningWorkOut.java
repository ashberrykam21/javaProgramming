package day42_Exeptions;

public class MorningWorkOut {


    public static void main(String[] args) {

        System.out.println("----------Push ups started----------");

        for (int i = 1; i <=30; i++) {
        System.out.println("\rPush up "+i);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
        System.out.println("\n----------Push ups completed----------");


        System.out.println("----------Pull ups started----------");

        for (int i = 1; i <=20; i++) {
            System.out.println("\rPull up "+i);
            sleep(2.5);
        }
        System.out.println("/n----------Pull ups completed----------");
    }
    public static void sleep(double seconds){

        try {
            Thread.sleep((long)(seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
1. Do 30 push-ups and try pausing 1.5 seconds in each


        2. Do 20 Pull-ups and try pausing 2.5 seconds in each
 */