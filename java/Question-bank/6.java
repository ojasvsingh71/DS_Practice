// 6.	WAP to create a class Employee with a method called calculateSalary(). Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.

class Employee{
    void calculateSalary(){};
}

class Manager extends Employee{
    void calculateSalary(){
        System.out.println("Manager salary");
    }
}

class Programmer extends Employee{
    void calculateSalary(){
        System.out.println("Programmer salary");
    }
}

class chonchu6{
    public static void main(String arg[]){
        Employee m=new Manager();
        Employee p=new Programmer();

        m.calculateSalary();
        p.calculateSalary();
    }
}