import java.util.Scanner;

public class Q4{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the String :- ");
        String s=sc.nextLine();

        int n=s.length();
        String rev="";
        for(int i=n-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println("Length of String is :- "+n);
        if(s.equals(rev)) System.out.println("Palindrome String");
        else System.out.println("Not palindrome String");

        System.out.println("Ojasv Singh\n202401100500120");
    }
}