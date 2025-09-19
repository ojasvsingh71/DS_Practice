// A transport app supports different types of vehicles such as cars, bikes and buses. All vechicles should have the ability to start and stop. Use the concept of interface and its implementation,

interface ability{

    void start();
    void stop();

    default void type1(String vehicle){
        type2(vehicle);
        System.out.println(vehicle);
    };

    private void type2(String vehicle){
        System.out.println(vehicle);
    };
}

class car implements ability{
    public void start(){
        System.out.println("Car started");
    }
    public void stop(){
        System.out.println("Car Stopped");
    }
}

class bus implements ability{
    public void start(){
        System.out.println("bus started");
    }
    public void stop(){
        System.out.println("bus Stopped");
    }
}

class bike implements ability{
    public void start(){
        System.out.println("bike started");
    }
    public void stop(){
        System.out.println("bike Stopped");
    }
}

class main{
    public static void main(String arg[]){
        ability c=new car();
        ability bus=new bus();
        ability bike=new bike();

        c.start();
        bus.stop();

        c.type1("car");
    }
}