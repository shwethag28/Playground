#include<iostream>
int main()
{
  int n,x=11,a,i=0;
  std::cin>>n;
  do
  {
    a=x*x;
    std::cout<<a<<" ";
    x+=4;
    i++;
  }while(i<n);
}