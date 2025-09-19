interface int1{
    void on();
    void off();
    default void turn(){
        System.out.println("This");
        on1();
    }
    static void st(){
        System.out.println("Static");
        on2();
    }
    private void on1(){
        System.out.println("private");
    }
    private static void on2(){
        System.out.println("Private static");
    }
}

class B implements int1{
    public void on(){
        System.out.println("On");
    }
    public void off(){
        System.out.println("Off");
    }
}

class main{
    public static void main(String arg[]){
        int1 chonchu=new B();
        chonchu.on();
        chonchu.off();
        chonchu.turn();
        int1.st();
    }
}