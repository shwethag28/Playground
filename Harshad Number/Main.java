#include<iostream>
using namespace std;
int main()
{
  int num,n,sum=0;
  std::cin>>num;
  n=num;
  while(n>0)
  {
    sum+=n%10;
    n/=10;
  }
  if(num%sum==0) std::cout<<"Harshad Number";
  else std::cout<<"Not Harshad Number";
}