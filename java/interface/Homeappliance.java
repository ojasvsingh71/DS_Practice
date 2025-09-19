interface SmartDevice{
    void turnOn();
    void turnOff();
    void getStatus();
}

class SmartThermostat implements SmartDevice{
    public void turnOn(){
        System.out.println("SmartThermostat on");
    }

    public void turnOff(){
        System.out.println("SmartThermostat off");
    }

    public void getStatus(){
        System.out.println("Status of SmartThermostat");
    }

}

class SmartLight implements SmartDevice{
    public void turnOn(){
        System.out.println("SmartLight on");
    }

    public void turnOff(){
        System.out.println("SmartTLight off");
    }

    public void getStatus(){
        System.out.println("Status of SmartLight");
    }
    
}

class SmartLock implements SmartDevice{
    public void turnOn(){
        System.out.println("SmartLock on");
    }

    public void turnOff(){
        System.out.println("SmartLock off");
    }

    public void getStatus(){
        System.out.println("Status of SmartLock");
    }
    
}

class Main {
    public static void main(String arg[]){
        SmartLight light=new SmartLight();
        SmartLock lock=new SmartLock();
        SmartThermostat thermo=new SmartThermostat();

        thermo.turnOn();
        light.turnOff();
        lock.getStatus();
    }
}