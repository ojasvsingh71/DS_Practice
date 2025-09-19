#include <iostream>
#include <vector>
#include <algorithm>
#include<unordered_set>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    long long n,k;
    cin>>n>>k;
    vector<long long> nums(n);
    long long mini,maxi;
    for(int i=0;i<n;i++){
        cin>>nums[i];
    }
    sort(nums.begin(),nums.end());
    

    if((maxi-mini) <= k){
        cout<<0<<"\n";
    }else cout<<(maxi-mini)-k<<"\n";



}