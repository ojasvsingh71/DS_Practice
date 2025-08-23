#include<stdio.h>

int main(){
    int n;
    printf("Enter a number :-\n");
    scanf("%d",&n);

    // Lets check the length of number
    int len=0;
    int temp=n;       // we use a temp variable as we dont want to loose the actual value
    while(temp>0){
        len++;
        temp/=10;
    }

    temp=n;
    int sum=0;
    while(temp>0){
        int bu=1;      
        for(int i=0;i<len;i++){    // calculating individual power of digits
            bu*=temp%10;              // temp%10 dives individual digit and we have used loop to calculate the power
        }
        sum+=bu;                // add the power to sum 
        temp/=10;
    }
    if(sum==n) printf("Armstrong number\n");
    else printf("Not an armstrong\n");

    return 0;
}