#include<iostream>
using namespace std;

int main()
{
    int A[10]={6,9,11,16,18,23,29,36,48,50};
    int l=0,h=9,mid,key;
    cout<<"Enter KEY ";
    cin>>key;
    while(l<=h)
    {
        mid= (l+h)/2;
        if(key==A[mid])
        {
            cout<<"Found at "<<mid;
            return 0;
        }
        else if(key>A[mid])
        {
            l=mid+1;
        }
        else
        h=mid-1;

    }
    cout<<"Not found";
    return 0;
}
