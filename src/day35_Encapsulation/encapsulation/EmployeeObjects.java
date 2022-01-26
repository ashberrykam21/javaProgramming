package day35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {
        Employee e1 = new Employee("John",'M',27,135000);


        e1.setAge(33);
        System.out.println(e1);

        Employee e2 = new Employee("Elena",'F',37,100000);
        e2.setName("Alena");
        e2.setSalary(e2.getSalary()+15000);
        System.out.println(e2);

    }
}
