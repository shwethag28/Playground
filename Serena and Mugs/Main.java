#include<iostream>
using namespace std;
int printresult(int *p,int n,int s)
{ int sum=0;
  for(int i=0;i<n;i++)
    sum+=*(p+i);
  if(sum<=s) return 1;
  else return 0;
}
int main()
{
  int n,s,result;
  std::cin>>n>>s;
  int v[n];
  for(int i=0;i<n;i++)
    std::cin>>v[i];
  result=printresult(v,n,s);
  if(result==1)
    std::cout<<"YES";
  else
    std::cout<<"NO";
}