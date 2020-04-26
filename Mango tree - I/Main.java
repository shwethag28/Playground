#include<iostream>
using namespace std;
int main()
{
  int r,c,tree,i,found;
  std::cin>>r>>c>>tree;
  for(i=1;i<=r;i++)
  {
    if(tree==i)
      found=1;
  }
  for(i=r*r;i>(r*r-r);i--)
  {
    if(tree==i)
      found=1;
  }
  for(i=1;i<r*r;i+=r)
  {
    if(tree==i)
      found=1;
  }
  if(found)
    std::cout<<"Yes";
    else 
     std::cout<<"No";
}