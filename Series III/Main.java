#include<iostream>
int main()
{
  int n,x=6,i=0,j=1;
  std::cin>>n;
  do
  {
    std::cout<<x<<" ";
    x+=(5*j);
    i++;
    j++;
  }while(i<n);
}