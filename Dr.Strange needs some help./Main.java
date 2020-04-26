#include<iostream>
#include<math.h>
int mul(int,int);
int main()
{
  int m,n,req,x;
  std::cin>>m>>n>>req;
  x=mul(m,n);
  if(x>=req)
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}
int mul(int a,int b)
{
  return pow(a,b);
}