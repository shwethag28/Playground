#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int mark[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>mark[i];
  }
  int large=mark[0];
  for(int i=1;i<n;i++)
  {
    if(mark[i]>large)
      large=mark[i];
  }
  std::cout<<large;
}