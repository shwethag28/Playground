#include<iostream>
void swap(int &x,int &y)
{
  int temp;
  temp=x;
  x=y;
  y=temp;
}
int main()
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b;
  swap (a,b);
  std::cout<<"\nAfter swapping a= "<<a<<" and b="<<b;
}