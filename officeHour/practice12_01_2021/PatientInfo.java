package practice12_01_2021;

public class PatientInfo {

    public static void main(String[] args) {
        String name = "Jake";
        int age = 37;
        char gender = 'M';
        String dateOfBirth = "12/01/1983";
        boolean isMarried = true;
        String phoneNumber ="(123)456-7890";
        boolean hasInsurance = true;
        String insuranceName = "A1234567";
        String employer ="Cydeo";
        double copayWithInsurance = 20.0;
        double copayWithoutInsurance = 250.0;

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("dateOfBirth = " + dateOfBirth);
        System.out.println("dateOfBirth = " + dateOfBirth);
        System.out.println("isMarried = " + isMarried);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("hasInsurance = " + hasInsurance);
        System.out.println("employer = " + employer);
        System.out.println("copayWithInsurance = " + copayWithInsurance);
        System.out.println("copayWithoutInsurance = " + copayWithoutInsurance);

        System.out.println("=======Escape Sequences=======");

        System.out.println("\tname: " + name+"\n\tage: "+ age+"\n\tgender: "+gender);
         if(hasInsurance){
             System.out.println("copayWithInsurance = " + copayWithInsurance);
         }else{
             System.out.println("copayWithoutInsurance = " + copayWithoutInsurance);
         }
    }
}
/*
Create a class named PatientInfo. declare the following variables:

                         1. name (String)
                         2. age (int)
                         3. gender (char)
                         4. date of birth (String)
                         5. isMarried (boolean)
                         6. phone number (String)
                         7. havingInsurance (boolean)
                         8. Insurance number (String)
                         9. Employer (String)
                        10. copayWithInsurance (double)
                        11. copayWithoutInsurance (double)

 */