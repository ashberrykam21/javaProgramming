package day30_CustomClass;

import java.util.ArrayList;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Jack",'M', 35,2533,"QA",120000, true);

        Employee employee2 = new Employee();
        employee2.setInfo("Rose",'F', 29,3544,"QA",125000,true);

        Employee employee3 = new Employee();
        employee3.setInfo("Oliver",'M', 37,5545,"Developer",70000,false);

        Employee employee4 = new Employee();
        employee4.setInfo("Maya",'F', 25,2554,"BA",135000,true);

        Employee employee5 = new Employee();
        employee5.setInfo("Noelia",'F', 39,7543,"Designer",65000,false);

        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};

        int countFullTime = 0;
        int countPartTime=0;
        double max = employees[0].salary;
        double min = employees[0].salary;

        for (Employee each : employees) {
            if(each.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }
            if(each.salary >max){
                max = each.salary;
            }
            if(each.salary < min){
                min = each.salary;
            }
        }
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);



    }
}
