package day24_CustomMethod_Return;

public class WarmupTask {

    public static void main(String[] args) {

      initials("Cydeo", "School");
        System.out.println("---------------------");
        domain("kamstr23@gmail.com");
        System.out.println("----------------");
        String[] emails = {"santd@gmail.com","jimichoo@yahoo.com","trade@google.com","frade33@hotmail.com"};

        for (String email : emails) {
            domain(email);
        }
        System.out.println("---------------");

        nameOfMonth(11);
        System.out.println("------------------");
        nameOfDay(5);
        System.out.println("-------------");
        daysInMonth(2);

    }


    //1. Create a method that can display the initials of the person
    public static void initials(String firstName, String lastName){

        String initials = firstName.charAt(0)+"."+lastName.charAt(0);
        initials = initials.toUpperCase();
        System.out.println(initials);



        }

    //2. Create a method that can display the domain of the email

    public static void domain(String email){
        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf(".") );
        System.out.println(domain);
    }

   // 3. Create a method that can display the name of the month based on the given number to the method


    public static void nameOfMonth(int number){
        String name ="";
        if(number >=1 && number<=12){
            name =(number ==1)? "January": (number ==2)? "February" :(number ==3)?"March"
                    : (number ==4)? "April" :(number ==5)?"May" : (number ==6)? "June"
                    :(number ==7)?"July": (number ==8)? "August" :(number ==9)?"September"
                    : (number ==10)? "October" :(number ==11)?"November" : "December";
        }else{
            name = "Invalid";
        }
        System.out.println("Month name is: "+name);
    }

    //4. Create a method that can print the name of the day based on the given number to the method

    public static void nameOfDay(int number){
        String day = "";
        if(number>=1 && number<=7){
            day = (number == 1)? "Monday":(number==2)?"Tuesday":(number==3)?"Wednesday"
                    :(number==4)?"Thursday":(number==5)?"Friday":(number==6)?"Saturday":"Sunday";
        }else{
           day = "Invalid";
        }
        System.out.println(day);
    }


    //5. Create a method that can print how many days a month has

    public static void daysInMonth(int number){
        boolean has28Days = number == 2;
        boolean has30Days = number ==4 ||number ==6||number==9||number==11;
        boolean has31Day = !has28Days && !has30Days;
        String month = "";
        if(number>=1 && number<=12) {
            month = (has28Days)? "This month has 28 days" :(has30Days)? "This month has 30 days" : "This month has 31 day";
        }else{
           month = "Invalid";
        }
        System.out.println(month);


    }

}
/*
1. Create a method that can display the initials of the person

2. Create a method that can display the domain of the email

3. Create a method that can display the name of the month based on the given number to the method

4. Create a method that can print the name of the day based on the given number to the method

5. Create a method that can print how many days a month has
 */