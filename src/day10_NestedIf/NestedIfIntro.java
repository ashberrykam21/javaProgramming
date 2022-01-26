package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 370;

        if(score >= 0 && score <= 100) {// if the score is valid then we gonna check
            if (score >= 60) {//if student pass the exam
                System.out.println("Passed");
            } else {//if student failed
                System.out.println("Failed");
            }
        }else{//if the score is not valid
            System.out.println("Invalid Score");

        }

        System.out.println("-------------");
        int age = 17;
        boolean hasId = true;
        if(hasId) {// if the person has ID
            if (age >= 21) {//if the person is 21 years or older
                System.out.println("Eligible to buy alcohol ");
            } else {//if the person is less than 21
                System.out.println("Not eligible to buy alcohol");
            }
        }else{
            System.out.println("Must have ID to buy alcohol");
        }
        System.out.println("-------------------------");
        int num = 9;

        if(num>=1 && num<=7){//if the number is a valid num 1~7
         // 7 option
            if(num ==1 ){
                System.out.println("Monday");
            }else if(num == 2){
                System.out.println("Tuesday");
            }else if(num==3){
                System.out.println("Wednesday");
            }else if(num == 4) {
                System.out.println("Thursday");
            }else if(num == 5) {
                System.out.println("Friday");
            }else if(num == 6) {
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }


        }else{//if the number is not valid
            System.out.println("Invalid");
        }

    }

}
