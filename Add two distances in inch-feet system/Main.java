#include<iostream>
using namespace std;
struct dist{
  int ft;
  float in;
}d1,d2,d;
int main()
{
  std::cin>>d1.ft>>d1.in>>d2.ft>>d2.in;
  d.ft=d1.ft+d2.ft;
  d.in=d1.in+d2.in;
  if(d.in>=12)
  { d.in=12-d.in;
    d.ft++; 
  std::cout<<d.ft<<"'"<<d.in<<"\""; }
  else
    std::cout<<d.ft<<"'-"<<d.in<<"\"";
}