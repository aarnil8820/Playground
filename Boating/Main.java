#include<iostream>
using namespace std;
int main()
{
  int a,b,s,d;
  cin>>a >>b >>s;
  d=b*75;
  b=s*30;
  s=d+b;
  if(a>=s)
  {
    cout<<"Boat is stable";
  }
  else
  {
    cout<<"Boat will drow";
  }
}