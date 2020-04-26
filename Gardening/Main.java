#include<iostream>
using namespace std;
int main()
{
  int r,c,tree;
  int i,j;
  std::cin>>r>>c>>tree;
  for(i=r+1;i<=2*r;i++) {
    if(tree==i){
      std::cout<<"It is a mango tree";
      return 0; }
  }
  for(i=(r*r-r);i>(r*r-(2*r));i--){
    if(tree==i){
      std::cout<<"It is a mango tree";
    return 0; }
    else {
      std::cout<<"It is not a mango tree";
      break; }
  }
}