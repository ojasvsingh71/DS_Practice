import java.util.Scanner;

class chonchu{
    public static void main(String arg[]){
        try{
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int c=10/a;
        }catch(Exception err){
            System.out.println(err);
        }
    }
}