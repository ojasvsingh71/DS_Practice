import java.util.*;

class MuException extends Exception{
    MuException(){
        super("Person in danger");
    }
}

class chonchu{

    static void doing(String person) throws MuException {
        if(person.equals("Mradul")) {
            throw new MuException();
        }
    }

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String person=sc.next();
        try{
            doing(person);
        }catch( MuException e){
            System.out.println(e);
        }
    }
}