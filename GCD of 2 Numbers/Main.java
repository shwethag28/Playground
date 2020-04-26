#include<iostream>
int small(int,int);
int gcd(int a,int b)
{
  int s=small(a,b);
  for(int i=s;i>0;i--)
  {
    if(a%i==0 && b%i==0)
      return i;
  }
}
int small(int a,int b)
{
  if(a<b)
    return a;
  else
    return b;
}
int main()
{
  int a,b, result;
  std::cin>>a>>b;
  result=gcd(a,b);
  std::cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<result;
}