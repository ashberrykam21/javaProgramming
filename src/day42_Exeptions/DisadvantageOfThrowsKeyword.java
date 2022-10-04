package day42_Exeptions;

public class DisadvantageOfThrowsKeyword {


    public static void main(String[] args) throws InterruptedException {

        System.out.println("hello");

            sleep(2.5);//throw

        System.out.println("Hello world");

        System.out.println("------------------------");

        System.out.println("Hello");

        MorningWorkOut.sleep(2.5);
        System.out.println("Cydeo");

    }

    public static void sleep(double seconds) throws InterruptedException {

        Thread.sleep((long) (seconds * 1000));


    }
}
