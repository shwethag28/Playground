#include<iostream>
int main()
{
   int r,c;
  std::cin>>r>>c;
  int a[r][c],b[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
      std::cin>>a[i][j];
  }
  
  for(int i=0;i<c;i++)
  {
    for(int j=0;j<r;j++){
      b[i][j]=a[j][i];
      std::cout<<b[i][j]<<" ";
    }
    std::cout<<"\n";
  }
}