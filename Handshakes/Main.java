#include<iostream>
using namespace std;
int main()
{
  int num,n,i,j,handshake=0;
  std::cin>>num;
  n=num;
  for(i=1;i<num;i++)
  {
    for(j=1;j<n;j++)
      handshake++;
    n--;
  }
  std::cout<<handshake;
}