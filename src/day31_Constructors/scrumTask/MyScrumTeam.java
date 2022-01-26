package day31_Constructors.scrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {

        //4 testers objects
        Tester tester1 = new Tester("Layan",11,"SDET",125000);
        Tester tester2 = new Tester("Ahmet",15,"QA",143000);
        Tester tester3 = new Tester("Ali",31,"SE",115000);
        Tester tester4 = new Tester("Lala",24,"SDET",155000);

        Tester[] testers ={tester2,tester3,tester4};

        //4 developers objects
        Developer developer1 = new Developer("Olga",23,"Java Developer",133000);
        Developer developer2 = new Developer("Aygun",33,"Java Master",183000);
        Developer developer3 = new Developer("Aysun",45,"Software Developer",1350000);
        Developer developer4 = new Developer("Aaron",28,"Senior Developer",200000);

        Developer[] developers = {developer2,developer3,developer4};

        //1ScrumTeam object
        ScrumTeam scrum = new ScrumTeam("Niagara","Neira", "Hulya", 14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);
        System.out.println(scrum);

        System.out.println("------------------------------");

        for (Tester eachTester : scrum.testersList){
            System.out.println(eachTester.name+ " : " + eachTester.salary);
        }
        System.out.println("-------------------------------");
        for(Developer eachDeveloper : scrum.devopsList){
            System.out.println(eachDeveloper.name+" : "+ eachDeveloper.salary);
        }
        System.out.println("--------------------------------");

        scrum.removeTester(24);

        scrum.removeDeveloper(33);

        System.out.println(scrum);

    }
}
/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers
	                    above to the scrum team


 */