package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123";
        int num= Integer.parseInt(str);// int


        System.out.println(num+1);// calculation 123+1= 124
        System.out.println(str+1);//concating"123"+1 = 1231


        String str2 = "10.5";

        double n = Double.parseDouble(str2);
        System.out.println(n+1);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);


        long max1 = Long.MAX_VALUE;
        long min1 = Long.MIN_VALUE;

        System.out.println("max1 = " + max1);
        System.out.println("min1 = " + min1);


        String s1 = "True";
        boolean r1 = Boolean.parseBoolean(s1);
        System.out.println(r1);

        System.out.println("------------------------");
        String s2 = "123";
        Integer x = Integer.valueOf(s2);// gonna return u an integer

        int y = Integer.valueOf(s2);

        System.out.println(x);
        System.out.println(y);

        String s3 = "1.5";
        Double z = Double.valueOf(s3);
        System.out.println(z);

        System.out.println("------------------------");

        //isDigit
        char ch1 = 'A';
       boolean r2 =  Character.isDigit(ch1);

       boolean r3 = Character.isLetter(ch1);

      boolean r4 = !Character.isLetterOrDigit(ch1);// checks if ot is special character

        boolean r5 = Character.isUpperCase(ch1);
        boolean r6 = Character.isLowerCase(ch1);

        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("--------------------");

        String s = "ab1cd2efg3hi4";

        int sum = 0;

        for(char each : s.toCharArray()){
            if(Character.isDigit(each)){
                sum += Integer.parseInt(""+ each);
            }
        }



    }
}
