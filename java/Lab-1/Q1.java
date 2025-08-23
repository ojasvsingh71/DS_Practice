import java.util.Scanner;

public class Q1{
    public static void  main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 3 numbers :- ");
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.print("The greatest number is :- ");
        if(a>b){
            if(a>c) System.out.println(a);
            else System.out.println(c);
        }else{
            if(b>c) System.out.println(b);
            else System.out.println(c);
        }
        System.out.println("Ojasv Singh\n202401100500120");
    }
};