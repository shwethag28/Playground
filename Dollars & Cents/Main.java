#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2,d,c;
  std::cin>>d1>>c1>>d2>>c2;
  d=d1+d2;
  c=c1+c2;
  if(c>=100)
  {
    c-=100;
    d+=1;
  }
  std::cout<<d<<"\n"<<c;
}