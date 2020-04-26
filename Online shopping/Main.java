#include<iostream>
using namespace std;
int main()
{
 int fa,fd,fs,sa,sd,ss,aa,ad,as;
  float fp,sp,ap;
  std::cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  //flipkart
  fp=fa-(fa*fd/100)+fs;
  //snapdeal
  sp=sa-(sa*sd/100)+ss;
  //amazon
  ap=aa-(aa*ad/100)+as;
  std::cout<<"In Flipkart Rs."<<fp<<"\nIn Snapdeal Rs."<<sp<<"\nIn Amazon Rs."<<ap;
  if(fp<=sp&&fp<ap)
    std::cout<<"\nHe will prefer Flipkart";
  else if(sp<ap)
    std::cout<<"\nHe will prefer Snapdeal";
  else
    std::cout<<"\nHe will prefer Amazon";
}