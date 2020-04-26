#include<iostream>
using namespace std;
int main()
{
  int m,n,i,j,large;
  std::cin>>m>>n;
  int a[m][n];
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
      std::cin>>a[i][j];
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<m-1;j++)
    {
      if(a[j+1][i]>a[j][i])
        large=a[j+1][i];
      else
        large=a[j][i];
    }
    std::cout<<large<<"\n";
  }
}