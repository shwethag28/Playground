#include<iostream>
using namespace std;
int type(int n,int *p)
{ int i,even=0,odd=0;
  for(i=0;i<n;i++)
  {
    if(*(p+i)%2==0)
      even+=1;
    else
      odd+=1;
  }
 if(even==n) return 1;
 else if(odd==n) return 2;
 else return 3;
}
int main()
{
  int n;
  std::cout<<"Enter the number of elements in the array";
  std::cin>>n;
  int a[n];
  std::cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++)
    std::cin>>a[i];
  int result=type(n,a);
  if(result==1) std::cout<<"\nThe array is Even";
  else if(result==2) std::cout<<"\nThe array is Odd";
  else std::cout<<"\nThe array is Mixed";
}