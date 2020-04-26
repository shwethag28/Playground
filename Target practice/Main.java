#include<iostream>
using namespace std;
int main()
{
  int t,s,ts=0,i=0;
  std::cin>>t>>s;
  while (ts<t)
  { ts+=s;
    std::cin>>s;
    i++;
   //if(ts>=t) break;
  }
  std::cout<<"The number of turns is "<<i;
}