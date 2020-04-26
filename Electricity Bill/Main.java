#include<iostream>
using namespace std;
int main()
{
   int units,bill;
  std::cin>>units;
  if(units<=200)
    bill=units*0.5;
  else if(units<=400)
    bill=units*0.65+100;
  else if(units<=600)
    bill=units*0.80+200;
  else
    bill=units*1.25+425;
  std::cout<<"Rs."<<bill;
}