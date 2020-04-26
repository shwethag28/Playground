#include<iostream>
using namespace std;
int main()
{
  int item;
  float heat,t_heat;
  std::cin>>item>>heat;
  if(item<=3)
  {
    if(item==2)
      t_heat=heat+(heat*50/100);
    else if(item==3)
      t_heat=2*heat;
    std::cout<<t_heat;
  }
  else
    std::cout<<"Number of items is more";
}