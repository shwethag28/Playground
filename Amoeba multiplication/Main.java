#include<iostream>
using namespace std;
int main()
{
  int m,n1=0,n2=1,n3,i,temp;
  std::cin>>m;
  for(i=2;i<m;i++)
  {
    n3=n1+n2;
    n1=n2;
    n2=n3;
  }
  std::cout<<n3;
}