#include <iostream>
 using namespace std;
 
 int sub(int a,int b)
   {
       return a-b;
   }
    int mul( int a,int b) 
    {
        return(a*b);

    }

 int main() 
 { 
     int a,b;
      cout<<"a ";
      cin>>a;
      cout<<"b ";
      cin>>b;
     
    //  cout<<"sub "<<a-b;
    cout<<mul(a,b)<<endl; 
    cout<<sub(a,b); 

 }