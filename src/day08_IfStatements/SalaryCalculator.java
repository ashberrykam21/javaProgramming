package day08_IfStatements;
public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 65,
                weeklyHours = 40;

        double stateTaxRate = 0,
                federalTaxRate = 26.2;

        //--------------------------------------

        int salaryBeforeTax = hourlyRate * weeklyHours * 52; // salary is equal to one week' salary * 52
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        //-----------------------------------------
        System.out.println("Gross pay is: $" + salaryBeforeTax  );
        System.out.println("State tax = $" + stateTax);
        System.out.println("Federal tax = $" + federalTax );
        System.out.println("Total tax = $" +totalTax );
        System.out.println("Net income = $"+salaryAfterTax);




    }

}

/*
 Create a class called SalaryCalculator.java
			3.1 declare the following variables:
					hourlyRate, weeklyHours, stateTax, federalTax

			3.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax

					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

 */