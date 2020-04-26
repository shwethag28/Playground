#include<iostream>
using namespace std;
int bus=0;
void queue(int n,int m,int *p)
{ int rem;
  for(int i=0;i<n;i++)
  {
    if (*(p+i)<0)
      continue;
    if(*(p+i)<m)
      rem=m-(*(p+i));
    /*else
      rem=*(p+i)-m;*/
    *(p+i+1)-=rem;
    bus++;
  }
}
int main()
{
  int n,m;
  std::cin>>n>>m;
  int a[n];
  for(int i=0;i<n;i++)
    std::cin>>a[i];
  queue(n,m,a);
  std::cout<<bus;
}