// 8.	Write a Program in JAVA to Find Sum of first ‘n’ Fibonacci Number.
// For Example: when user inputs 5 then output should be 7.

// Test Cases:
// case= 1
// input= 5
// output= 7
 
// case= 2
// input= 7
// output= 20
 
// case= 3
// input= 9
// output= 54

import java.util.*;

class chonchu8{

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n==0 || n==1){
            System.out.println(n);
        }else{
            int sum=1;
            int fib1=0,fib2=1,fib3=1;
            for(int i=3;i<=n;i++){
                fib3=fib2+fib1;
                fib1=fib2;
                fib2=fib3;
                sum+=fib3;
            }
            System.out.println(sum);
        }
    }
}