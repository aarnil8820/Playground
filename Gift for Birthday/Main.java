#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a;
  b=a;
  a=a%4;
  if(a==0)
  {
    cout<<b <<" is a leap year";
  }
  else
  {
    cout<<b <<" is not a leap year";
  }
}