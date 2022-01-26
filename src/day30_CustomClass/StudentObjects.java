package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Peter",'M',23,2135,'A');

        Student student2 = new Student();
        student2.setInfo("Elizabeth",'F',33,8135,'B');

        Student student3 = new Student();
        student3.setInfo("Mikael",'M',39,7335,'C');

        Student student4 = new Student();
        student4.setInfo("Pitt",'M',43,7798,'A');

        Student student5 = new Student();
        student5.setInfo("Anastasia",'F',37,8539,'A');

        Student[] students = {student1,student2,student3,student4,student5};

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("--------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>();//grade A
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student : students) {
            if(student.grade =='A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }
        }
        System.out.println(earlyBirds);
        System.out.println(angryBirds);
    }
}
