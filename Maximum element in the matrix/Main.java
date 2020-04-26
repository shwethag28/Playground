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
  large=a[0][0];
  for(i=0;i<m;i++)
  { 
    for(j=0;j<n;j++)
    {
      if(a[i][j]>large)
        large=a[i][j];
    }
  }
  std::cout<<"The maximum element is "<<large;
}