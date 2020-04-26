#include<iostream>
using namespace std;
int power(int a,int n)
{
  if(n==0)
    return 1;
  int result=a*power(a,n-1);
  return result;
}
int main()
{
  int a,n,result;
  std::cout<<"Enter the value of a";
  std::cin>>a;
  std::cout<<"\nEnter the value of n";
  std::cin>>n;
  result=power(a,n);
  std::cout<<"\nThe value of "<<a<<" power "<<n<<" is "<<result;
}