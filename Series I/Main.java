#include<iostream>
int main()
{
  int n,i=0;
  float x=0.5;
  std::cin>>n;
  do
  {
    std::cout<<x<<" ";
    x+=(x*2);
    i++;
  }while(i<n);
}