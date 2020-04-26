#include<iostream>
int main(){
 int num;
  std::cin>>num;
  for(int i=num-1;i>=1;i--)
   num*=i;
  if(num==0)
    num=1;
  std::cout<<num;
}