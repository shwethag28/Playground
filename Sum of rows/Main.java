#include<iostream>
using namespace std;
int main()
{
  int m,n,i,j,large=0,num;
  std::cin>>m>>n;
  int a[m][n];
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
      std::cin>>a[i][j];
  }
  for(i=0;i<m;i++)
  { int sum=0;
    for(j=0;j<n;j++)
      sum+=a[i][j];
   std::cout<<sum<<"\n";
  }
  
}