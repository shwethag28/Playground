#include<iostream>
using namespace std;
int main()
{
  int n,i,even=0,odd=0;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    std::cin>>a[i];
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
      even+=a[i];
    else
      odd+=a[i];
  }
  std::cout<<"The sum of the even numbers in the array is "<<even;
  std::cout<<"\nThe sum of the odd numbers in the array is "<<odd;
}