package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        // create the variable that's capable enough to contain 5 names
        String[] myGroup = new String[5];
        myGroup[0] ="Dmitro";//       ^
        myGroup[1] ="Sueda";//        |
        myGroup[2] ="Max";  //        |
        myGroup[3] ="Wail";//         |
        myGroup[4] ="Hazreta";//      |
       // myGroup[5] ="Muhtar"; we cannot add extra object cuz we already assign size
       // myGroup[-1] ="Adam";cant be negative number, the least is zero
       // System.out.println(myGroup);//hashcode
        System.out.println(Arrays.toString(myGroup));//["Dmitro", "Sueda","Max","Wail", "Hazreta"
        System.out.println("----------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday"};
            //index:        0         1           2           3           4         5          6
        System.out.println(Arrays.toString(days));

        int number = 5;
        if(number<1 ||number >7){
            System.out.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);

        System.out.println("---------------------------");

        String[] months ={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        int num = 5;
        if(num<1 || num >12){
            System.out.println("Invalid number");
             System.exit(0);
        }
        System.out.println(months[num-1]);
    }
}
