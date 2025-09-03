class Student{
    String name;
    int roll_no;
    String address;

    Student(String name,int roll_no,String address){
        this.name=name;
        this.roll_no=roll_no;
        this.address=address;
    }
}

class Btech_Student extends Student{
    String department;
    int semester;
   
    Btech_Student(String department,int semester){
        super("ojasv",25,"lko");
        
        this.department=department;
        this.semester=semester;
    }
    void display(){
        System.out.println("Name:- "+this.name+"\nRoll_no:- "+this.roll_no+"\nAddress:- "+this.address+"\nDepartment:- "+this.department+"\nSemester:- "+this.semester);
    }
}

class Demo{
    public static void main(String[] args){
        Btech_Student bu=new Btech_Student("csit",3);
        bu.display();

    }
}