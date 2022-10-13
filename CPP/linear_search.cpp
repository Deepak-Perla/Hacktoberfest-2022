#include <iostream>

using namespace std;
bool search(int arr[],int size,int key){
    for(int i=0;i<size;i++){
        if (key==arr[i])
        {
            return true;
        }
        
    }
    return false;
}
int main()
{
    int arr[1000]; //making array
    int key,size;
   cout<<"enter the size of array"<<endl;
    cin >>size;
    for(int i=0;i<size;i++){
        cin>>arr[i];
    }
     cout<<"enter the number you want to search"<<endl;
    cin >> key;

    
    
    bool found=search(arr,size,key);
    if(found)
    {
        cout<<"your number is found";
    }
    else{
        cout<<"your number is not found";
    }
}
