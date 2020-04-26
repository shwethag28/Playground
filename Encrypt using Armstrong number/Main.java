#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{ int m,j=0,num,result=0;
 m=n;
  while(m/10!=0)
{
  m/=10;
  j++;
}
  for(int i=0;i<j+1;i++)
  { num=n%10;
    result+= power(num,j+1);
    n/=10;
  }
 return result;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==n)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}