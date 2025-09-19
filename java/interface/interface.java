interface A{
    void branch();
    void dept(String dept);
    String s="CSIT";
}

class B implements A{
    public void branch(){
        System.out.println("hi");
    }
    public void dept(String dept){
        System.out.println(dept);
    }

    public static void main(String arg[]){
        A ob=new B();
        ob.branch();
        ob.dept("CSIT");
        System.out.println(ob.s);
    }
}