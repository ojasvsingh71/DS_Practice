abstract class A{
    abstract void bu();
    void bu2(){
        System.out.println("Hi\n");
    };
}

class main extends A{
    
    public static void main(String args[]){
        A ob1=new A();
        ob1.bu();
    }
}