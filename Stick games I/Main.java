#include<iostream>
using namespace std;
void print(int i)
{
  if(i%2==0)
    std::cout<<"Mani Iyer";
  else
    std::cout<<"Arun Gupta";
}
int main()
{
  int n,m,i=0;
  std::cin>>n>>m;
  do
  {
    n--;
    m--;
    i++;
  }while(n*m!=0);
  print (i);
}