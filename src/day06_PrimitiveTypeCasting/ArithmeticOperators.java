package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(12 + 1);//13
        System.out.println(10+20);  //30 addition
        System.out.println(100-50);//50, subtraction
        System.out.println(10*6);// 60,multiplication

        System.out.println(100/3);
        System.out.println(10/4);//2
        System.out.println(10.0/4); //2.5
        System.out.println(10/4.0);//2.5
        System.out.println(10d/4);//2.5

        int a = 100;
        double b = a/6; //16.0
        System.out.println(b);
       double c = a/6.0; //16.6666
        //double c = a/6d;
        // double c = (double)a/6



    }


}
/*
+: Addition
-: Subtraction
*: Multiplication
/: Division

           integer / integer ===> integer
           decimal / integer ===> decimal
       in math:
       10/4 = 2.5

       in java:
       10/4 = 2
       10.0/4 =2.5

%: Remainder

 */