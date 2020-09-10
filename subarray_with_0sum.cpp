//O(n) time complexity
//O(n) aux space 
#include<bits/stdc++.h>
#include<set>
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
    set<int> s;
    int flag=0,sum=0;
    for(int i=0;i<n;i++)
    {
        sum += arr[i];
        if(sum==0 || s.find(sum)!=s.end())
        {
            flag=1;
        }
        s.insert(sum);
    }
    if(flag)
    {
        cout<<"true";
    }
    else
    {
        cout<<"false";
    }
    

}