#include<bits/stdc++.h>
using namespace std;

int maxCrossingSum(vector<int>& arr,int left,int mid,int right){
    int sum=0;
    int leftsum=INT32_MIN;

    for(int i=mid;i>=left;i--){
        sum+=arr[i];
        if(sum>leftsum) leftsum=sum;
    }
    
    sum=0;
    int rightsum=INT32_MIN;

    for(int i=mid+1;i<=right;i++){
        sum+=arr[i];
        if(sum>rightsum) rightsum=sum;
    }

    return leftsum+rightsum;
}

int max_subaary(vector<int>& arr,int left,int right){
    if(left==right) return arr[left];

    int mid=(left+right)/2;

    int leftmax=max_subaary(arr,left,mid);
    int rightmax=max_subaary(arr,mid+1,right);
    int crossmax=maxCrossingSum(arr,left,mid,right);

    return max({leftmax,rightmax,crossmax});
}

int main(){
    int n;
    cin>>n;
    vector<int> nums(n);
    for(int i=0;i<n;i++) cin>>nums[i];
    cout<<max_subaary(nums,0,n-1);
}