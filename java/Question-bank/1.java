// 1.	WAP to Find largest and smallest numbers in an array with test case array is empty or not.

import java.util.*;

class chonchu1{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int mini=Integer.MAX_VALUE,maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            if(array[i]<mini) mini=array[i];
            if(array[i]>maxi) maxi=array[i];
        }
        System.out.println("Smallest element : "+mini+"\n"+"Largest element : "+maxi);
    }
}