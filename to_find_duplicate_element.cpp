//O(n) time complexity
//O(n) space complexity
#include<bits/stdc++.h>
#include<map>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    map<int,int> m;
    for(int i=0;i<n;i++)
    {
        m[arr[i]]++;
    }
    for(auto it:m)
    {
        if(it.second==2)
        {
            cout<<it.first;
        }
    }
}