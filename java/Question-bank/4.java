// 4.	WAP to create a Room class, the attributes of this class are roomno, roomtype, roomarea and ACmachine. In this class the member functions are setData and displayData. Use member function to set data and display that data using displayData() method. 

import java.util.*;

class Room{
    int roomno;
    String roomtype;
    int roomarea;
    String ACmachine;

    void setData(int roomno,String roomtype,int roomarea,String ACmachine){
        this.roomno=roomno;
        this.roomtype=roomtype;
        this.roomarea=roomarea;
        this.ACmachine=ACmachine;
    }

    void displayData(){
        System.out.println(this.roomno+"\n"+this.roomtype+"\n"+this.roomarea+"\n"+this.ACmachine);
    }
}

class chonchu4{
    public static void main(String arg[]){
        Room r=new Room();
        r.setData(1,"Hall",50,"chonchu");
        r.displayData();
    }
}