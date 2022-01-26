package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer = new Developer("Aaron",29,'M',12,"Java developer",165000);


        Tester tester = new Tester("Alena",25,'F',13,"SDET",125000);


        Teacher teacher = new Teacher("Daniel",35,'M',14,"Math Teacher",100000);

        Student student = new Student("Karina",23,'F',91,"IT Technology");


        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("------------------------------------");

        developer.setAge(39);
        System.out.println(developer.getAge());
        System.out.println(developer);


        developer.work();
        tester.work();
        teacher.work();

        System.out.println("------------------------------------");

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBugs();

        System.out.println("------------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();

        tester.createTicket();

        System.out.println("------------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

        System.out.println("------------------------------------");

        student.eat();
        student.drink();
        student.sleep();

        student.study();

    }
}
/*
 Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student

            test all the functions of each objects

            Analyze the relationships between the classes
 */