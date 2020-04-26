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
  std::cout<<"Sum of rows is ";
  for(i=0;i<m;i++)
  { int sum=0;
    for(j=0;j<n;j++)
      sum+=a[i][j];
   std::cout<<sum<<" ";
    if(sum>large) 
    {large=sum;
     num=i;}
  }
  std::cout<<"\nRow "<<num+1<<" has maximum sum";
  large=0; num=0;
  std::cout<<"\nSum of columns is ";
   for(i=0;i<n;i++)
  { int sum=0;
    for(j=0;j<m;j++)
      sum+=a[j][i];
   std::cout<<sum<<" ";
   if(sum>large)
   {large=sum;
    num=i;}
  }
  std::cout<<"\nColumn "<<num+1<<" has maximum sum";
}