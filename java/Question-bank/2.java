// 2.	WAP to count the number of charcters in a given string, to reverse the string and check whether it is palindrome or not? 

import java.util.*;

class chonchu2{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        String rev="";
        System.out.println("Number of characters : "+n);
        for(int i=n-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome"); 
        }
    }
}