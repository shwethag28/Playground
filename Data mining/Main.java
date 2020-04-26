#include<iostream>
using namespace std;
int main()
{
  int num,rem,even=0,odd=0;
  std::cin>>num;
  while (num>0)
  {
    rem=num%10;
    if(rem%2==0)
      even+=rem;
    else
      odd+=rem;
    num/=10;
  }
  if(even==odd) std::cout<<"Yes";
  else std::cout<<"No";
}