#include<iostream>
int small(int x,int y,int z)
{
  if(x<y && x<z)
    return x;
  else if(y<x && y<z)
    return y;
  else 
    return z;
}
int mygcd(int a,int b,int c,int s)
{
  for(int i=s;i>0;i--)
  {
    if(a%i==0 && b%i==0 && c%i==0)
      return i;
  }
}
int main()
{
  int a,b,c,gcd,s,result;
  std::cin>>a>>b>>c>>gcd;
  s=small(a,b,c);
  result=mygcd(a,b,c,s);
  if(result==gcd) std::cout<<"Answer is correct.";
  else std::cout<<"Answer is wrong.";
}
  