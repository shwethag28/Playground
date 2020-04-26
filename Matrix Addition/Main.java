#include<iostream>
using namespace std;
int main()
{
  int m,n,i,j,large=0,num;
  std::cin>>m>>n;
  int a[m][n],b[m][n];
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
      std::cin>>a[i][j];
  }
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
      std::cin>>b[i][j];
  }
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      a[i][j]+=b[i][j];
    std::cout<<a[i][j]<<" ";
    }
    std::cout<<"\n";
  }
}