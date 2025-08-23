#include<iostream>
#include<math.h>
using namespace std;

int main(){
    int n;
    cin>>n;

    int len=0;
    int temp=n;
    while(temp>0){
        len++;
        temp/=10;
    }
    temp=n;
    int sum=0;
    while(temp>0){
        int bu=1;
        for(int i=0;i<len;i++){
            bu*=temp%10;
        }
        sum+=bu;
        temp/=10;
    }
    if(sum==n) cout<<"ArmStrong number\n";
    else cout<<"Not an Armstrong number\n";

    return 0;
}