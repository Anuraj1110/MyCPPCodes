// # : preprocessor
#include<iostream>
using namespace std;

// fucntions:
void print1(int a, int b)
{
    cout<<"value1: "<<a<<endl;
    cout<<"value2: "<<b;
}

// function return type: int/float/double/string/int * /long /long long/ unsinge
int sum(int a, int b)
{
    return a+b;
}

int main()
{
    int value1, value2;
    // cin>>: input
    // cout<<: output
    cout<<"Enter value1: ";
    cin>>value1;
    cout<<"Enter value2: ";
    cin>>value2;
    
    // cout<<"OUTPUT: "<< sum(value1,value2);
    print1(value1,value2);

    // cout<<endl<<c;
}