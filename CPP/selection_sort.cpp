#include <bits/stdc++.h>
using namespace std;

void swap(int* a, int* b){
    int temp= *a;
    *a=*b;
    *b=temp;
};

void selection_sort(int a[],int size){
    if(size==0) {cout<<"Array is empty"<<endl; return;}
    else if(size==1) return;

    for(int i=0;i<size;i++){
        int min_index=i;
        for(int j=i+1;j<size;j++){
            if(a[min_index]>a[j]) min_index=j;
        }

        if(i!=min_index) swap(&a[min_index],&a[i]);
    }

};

int main()
{
    int arr[] = {1, 5, 78, 32, 7};
    int size= sizeof(arr)/sizeof(arr[0]);

    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
    
    selection_sort(arr,size);

    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}