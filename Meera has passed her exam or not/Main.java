#include<iostream>
int main()
{
  int n,mnum,pass=0;
  std::cin>>n;
  int pnum[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>pnum[i];
  }
  std::cin>>mnum;
  for(int i=0;i<n;i++)
  {
    if(mnum==pnum[i])
    { pass=1;
     break;}
  }
  if(pass==1)
    std::cout<<"She passed her exam";
  else
    std::cout<<"She failed";
}