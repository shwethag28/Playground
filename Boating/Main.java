#include<iostream>
using namespace std;
int main()
{
  int boat,adult,child;
  std::cin>>boat>>adult>>child;
  if((adult*75+child*30)<boat)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}