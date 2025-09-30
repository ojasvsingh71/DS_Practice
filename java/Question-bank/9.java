// 9.	Write java program to handle custom exception where given the scenario is the user enters a non-numeric value and prompt user to enter a valid number.
// For Example: When user inputs abc then output should be enter a valid number and incase of numeric value output should be inputted value.
// Test Cases:
// case= 1
// input= abc
// output= enter a valid number
 
// case= 2
// input= 17
// output=17
 
// case=3
// input= 21
// output= 21

import java.util.*;

class chonchu9{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        try{
            int n=sc.nextInt();
            System.out.println(n);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}