package day41_Exeptions;

import day30_CustomClass.Student;

import java.io.FileInputStream;
import java.util.Locale;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        //---------------------unchecked exeption:

        int a = 10;
        int b = 0;

        //System.out.println(a / b);

       // System.out.println("Wooden Spoon");

        char[] chars = {'A','B','C'};
       // System.out.println(chars[99]);

        Student student = null;
        //System.out.println(student.getName());

        String str = "Wooden Spoon";
        str = null;

       // System.out.println(str.toUpperCase());


        //----------------------checked Exeption:
        System.out.println("Hello");

        //Thread.sleep(3000);
        System.out.println("Cydeo");

        //FileInputStream file = new FileInputStream("path of the file");
        System.out.println("java".charAt(2000));

    }
}
