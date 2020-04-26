#include<iostream>
using namespace std;
int main()
{
  int sun,mon,tue,wed,thu,fri,sat,salary;
  std::cin>>sun>>mon>>tue>>wed>>thu>>fri>>sat;
  salary=(sun+mon+tue+wed+thu+fri+sat)*100;
  salary+=(sun*100*0.5)+(sat*100*0.25);
  if(mon>8) salary+=(mon-8)*15;
  if(tue>8) salary+=(tue-8)*15;
  if(wed>8) salary+=(wed-8)*15;
  if(thu>8) salary+=(thu-8)*15;
  if(fri>8) salary+=(fri-8)*15;
  std::cout<<salary;
}