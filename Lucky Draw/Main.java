#include<iostream>
int main()
{
  int num,i,flag;
  std::cin>>num;
  if(num==1) std::cout<<"Not eligible";
  else
  {
  for(i=2;i<=num/2;i++)
  {
    if(num%i==0)
    { flag=1;
     break;}
  }
  if(flag==1) std::cout<<"Not eligible";
  else std::cout<<"Eligible";
  }
}