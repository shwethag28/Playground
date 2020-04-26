#include<iostream>
using namespace std;
int main()
{
  int n,i,j,m,value;
  std::cout<<"Enter the number of elements in the array";
  std::cin>>n;
  int a[n+1];
  std::cout<<"\nEnter the elements in the array";
  for(i=0;i<n;i++)
    std::cin>>a[i];
  a[n+1]=0;
  std::cout<<"\nEnter the location where you wish to insert an element";
  std::cin>>m;
  if(m>n) 
  { std::cout<<"\nInvalid Input";
    return 0; }
  std::cout<<"\nEnter the value to insert";
  std::cin>>value;
  for(i=n;i>m-1;i--)
    a[i]=a[i-1];
  a[m-1]=value;
  std::cout<<"\nArray after insertion is\n";
  for(i=0;i<n+1;i++)
    std::cout<<a[i]<<"\n";
}