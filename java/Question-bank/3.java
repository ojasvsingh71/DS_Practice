// 3.	WAP to create class Number with only one private instance variable as a double primitive type, include the following methods isZero(), isPositive(), isNegative( ), isOdd( ), isEven( ), isPrime(), isAmstrong() in this class and all above methods should return boolean primitive type like for isPositive() should return “Positive = True”. 

import java.util.*;

class Number{
    private double num;

    Number(double n){
        this.num=n;
    }

    boolean isZero(){
        return num==0;
    }

    boolean isPositive(){
        return num>0;
    }

    boolean isNegative(){
        return num<0;
    }

    boolean isOdd(){
        return num%2!=0;
    }

    boolean isEven(){
        return num%2==0;
    }   

    boolean isPrime(){
        if(num<=1) return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0) return false;
        }
        return true;
    }

    boolean isAmstrong(){
        int n=(int)num;
        int sum=0,temp=n;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit*digit;
            n/=10;
        }
        return sum==temp;
    }
}

class chonchu3{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        Number number=new Number(n);
        System.out.println("isZero = "+number.isZero());
        System.out.println("isPositive = "+number.isPositive());
        System.out.println("isNegative = "+number.isNegative());
        System.out.println("isOdd = "+number.isOdd());
        System.out.println("isEven = "+number.isEven());
        System.out.println("isPrime = "+number.isPrime());
        System.out.println("isAmstrong = "+number.isAmstrong());
    }
}