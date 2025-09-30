// Write a program in java using switch case, which takes input from the user and displays the Day of the Week as per the number. 
// For Example: when user inputs 3, then output should be Wednesday. or when user inputs 0, then output should be InvalidDay.
// Test Case:
// case= 1
// input= 1
// output= Monday 
// case= 2
// input= 0
// output=InvalidDay 
// case= 3
// input= 3
// output= Wednesday

import java.util.*;

class chonchu7{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("InvalidDay");
        }
    }
}