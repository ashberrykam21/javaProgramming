package day10_NestedIf;

public class NameOfMonth2 {

    public static void main(String[] args) {

        int n = 11;
        String result = "";

       /* if(num>=1 && num<=12){//if the number is valid which is 1~12
            if(num == 1){
                result = "January";
            }else if(num == 2){
                result = "February";
            }else if(num == 3){
                result = "March";
            }else if(num == 4){
                result = "April";
            }else if(num == 5){
                result = "May";
            }else if(num == 6){
                result = "June";
            }else if(num == 7){
                result = "July";
            }else if(num == 8){
                result = "August";
            }else if(num == 9){
                result = "September";
            }else if(num == 10){
                result = "October";
            }else if(num == 11){
                result = "November";
            }else{
                result = "December";
            }

        }else{//if the number is not valid
            result = "Invalid";
        }

        System.out.println("result = " + result);*/

        System.out.println("----------------------------");
       String result1 = n==1? "January" :n==2? "February" :n==3? "March"
               :(n==4)? "April" :(n==5)? "May" :(n==6)? "June" :(n==7)? "July"
               :(n==8)? "August" :(n==9)? "September" :(n==10)? "October"
               :(n==11)? "November" : "December";

        System.out.println(result1);


    }
}
