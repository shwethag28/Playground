#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int ch;
  float a,days;
  std::cin>>ch;
  a=1/(sqrt(ch));
  days=ch+(a*ch);
  std::cout<<int(days+1);
}