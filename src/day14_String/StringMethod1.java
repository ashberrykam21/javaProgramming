package day14_String;

public class StringMethod1 {

    public static void main(String[] args) {
        String str1 = "    batch 25   ";
        str1 = str1.trim();// "batch 25" Creates the objects without white spaces


        System.out.println(str1);

        String str2 = "Cydeo School";
        int n1 = str2.indexOf("h");// 8

        System.out.println(n1);

        int n2 = str2.indexOf("ool");//9
        System.out.println(n2);

        String str3 = "Java Programming Language";
        int n3 = str3.indexOf("amm");//to find the index of the repeating letter u need to make it unique otherwise it will return the index of the 1st matching letter in the String

        System.out.println("n3 = " + n3);


        int n4 = str3.indexOf("gua");

        System.out.println("n4 = " + n4);



        int n5 = str3.lastIndexOf("g");
        System.out.println("n5 = "  + n5);

        System.out.println("--------------------");
         String s = "Java Nova Cava Wawa orange";
         int firstA = s.indexOf("a");
         int lastA = s.lastIndexOf("a");
         int secondA = s.indexOf("a ");
         int thirdA = s.indexOf("a C");
        //int forthA = s.indexOf("ava W");
        //int forthA = s.lastIndexOf("av");
        int forthA = s.indexOf("Ca")+1;
        int fifthA = s.lastIndexOf("va")+1;
        int sixthA = s.lastIndexOf("aw");
        int seventhA = s.lastIndexOf("a ");


        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("forthA = " + forthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);


    }
}
