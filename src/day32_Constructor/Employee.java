package day32_Constructor;

public class Employee {

        public String name;
        public char gender;
        public String jobTitle;
        public double salary;


        public Employee(String name){
            this.name = name;
        }

        public Employee(String name,char gender){
                this(name);
               // Employee(name);to call another constructor in constructor u can't do it by it's name, u have to use special keyboard with printices
                this.gender=gender;
        }

        public Employee(String name,char gender,String jobTitle){
                this(name,gender);
                this.jobTitle=jobTitle;

        }
        public Employee(String name,char gender,String jobTitle,double salary){
                this(name,gender,jobTitle);
                this.salary = salary;

        }

        /*public void method1(){only a constructor can call another constructor
                this("Aaron")
        }*/


        public String toString() {
                return "Employee{" +
                        "name='" + name + '\'' +
                        ", gender=" + gender +
                        ", jobTitle='" + jobTitle + '\'' +
                        ", salary=" + salary +
                        '}';
        }
}
