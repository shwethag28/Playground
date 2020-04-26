#include<iostream>
using namespace std;
int main()
{
  std::string str1,str2;
  std::cin>>str1>>str2;
  if(str1==str2)
    std::cout<<"It is correct";
  else
    std::cout<<"It is wrong";
}