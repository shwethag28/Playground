#include <iostream>
#include<math.h>
int main() 
{
	int num,reverse=0,last;
  std::cin>>num;
  while(num>0)
  {
  last=num%10 ;
    reverse=reverse*10+last;
    num/=10;
  }
  std::cout<<reverse;
	return 0;
}