package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {



    int score = 95;

        if(score>=0 && score <= 100){
        // 5 possibilities
        if(score>=90){// false if the score is <90
            System.out.println("Excellent");
        }else if(score>=80){//false if score<80
            System.out.println("Great");
        }else if(score>=70){// false if the score< 70
            System.out.println("Good");
        }else if(score>=60 ){// if the score < 60
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

    }else{//if score is NOT valid just 1 possibility
        System.out.println("Invalid");
    }

        System.out.println("--------------------------");

        String result = (score>=0 && score <= 100)? (score>=90)? "Excellent"
                       :(score>=80)? "Great" :(score>=70)? "Good"
                       :(score>=60)?"Passed" : "Failed" : "Invalid";
        System.out.println(result);


        
}
}
