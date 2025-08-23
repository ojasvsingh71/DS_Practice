import java.util.Scanner;

public class Q3{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the size of array :- ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.print("Enter the elements of array :- ");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        int smallest=arr[0],largest=arr[0];
        for(int i:arr){
            if(i<smallest) smallest=i;
            else if(i>largest) largest=i;
        }
        System.out.println("Largest number in array is :- "+largest);
        System.out.println("Smallest number in array is :- "+smallest);
        System.out.println("Ojasv Singh\n202401100500120");
    }
}