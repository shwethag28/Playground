#include<iostream>
using namespace std;
int main()
{
  int a,b,c,box,code,i;
  std::cin>>a>>b>>c;
  if((a>b&&a<c)||(a<b&&a>c)) box=a;
  if((b>c&&b<a)||(b<c&&b>a)) box=b;
  if((c>a&&c<b)||(c<a&&c>b)) box=c;
  std::cout<<"The treasure is in box which has number "<<box;
  int small;
  if(a<b&&a<c)
    small=a;
  else if(b<a&&b<c)
    small=b;
  else small=c; 
  for(i=small;i>0;i--)
  {
    if((a%i==0)&&(b%i==0)&&(c%i==0))
    {
      code=i;
      std::cout<<"\nThe code to open the box is "<<code;
      break;
    }
  }
}