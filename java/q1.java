// Create an abstract class employee with abstarct method calculateSalary(). Extend it in FullTimeEmployee and PartTimeEmployee. And print the salary of each employee. Use scanner class to take input of each salary.

import java.util.Scanner;

abstract class Employee{
    abstract void calculateSalary(int sal);
    
}

class FullTimeEmployee extends Employee{
     void calculateSalary(int sal){
        System.out.println("FullTime :"+sal+"\n");
    }
}

class PartTimeEmployee extends Employee{
     void calculateSalary(int sal){
        System.out.println("PartTime :"+sal+"\n");
    }
}

class main{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int part=sc.nextInt();
        int full=sc.nextInt();

        PartTimeEmployee pt=new PartTimeEmployee();
        FullTimeEmployee ft=new FullTimeEmployee();

        pt.calculateSalary(part);
        ft.calculateSalary(full);
    }
}
