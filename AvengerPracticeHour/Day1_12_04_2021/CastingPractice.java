package Day1_12_04_2021;

public class CastingPractice {

    public static void main(String[] args) {
         // byte to short
        byte b1 = 10;
        short s = b1;//implicit casting

        //double to int
        double d = 5.3;
        int i = (int) d;
        System.out.println(i);//explicit casting

        //long to int

        long l = 9999999999l;
        int k = (int) l;
        System.out.println(k);

        double a = 12.12;
        short b =(byte)a;
        byte c = (byte)b;


    }
}
