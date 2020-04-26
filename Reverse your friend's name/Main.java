#include<iostream>
#include<string>
int main() 
{ std::string name;
  std::getline(std::cin,name);
 int len=name.length();
  for(int i=len-1;i>=0;i--)
   std::cout<<name[i];
}