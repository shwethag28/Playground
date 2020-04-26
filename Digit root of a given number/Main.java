#include<iostream>
int sum(int n)
{ 
  int result;
  if(n/10==0)
    return n;
   result=(n%10)+sum(n/10);
   if(result/10==0)
    return result;
   else
    result=sum(result); 
}
int main()
{
  int n, result;
  std::cin>>n;
  result=sum(n);
  std::cout<<result;
}