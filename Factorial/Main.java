#include<iostream>
int fact(int n)
{ 
  int f=n;
  if(n==0)
    return 1;
  f=f*fact(n-1);
  return f;
}
int main()
{
  int n,result;
  std::cin>>n;
  result=fact(n);
  std::cout<<"The factorial of "<<n<<" is "<<result;
}