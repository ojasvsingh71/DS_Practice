class A{
    private int a;

    public void seta(int a){
        this.a=a;
    }

    public int geta(){
        return a;
    }
}

class main{
    public static void main(String arg[]){
        A bu=new A();
        bu.seta(69);
        System.out.println(bu.geta());
    }
}