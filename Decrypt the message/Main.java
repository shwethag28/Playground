#include<iostream>
using namespace std;
int main()
{
  int enc,ter,temp=0;
  std::cin>>enc>>ter;
  int sum=enc+ter;
  for(int i=1;i<sum;i++)
  {
    if(sum%i==0) temp+=i;
  }
  if(sum==temp) std::cout<<"They can read the message";
  else std::cout<<"They can't read the message";
}